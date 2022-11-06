package Odev;

import java.util.Scanner;

public class TicketCalculator {

	public static void main(String[] args) {

		double km, OdenecekUcret, kmbasiucret;
		int tip, yas;

		Scanner input = new Scanner(System.in);

		System.out.print("Lutfen kac km gideceginizi yaziniz: ");
		km = input.nextDouble();

		kmbasiucret = km * 0.10;

		System.out.println("1-Tek Yon\n2-Gidis-Donus");
		System.out.print("Lutfen gidis tipini seciniz: ");
		tip = input.nextInt();

		System.out.print("Lutfen Yasinizi giriniz: ");
		yas = input.nextInt();

		if (tip == 1) {

			if ((yas >= 0) && (yas < 12)) {
				OdenecekUcret = kmbasiucret * 0.5;
				System.out.print("Odeyeceginiz Tutar: " + OdenecekUcret + "TL");
			} else if ((yas >= 12) && (yas <= 24)) {
				OdenecekUcret = kmbasiucret * 0.9;
				System.out.print("Odeyeceginiz Tutar: " + OdenecekUcret + "TL");

			} else if (yas > 24 && yas < 65) {
				OdenecekUcret = kmbasiucret;
				System.out.print("Odeyeceginiz Tutar: " + OdenecekUcret + "TL");
			} else if (yas >= 65) {
				OdenecekUcret = kmbasiucret * 0.7;
				System.out.print("Odeyeceginiz Tutar: " + OdenecekUcret + "TL");
			} else {
				System.out.print("Hatalı Islem Yapildi! Lutfen Tekrar Deneyiniz.");
			}

		} else if (tip == 2) {

			if ((yas >= 0) && (yas < 12)) {
				OdenecekUcret = (2 * kmbasiucret) * 0.5 * 0.8;
				System.out.print("Odeyeceginiz Tutar: " + OdenecekUcret + "TL");

			} else if ((yas >= 12) && (yas <= 24)) {
				OdenecekUcret = (2 * kmbasiucret) * 0.9 * 0.8;
				System.out.print("Odeyeceginiz Tutar: " + OdenecekUcret + "TL");

			} else if (yas > 24 && yas < 65) {
				OdenecekUcret = 2*kmbasiucret;
				System.out.print("Odeyeceginiz Tutar: " + OdenecekUcret + "TL");
			} else if (yas >= 65) {
				OdenecekUcret = (2 * kmbasiucret) * 0.7 * 0.8;
				System.out.print("Odeyeceginiz Tutar: " + OdenecekUcret + "TL");
			} else {
				System.out.print("Hatalı Islem Yapildi! Lutfen Tekrar Deneyiniz.");
			}

		} else {
			System.out.print("Hatalı Islem Yapildi! Lutfen Tekrar Deneyiniz.");
		}

	}
}
