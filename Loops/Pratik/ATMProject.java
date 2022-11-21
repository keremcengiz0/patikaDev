package Pratik;

import java.util.Scanner;

public class ATMProject {

	public static void main(String[] args) {
		String userName, password;
		Scanner input = new Scanner(System.in);
		int right = 3;
		int balance = 1500;
		int select;
		int price;
		while (right > 0) {
			System.out.print("Kullanici Adiniz :");
			userName = input.nextLine();
			System.out.print("Parolaniz : ");
			password = input.nextLine();

			if (userName.equals("patika") && password.equals("dev123")) {
				System.out.println("Merhaba, Kodluyoruz Bankasina Hosgeldiniz!");
				do {
					System.out.println("1-Para yatirma\n" + "2-Para Cekme\n" + "3-Bakiye Sorgula\n" + "4-Cikis Yap");
					System.out.print("Lutfen yapmak istediginiz islemi seciniz : ");
					select = input.nextInt();
					switch (select) {
					case 1:
						System.out.print("Para miktari : ");
						price = input.nextInt();
						balance += price;
						break;
					case 2:
						System.out.print("Para miktari : ");
						price = input.nextInt();
						if (price > balance) {
							System.out.println("Bakiye yetersiz.");
						} else {
							balance -= price;
						}
						break;
					case 3:
						System.out.println("Bakiyeniz : " + balance);
					}
				} while (select != 4);
				System.out.println("Tekrar gorusmek uzere.");
				break;
			} else {
				right--;
				System.out.println("Hatali kullanici adi veya sifre. Tekrar deneyiniz.");
				if (right == 0) {
					System.out.println("Hesabiniz bloke olmustur lutfen banka ile iletisime geciniz.");
				} else {
					System.out.println("Kalan Hakkiniz : " + right);
				}
			}
		}

	}

}
