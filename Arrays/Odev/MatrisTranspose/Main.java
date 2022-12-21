package Odev.MatrisTranspose;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Kaca kac matris olusturmak istediginizi giriniz");
		System.out.print("n: ");
		int n = input.nextInt();
		System.out.print("k: ");
		int k = input.nextInt();

		int[][] matris = new int[n][k];
		int[][] transpose = new int[k][n];

		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j <= matris.length; j++) {
				matris[i][j] = input.nextInt();
			}
		}

		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j <= matris.length; j++) {
				transpose[j][i] = matris[i][j];
			}
		}

		for (int i = 0; i < transpose.length; i++) {
			for (int j = 0; j < transpose[0].length; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}

	}

}