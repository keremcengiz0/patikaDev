package Pratik;

import java.util.Scanner;

public class PowCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Ussu alinacak sayiyi girin: ");
		int n = input.nextInt();
		System.out.print("Us olacak sayiyi girin: ");
		int k = input.nextInt();

		int total = 1;
		int i = 1;

		while (i <= k) {
			total *= n;
			i++;
		}

		System.out.println("Sonuc: " + total);

	}

}
