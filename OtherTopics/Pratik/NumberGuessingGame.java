package Pratik;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {

		Random rand = new Random();
		int number = rand.nextInt(101);

		Scanner input = new Scanner(System.in);
		int right = 0;
		int selected;
		int[] wrong = new int[5];
		boolean isWin = false;
		boolean isWrong = false;

		System.out.println(number);

		while (right < 5) {
			System.out.print("Lutfen tahmininizi giriniz : ");
			selected = input.nextInt();

			if (selected < 0 || selected > 100) {
				System.out.println("Lutfen 0-100 arasinda bir sayi girin!");

				if (isWrong) {
					right++;
					System.out.println("Cok fazla hatali giris yaptiniz. Kalan hak : " + (5 - right));
				} else {
					isWrong = true;
					System.out.println("Bir daha hatali girisinizde hakkinizdan dusulecektir.");
				}
				continue;
			}

			if (selected == number) {
				System.out.println("Tebrikler, dogru tahmin! Tahmin ettiginiz sayi: " + number);
				isWin = true;
				break;
			} else {

				System.out.println("Hatali bir sayi girdiniz!");
				wrong[right++] = selected;

				if (selected > number) {
					System.out.println(selected + " sayisi, gizli sayidan buyuktur!");
				} else {
					System.out.println(selected + " sayisi, gizli sayidan kucuktur!");
				}
				System.out.println("Kalan hakkiniz: " + (5 - right));
			}
		}

		if (!isWin) {
			System.out.println("Kaybettiniz! Dogru sayi: " + number + " olmaliydi!");
			if (!isWrong) {
				System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
			}
		}

	}

}
