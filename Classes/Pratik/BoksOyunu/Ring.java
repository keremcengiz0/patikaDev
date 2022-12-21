package Pratik.BoksOyunu;

public class Ring {
	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;

	public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
		this.f1 = f1;
		this.f2 = f2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
	}

	public void run1() {

		System.out.println(f1.name + " ve " + f2.name + " arasindaki mac basladi!");

		if (checkWeight()) {
			while (f1.health > 0 && f2.health > 0) {

				System.out.println("======== YENI ROUND ===========");

				f1.attack(f2);
				if (isWin()) {
					break;
				}

				f2.attack(f1);
				if (isWin()) {
					break;
				}
				printScore();
			}

		} else {
			System.out.println("Sporcularin agirliklari uyusmuyor.");
		}

	}

	public void run2() {

		System.out.println(f1.name + " ve " + f2.name + " arasindaki mac basladi!");

		if (checkWeight()) {
			while (f1.health > 0 && f2.health > 0) {
				System.out.println("======== YENI ROUND ===========");

				f2.attack(f1);
				if (isWin()) {
					break;
				}

				f1.attack(f2);
				if (isWin()) {
					break;
				}
				printScore();
			}

		} else {
			System.out.println("Sporcularin agirliklari uyusmuyor.");
		}

	}

	public boolean checkWeight() {
		return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
	}

	public boolean isWin() {
		if (f1.health <= 0) {
			System.out.println("Maci Kazanan : " + f2.name);
			return true;
		} else if (f2.health <= 0) {
			System.out.println("Maci Kazanan : " + f1.name);
			return true;
		}

		return false;
	}

	public void printScore() {
		System.out.println("------------");
		System.out.println(f1.name + " Kalan Can \t: " + f1.health);
		System.out.println(f2.name + " Kalan Can \t: " + f2.health);
	}

	public boolean whoIsTurn() { // if true f1 starts else f2 starts
		return Math.random() < 0.5 ? true : false;
	}
}
