package Pratik;

import java.util.Scanner;

public class KDVCalculator {

	public static void printResult(double tutar, double kdvliTutar, double kdvTutar) {
		System.out.println("KDV'siz Fiyat: " + tutar);
		System.out.println("KDV'li Fiyat: " + kdvliTutar);
		System.out.println("KDV tutari: " + kdvTutar);
	}

	public static void main(String[] args) {

		double tutar = 0, kdvOran = 0;

		Scanner input = new Scanner(System.in);
		System.out.print("Ucret tutarini giriniz: ");
		tutar = input.nextDouble();

		if (tutar > 0 && tutar < 1000) {
			kdvOran = 0.18;
			double kdvTutar = tutar * kdvOran;
			double kdvliTutar = tutar + kdvTutar;
			printResult(tutar, kdvliTutar, kdvTutar);
		} else if (tutar >= 1000) {
			kdvOran = 0.08;
			double kdvTutar = tutar * kdvOran;
			double kdvliTutar = tutar + kdvTutar;
			printResult(tutar, kdvliTutar, kdvTutar);
		}

	}

}
