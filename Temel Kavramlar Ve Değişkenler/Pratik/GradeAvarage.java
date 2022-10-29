package Pratik;

import java.util.Scanner;

public class GradeAvarage {

	public static void main(String[] args) {

		int mat, fizik, kimya, turkce, tarih, muzik;
		double total;

		Scanner input = new Scanner(System.in);

		System.out.print("Matematik notunuz: ");
		mat = input.nextInt();

		System.out.print("Fizik notunuz: ");
		fizik = input.nextInt();

		System.out.print("Kimya notunuz: ");
		kimya = input.nextInt();

		System.out.print("Turkce notunuz: ");
		turkce = input.nextInt();

		System.out.print("Tarih notunuz: ");
		tarih = input.nextInt();

		System.out.print("Muzik notunuz: ");
		muzik = input.nextInt();

		total = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
		System.out.print("Ortalamaniz: " + total);

		boolean isValid = (total > 60);

		String result = isValid ? "Sinifi Gecti" : "Sinifta Kaldi";
		System.out.print(" " + result);
	}

}
