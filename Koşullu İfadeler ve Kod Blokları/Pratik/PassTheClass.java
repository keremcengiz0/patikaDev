package Pratik;

import java.util.Scanner;

public class PassTheClass {

	public static void main(String[] args) {

		int mat, fizik, turkce, kimya, muzik, toplamNot = 0, sayac = 0;
		double avarage = 0f;
		
		Scanner input = new Scanner(System.in);

		System.out.print("Matematik notunu giriniz: ");
		mat = input.nextInt();

		if (mat >= 0 && mat <= 100) {
			toplamNot += mat;
			++sayac;
		} else {
			System.out.println("Not 0-100 araliginda olmadigindan ortalamaya dahil edilmeyecektir.");
		}

		System.out.print("Fizik notunu giriniz: ");
		fizik = input.nextInt();

		if (fizik >= 0 && fizik <= 100) {
			toplamNot += fizik;
			++sayac;
		} else {
			System.out.println("Not 0-100 araliginda olmadigindan ortalamaya dahil edilmeyecektir.");
		}

		System.out.print("Turkce notunu giriniz: ");
		turkce = input.nextInt();

		if (turkce >= 0 && turkce <= 100) {
			toplamNot += turkce;
			++sayac;
		} else {
			System.out.println("Not 0-100 araliginda olmadigindan ortalamaya dahil edilmeyecektir.");
		}

		System.out.print("Kimya notunu giriniz: ");
		kimya = input.nextInt();

		if (kimya >= 0 && kimya <= 100) {
			toplamNot += kimya;
			++sayac;
		} else {
			System.out.println("Not 0-100 araliginda olmadigindan ortalamaya dahil edilmeyecektir.");
		}

		System.out.print("Muzik notunu giriniz: ");
		muzik = input.nextInt();

		if (muzik >= 0 && muzik <= 100) {
			toplamNot += muzik;
			++sayac;
		} else {
			System.out.println("Not 0-100 araliginda olmadigindan ortalamaya dahil edilmeyecektir.");
		}

		avarage = toplamNot / sayac;

		if (avarage >= 55) {
			System.out.println("Tebrikler Gectiniz. Not ortalamaniz: " + avarage);
		} else {
			System.out.println("Maalesef Kaldiniz. Not ortalamaniz: " + avarage);
		}

	}

}
