package Pratik;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {

		int r, alfa;
		double pi = 3.14;

		Scanner input = new Scanner(System.in);
		System.out.print("Yaricap giriniz: ");
		r = input.nextInt();
		System.out.print("Merkez acisinin olcusunu giriniz: ");
		alfa = input.nextInt();

		double alan = (pi * Math.pow(r, 2) * alfa) / 360;
		double cevre = 2 * pi * r;

		System.out.println("Dairenin alani: " + alan);
		System.out.println("Dairenin cevresi: " + cevre);

	}

}
