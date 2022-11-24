package Odev;

import java.util.Scanner;

public class PatternMethod {

	   public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Sayi giriniz : ");
	        int number = input.nextInt();

	        pattern(number, number, 0);
	    }

	    static void pattern(int number, int temp, int step) {
	        if (number > 0 && step == 0) {
	            System.out.print(number + " ");
	            number -= 5;
	            pattern(number, temp, 0);
	        } else if (number <= 0) {
	            System.out.print(number + " ");
	            number += 5;
	            pattern(number, temp, 1);
	        } else if (number > 0 && number <= temp && step == 1) {
	            System.out.print(number + " ");
	            number += 5;
	            pattern(number, temp, 1);
	        }
	    }

}
