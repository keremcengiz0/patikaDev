package Odev;

import java.util.Scanner;

public class PrimeNumberRecursive {

	public static void main(String[] args) {
		int choice;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Sayi : ");
			int number = scanner.nextInt();
			isPrime(number, 2);
			System.out.println("Devam Etmek Ister misiniz ? (1- Evet / 2- Hayir)");
			choice = scanner.nextInt();
		} while (choice != 2);
	}

	static boolean isPrime(int number, int m) {
		if (m == number) {
			System.out.println(number + " sayisi asaldir.");
			return true;
		} else if (number % m == 0) {
			System.out.println(number + " sayisi asal degildir.");
			return false;
		}
		return isPrime(number, m + 1);
	}

}
