package Pratik.HarmonikOrtalama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Kac sayi girmek istiyorsunuz? : ");
		int n = input.nextInt();
		double harmonicOrt = 0.0;

		int[] numbers = new int[n];

		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextInt();
			harmonicOrt += (1.0 / numbers[i]);
		}

		System.out.println(harmonicOrt);
	}

}
