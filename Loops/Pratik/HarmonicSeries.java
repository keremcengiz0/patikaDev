package Pratik;

import java.util.Scanner;

public class HarmonicSeries {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n sayisini girin: ");
		int n = input.nextInt();

		double result = 0f;
		for (int i = 1; i <= n; i++) {
			result += (1.0 / i);
		}
		System.out.println(result);
	}

}
