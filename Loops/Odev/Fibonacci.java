package Odev;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Istenilen Fibonacci serisinin elaman sayisini giriniz: ");
		int n = input.nextInt();
		int fib1 = 0, fib2 = 1, nextFib;

		System.out.print(fib1 + " " + fib2);

		for (int i = 2; i < n; i++) {
			nextFib = fib1 + fib2;
			System.out.print(" " + nextFib);
			fib1 = fib2;
			fib2 = nextFib;
		}
	}

}
