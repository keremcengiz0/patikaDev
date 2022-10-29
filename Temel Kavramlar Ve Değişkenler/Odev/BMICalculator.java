package Odev;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {

		double boy, kilo, bmi;
		Scanner input = new Scanner(System.in);

		System.out.print("Lutfen boyunuzu (metre cinsinden) giriniz: ");
		boy = input.nextDouble();
		System.out.print("Lutfen kilonuzu giriniz: ");
		kilo = input.nextDouble();

		bmi = (kilo / Math.pow(boy, 2));
		System.out.println("Vucut kitle indeksiniz: " + bmi);
	}

}
