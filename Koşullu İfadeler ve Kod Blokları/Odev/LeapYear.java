package Odev;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		int year = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Lutfen yil giriniz: ");
		year = input.nextInt();

		if ((year % 4 == 0) && (year % 100 != 0)) {
			System.out.println(year + " bir artik yildir!");
		} else if ((year % 100 == 0) && (year % 400 == 0)) {
			System.out.println(year + " bir artik yildir!");
		} else {
            System.out.println(year + " bir artik yil degildir!");
        }
	}
}
