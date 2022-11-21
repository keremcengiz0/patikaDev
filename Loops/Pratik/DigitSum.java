package Pratik;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Sayiyi girin: ");
		int number = input.nextInt();
		int total = 0;
		
		String lengthOfNumber = Integer.toString(number);
		int i = lengthOfNumber.length();
		
		while(i>=0) {
			total = total + (number % 10);
			i--;
			number /= 10;
		}
		System.out.println("Sonuc: " + total);
	}

}
