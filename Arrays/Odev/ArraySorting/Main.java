package Odev.ArraySorting;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Dizinin boyutu n: ");
		int n = input.nextInt();
		
		System.out.println("Dizinin elemanlarini giriniz: ");
		int[] numbers = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print((i+1) + ". Elemani: ");
			numbers[i] = input.nextInt();
		}
		
		Arrays.sort(numbers);
		
		System.out.print("Siralama: ");
		for(int num : numbers) {
			System.out.print( num + " ");
		}
	}

}
