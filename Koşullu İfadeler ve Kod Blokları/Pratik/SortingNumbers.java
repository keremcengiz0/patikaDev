package Pratik;

import java.util.Scanner;

public class SortingNumbers {

	public static void main(String[] args) {

		int a, b, c;
		Scanner input = new Scanner(System.in);

		System.out.print("a sayisini giriniz: ");
		a = input.nextInt();

		System.out.print("b sayisini giriniz: ");
		b = input.nextInt();

		System.out.print("c sayisini giriniz: ");
		c = input.nextInt();

		if (a >= b) {
			if (b >= c)
				System.out.print("Siralamalar: " + c + " " + b + " " + a);

			else if (c >= a)
				System.out.print("Siralamalar: " + b + " " + a + " " + c);

			else if (a > c)
				System.out.print("Siralamalar: " + b + " " + c + " " + a);
		}

		if (b > a) {
			if (c >= b)
				System.out.print("Siralamalar: " + a + " " + b + " " + c);
			else if (c >= a)
				System.out.print("Siralamalar: " + a + " " + c + " " + b);
			else if (a > c)
				System.out.print("Siralamalar: " + c + " " + a + " " + b);
		}

	}
}
