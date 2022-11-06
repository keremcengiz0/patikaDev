package Pratik;

import java.util.Scanner;

public class ZodiacSign {

	public static void main(String[] args) {
		String ay;
		int gun;
		String burc = "";

		Scanner input = new Scanner(System.in);

		System.out.print("Lutfen dogdugunuz ayi yaziniz: ");
		ay = input.next();

		System.out.print("Lutfen dogdugunuz gunu yaziniz: ");
		gun = input.nextInt();

		if (ay.equalsIgnoreCase("Ocak")) {
			if (gun > 22)
				burc = "Kova";
			else
				burc = "Oglak";
		}

		if (ay.equalsIgnoreCase("Subat")) {
			if (gun > 20)
				burc = "Balık";
			else
				burc = "Kova";
		}

		if (ay.equalsIgnoreCase("Mart")) {
			if (gun > 21)
				burc = "Koc";
			else
				burc = "Balık";
		}

		if (ay.equalsIgnoreCase("Nisan")) {
			if (gun > 21)
				burc = "Boga";
			else
				burc = "Koc";
		}

		if (ay.equalsIgnoreCase("Mayıs")) {
			if (gun > 22)
				burc = "Ikizler";
			else
				burc = "Boga";
		}

		if (ay.equalsIgnoreCase("Haziran")) {
			if (gun > 23)
				burc = "Yengec";
			else
				burc = "Ikizler";
		}

		if (ay.equalsIgnoreCase("Temmuz")) {
			if (gun > 23)
				burc = "Aslan";
			else
				burc = "Yengec";
		}

		if (ay.equalsIgnoreCase("Agustos")) {
			if (gun > 23)
				burc = "Basak";
			else
				burc = "Aslan";
		}

		if (ay.equalsIgnoreCase("Eylul")) {
			if (gun > 23)
				burc = "Terazi";
			else
				burc = "Basak";
		}

		if (ay.equalsIgnoreCase("Ekim")) {
			if (gun > 23)
				burc = "Akrep";
			else
				burc = "Terazi";
		}

		if (ay.equalsIgnoreCase("Kasım")) {
			if (gun > 22)
				burc = "Yay";
			else
				burc = "Akrep";
		}

		if (ay.equalsIgnoreCase("Aralık")) {
			if (gun > 22)
				burc = "Oglak";
			else
				burc = "Yay";
		}

		System.out.println(gun + " " + ay + " " + "dogumluysaniz burcunuz " + burc + " olur");

	}

}
