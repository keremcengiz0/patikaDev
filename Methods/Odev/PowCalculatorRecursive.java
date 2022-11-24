package Odev;

import java.util.Scanner;

public class PowCalculatorRecursive {

	public static void main(String[] args) {
		
		int choice;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Taban Sayisi : ");
			int base = scanner.nextInt();
			System.out.print("Us Sayisi : ");
			int exponent = scanner.nextInt();
			System.out.println("Sonuc : " + power(base, exponent));
			System.out.println("Devam Etmek Ister misiniz ? (1- Evet / 2- Hayir)");
			choice = scanner.nextInt();
		} while (choice == 1);

	}

	static int power(int base, int exponent) {
		int result = 1;
		
		for (int i = 1; i <= exponent; i++) {
			result *= base;
		}
		return result;
	}
}
