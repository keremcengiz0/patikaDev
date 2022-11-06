package Pratik;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("1. Sayiyi giriniz: ");
		int sayi1 = input.nextInt();
		System.out.print("2. Sayiyi giriniz: ");
		int sayi2 = input.nextInt();

		System.out.println("****ISLEMINIZI SECINIZ***");
		System.out.println("1. TOPLAMA");
		System.out.println("2. CIKARMA");
		System.out.println("3. CARPMA");
		System.out.println("4. BOLME");

		System.out.print("Secimininizi giriniz: ");
		int secim = input.nextInt();

		switch (secim) {
		case 1:
			System.out.println("Toplama isleminin sonucu = " + (sayi1 + sayi2));
			break;
		case 2:
			System.out.println("Cikarma isleminin sonucu = " + (sayi1 - sayi2));
			break;
		case 3:
			System.out.println("Carpma isleminin sonucu = " + (sayi1 * sayi2));
			break;
		case 4:
			if (sayi2 != 0) {
				System.out.println("Bolme isleminin sonucu = " + (float) sayi1 / sayi2);
			} else {
				System.out.println("Sayi 0'a bolunemez.");
			}
			break;
		default:
			System.out.println("Gecersiz islem yaptiniz.");
		}
	}
}
