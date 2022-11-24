package Pratik;

import java.util.Scanner;

public class AdvancedCalculator {

	static void plus() {
		Scanner scan = new Scanner(System.in);
		int number, result = 0, i = 1;
		while (true) {
			System.out.print(i++ + ". sayi :");
			number = scan.nextInt();
			if (number == 0) {
				break;
			}
			result += number;
		}
		System.out.println("Sonuc : " + result);
	}

	static void minus() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Kac adet sayi gireceksiniz :");
		int counter = scan.nextInt();
		int number, result = 0;

		for (int i = 1; i <= counter; i++) {
			System.out.print(i + ". sayi :");
			number = scan.nextInt();
			if (i == 1) {
				result += number;
				continue;
			}
			result -= number;
		}

		System.out.println("Sonuc : " + result);
	}

	static void times() {
		Scanner scan = new Scanner(System.in);
		int number, result = 1, i = 1;

		while (true) {
			System.out.print(i++ + ". sayi :");
			number = scan.nextInt();

			if (number == 1)
				break;

			if (number == 0) {
				result = 0;
				break;
			}
			result *= number;
		}

		System.out.println("Sonuc : " + result);
	}

	static void divided() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Kac adet sayi gireceksiniz :");
		int counter = scan.nextInt();
		double number, result = 0.0;

		for (int i = 1; i <= counter; i++) {
			System.out.print(i + ". sayi :");
			number = scan.nextDouble();
			if (i != 1 && number == 0) {
				System.out.println("Boleni 0 giremezsiniz.");
				continue;
			}
			if (i == 1) {
				result = number;
				continue;
			}
			result /= number;
		}

		System.out.println("Sonuc : " + result);
	}

	static void power() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Taban degeri giriniz :");
		int base = scan.nextInt();
		System.out.print("Us degeri giriniz :");
		int exponent = scan.nextInt();
		int result = 1;

		for (int i = 1; i <= exponent; i++) {
			result *= base;
		}

		System.out.println("Sonuc : " + result);
	}

	static void factorial() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayi giriniz :");
		int n = scan.nextInt();
		int result = 1;

		for (int i = 1; i <= n; i++) {
			result *= i;
		}

		System.out.println("Sonuc : " + result);
	}

	static void modAlma() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sayiyi Giriniz : ");
		int number = scanner.nextInt();
		System.out.print("Mod Sayisini Giriniz : ");
		int mod = scanner.nextInt();
		int result = number % mod;
		System.out.println("Sonuc : " + result);
	}

	static void rectangle() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kisa Kenari Giriniz : ");
		int shortSide = scanner.nextInt();
		System.out.print("Uzun Kenari Giriniz : ");
		int longSide = scanner.nextInt();
		int area = shortSide * longSide;
		int perimeter = 2 * (shortSide + longSide);
		System.out.println("Alan : " + area);
		System.out.println("Cevre : " + perimeter);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int select;
		String menu = "1- Toplama Islemi\n" + "2- Cikarma Islemi\n" + "3- Carpma Islemi\n" + "4- Bolme Islemi\n"
				+ "5- Uslu Sayi Hesaplama\n" + "6- Faktoriyel Hesaplama\n" + "7- Mod Alma\n"
				+ "8- Dikdortgen Alan ve Cevre Hesabi\n" + "0- Cikis Yap";

		do {
			System.out.println(menu);
			System.out.print("Lutfen bir islem seciniz :");
			select = scan.nextInt();
			switch (select) {
			case 1:
				plus();
				break;
			case 2:
				minus();
				break;
			case 3:
				times();
				break;
			case 4:
				divided();
				break;
			case 5:
				power();
				break;
			case 6:
				factorial();
				break;
			case 7:
				modAlma();
				break;
			case 8:
				rectangle();
				break;
			case 0:
				break;
			default:
				System.out.println("Yanlis bir deger girdiniz, tekrar deneyiniz.");
			}
		} while (select != 0);

	}

}
