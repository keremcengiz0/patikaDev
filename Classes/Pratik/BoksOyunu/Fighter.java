package Pratik.BoksOyunu;

import java.util.Random;

public class Fighter {

	String name;
	int health;
	int weight;

	public Fighter(String name, int health, int weight) {
		this.name = name;
		this.health = health;
		this.weight = weight;
	}

	public void attack(Fighter foe) {

		Random random = new Random();

		int damage = random.nextInt(21);
		int dodge = random.nextInt(21);
		int totalHits = damage - dodge;

		if (damage > dodge) {
			foe.health -= totalHits;
			System.out.println(this.name + " " + foe.name + "'e " + totalHits + " hasar vurdu!");
		} else {
			System.out.println(foe.name + " saldiriyi savurdu!");
		}
	}

	public void displayHealth() {
		System.out.println(this.name + "'in " + this.health + " cani kaldi.");
	}

}
