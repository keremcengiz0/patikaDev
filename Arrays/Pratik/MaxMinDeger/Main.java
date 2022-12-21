package Pratik.MaxMinDeger;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Kac sayi girmek istiyorsunuz? : ");
		int n = input.nextInt();

		int[] numbers = new int[n];

		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextInt();
		}

		Arrays.sort(numbers);

		System.out.print("Bir sayi giriniz: ");
		int sayi = input.nextInt();
		System.out.println("Girilen sayi: " + sayi);
		boolean triggers = false;

		for (int i = 0; i < numbers.length; i++) {
			if (sayi < numbers[i]) {
				triggers = true;
			}

			if (triggers) {
				System.out.println("Girilen sayidan kucuk en yakin sayi: " + numbers[i - 1]);
				System.out.println("Girilen sayidan buyuk en yakin sayi: " + numbers[i]);
				break;
			}
		}

	}

}
