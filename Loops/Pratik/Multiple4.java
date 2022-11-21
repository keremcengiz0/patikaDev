package Pratik;

import java.util.Scanner;

public class Multiple4 {

	public static void main(String[] args) {

		int number = 0, total = 0;

		Scanner input = new Scanner(System.in);

		while (number % 2 == 0) {
			System.out.print("Bir sayi giriniz: ");
			number = input.nextInt();

			if (number % 4 == 0) {
				total += number;
			}
		}

		System.out.print("Sayilarin toplami: " + total);

	}

}
