package Pratik;

import java.util.Scanner;

public class Palindrome {

	public static boolean isPalindrome(String str) {

		String newStr = "";

		for (int i = str.length()-1 ; i >= 0; i--) {
			newStr += str.charAt(i);
		}

		if (newStr.equals(str)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Bir kelime giriniz: ");
		String word = input.nextLine();
		
		if(isPalindrome(word)) {
			System.out.println(word + " kelimesi bir palindromdur!");
		} else {
			System.out.println(word + " kelimesi bir palindrom degildir!");
		}

	}

}
