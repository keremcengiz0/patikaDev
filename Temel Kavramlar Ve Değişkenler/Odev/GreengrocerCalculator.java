package Odev;

import java.util.Scanner;

public class GreengrocerCalculator {

	public static void main(String[] args) {

		double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;

		double a, e, d, m, p, total;

		Scanner input = new Scanner(System.in);

		System.out.print("Armut Kac kilo ? : ");
		a = input.nextDouble();
		System.out.print("Elma Kac Kilo ? : ");
		e = input.nextDouble();
		System.out.print("Domates Kac Kilo ? : ");
		d = input.nextDouble();
		System.out.print("Muz Kac Kilo ? : ");
		m = input.nextDouble();
		System.out.print("Patlican Kac Kilo ? : ");
		p = input.nextDouble();

		total = (a * armut) + (e * elma) + (d * domates) + (m * muz) + (p * patlican);

		System.out.print("Toplam Tutar :  " + total + "TL");

	}

}
