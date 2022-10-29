package Pratik;

import java.util.Scanner;

public class HipotenusAndAreaCalculator {

	public static void main(String[] args) {
		int a, b;
		double c;
		int alan;

		Scanner input = new Scanner(System.in);
		System.out.print("a kenarini giriniz: ");
		a = input.nextInt();
		System.out.print("b kenarini giriniz: ");
		b = input.nextInt();

		c = Math.sqrt((Math.pow(a, 2)) + Math.pow(b, 2));
		alan = (a * b) / 2;
		System.out.println("Hipotenus: " + c);
		System.out.println("Alan: " + alan);

	}

}
