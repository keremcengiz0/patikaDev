package Pratik;

import java.util.Scanner;

public class EBOB_EKOK {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("n1 sayisini girin: ");
		int n1 = input.nextInt();

		System.out.print("n2 sayisini girin: ");
		int n2 = input.nextInt();

		int i = 1;
		int ebob = 0;
		while ((i <= n1) && (i <= n2)) {
			if (n1 % i == 0 && n2 % i == 0) {
				ebob = i;
			}
			i++;
		}
		
		int ekok = (n1 * n2) / ebob;
		
		System.out.println("EBOB: " + ebob);
		System.out.println("EKOK: " + ekok);
	}

}
