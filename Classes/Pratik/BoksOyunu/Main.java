package Pratik.BoksOyunu;

public class Main {
	public static void main(String[] args) {

		Fighter f1 = new Fighter("Kerem", 100, 75);
		Fighter f2 = new Fighter("Huseyin", 100, 80);

		Ring match = new Ring(f1, f2, 70, 850);

		if (match.whoIsTurn()) {
			System.out.println(f1.name + " kavgaya basliyor.");
			System.out.println();
			match.run1();
		} else {
			System.out.println(f2.name + " kavgaya basliyor.");
			System.out.println();
			match.run2();
		}

	}
}
