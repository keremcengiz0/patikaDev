package Odev;

import java.util.Scanner;

public class MaxMinNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Kac sayi gireceksiniz: ");
		int n = input.nextInt();
		int max = 0, min = 0;

		for (int i = 0; i < n; i++) {

			System.out.print("Sayiyi girin: ");
			int number = input.nextInt();

			if (i == 0) {
				max = number;
				min = number;
			}

			if (number > max) {
				max = number;
			} else if (number < min) {
				min = number;
			}
		}
		System.out.println("Min: " + min + "\nMax: " + max);
	}

}
