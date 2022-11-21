package Pratik;

import java.util.Scanner;

public class CombinationCalculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n, r, nTotal = 1, rTotal = 1, NminusRTotal = 1, kombinasyon;

		System.out.print("Kombinasyonun hesabi icin n sayisini giriniz: ");
		n = input.nextInt();
		System.out.print("Kombinasyonun hesabi icin r sayisini giriniz: ");
		r = input.nextInt();

		for (int i = 1; i <= n; i++) {
			nTotal = nTotal * i;
		}

		for (int i = 1; i <= r; i++) {
			rTotal = rTotal * i;
		}

		for (int i = 1; i <= n - r; i++) {
			NminusRTotal = NminusRTotal * i;
		}

		kombinasyon = nTotal / (rTotal * NminusRTotal);
		System.out.println(kombinasyon);

	}

}
