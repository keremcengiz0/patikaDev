package Odev.ArrayFrequency;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		//int[] dizi = { 10, 20, 20, 10, 10, 20, 5, 20 };
		int[] dizi = { 10, 20, 20, 10, 10, 20, 5, 20, 5, 4 ,4 ,4 ,2 ,1 ,2 ,1};
		
		Set<Integer> list = new HashSet<>();

		int sayac = 0;

		for (int i = 0; i < dizi.length; i++) {
			sayac = 0;
			int karsilastirilanSayi = dizi[i];

			if (list.contains(karsilastirilanSayi)) {
				continue;
			}

			for (int j = 0; j < dizi.length; j++) {
				if ((i != j) && dizi[i] == dizi[j]) {
					sayac++;
					list.add(dizi[i]);
				}
			}

			System.out.println(dizi[i] + " sayisi " + (sayac + 1) + " kere tekrar edildi.");

		}

	}

}
