package Pratik;

import java.util.Scanner;

public class PowOfFourAndFive {

	public static void main(String[] args) {
		int number, four = 4, five = 5;
		Scanner input = new Scanner(System.in);
		System.out.print("Lutfen kacinci sayiya kadar kuvvetini almak istediginizi girin: ");
		number = input.nextInt();

		if (number == 0) {
			System.out.println("4'un 0.kuvveti: " + 1);
			System.out.println("5'in 0.kuvveti: " + 1);
		} else if (number > 0) {
			System.out.print(1 + " ");

			for (int i = 1; i <= number; i++) {
				System.out.print(four + " ");
				four *= 4;

			}

			System.out.println();
			
			System.out.print(1 + " ");
			for (int i = 1; i <= number; i++) {
				System.out.print(five + " ");
				five *= 5;

			}

		}

	}

}
