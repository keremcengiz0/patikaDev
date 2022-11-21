package Pratik;

import java.util.Scanner;

public class ThreeAndFourDivision {

	public static void main(String[] args) {

		int sayi, counter = 0, toplam = 0;

		Scanner input = new Scanner(System.in);
		sayi = input.nextInt();

		if (sayi % 12 == 0) {
			for (int i = 12; i <= sayi; i += 12) {
				toplam = i + toplam;
				counter++;
			}
			System.out.println("Ortalama: " + (toplam / counter));
		} else {
			System.out.println("Sayi 4 ve 3 'e tam bolunmuyor.");
		}

	}

}
