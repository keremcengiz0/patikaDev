package Pratik;

import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
		String userName, password;
		Scanner input = new Scanner(System.in);
		String passwordChange;
		String systemUserName = "patika";
		String systemPassword = "java123";

		System.out.print("Kullanici adini giriniz: ");
		userName = input.nextLine();
		System.out.print("Sifrenizi giriniz: ");
		password = input.nextLine();

		if (userName.equals(systemUserName) && password.equals(systemPassword)) {
			System.out.println("Giris yaptiniz.");
		} else if (password.equals(password)) {
			System.out.println("Sifreniz yanlis. Sifrenizi degistirmek ister misiniz?");
			passwordChange = input.nextLine();
			if (passwordChange.toLowerCase().equals("yes")) {
				System.out.print("Yeni sifrenizi giriniz: ");
				password = input.nextLine();
				systemPassword = password;
			} else {
				System.out.println("Bilgileriniz yanlis.");
			}
		}
		System.out.println("Sifre basariyla degistirildi.");
	}

}
