package Pratik;

import java.util.Scanner;

public class PalindromNumber {

	public static boolean isPalindrome(Integer number) {

		int length = number.toString().length();
		String strToNumber = number.toString();
		String newNumber = "";

		for (int i = length - 1; i >= 0; i--) {
			newNumber += strToNumber.charAt(i);
		}

		if (strToNumber.equals(newNumber)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Integer number = input.nextInt();

		if (isPalindrome(number)) {
			System.out.println(number + " bir palindrom sayidir");
		} else {
			System.out.println(number + " bir palindrom sayi degildir");
		}

	}

}
