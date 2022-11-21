package Odev;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Bir sayi giriniz: ");
		int number = input.nextInt();
		int total = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total += i;
			}
		}

		if (total == number) {
			System.out.println(number + " bir mukemmel sayidir.");
		} else {
			System.out.println(number + " bir mukemmel sayi degildir.");
		}
	}

}
