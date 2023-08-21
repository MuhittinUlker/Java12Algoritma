package lesson005;

import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {

		// sisteme giriş uygulaması

		// çözüm1:

		/*
		 * boolean mailCheck=true; boolean passCheck=true;
		 * 
		 * String emailFormat1="@hotmail.com"; String emailFormat2="@outlook.com";
		 * 
		 * 
		 * while(mailCheck) { System.out.println("Mail Giriniz: "); String mail =
		 * scanner.nextLine();
		 * 
		 * if(!mail.substring((mail.length() - 12)).equals(emailFormat1)||
		 * mail.substring((mail.length() - 12)).equals(emailFormat2)) {
		 * System.out.println("Email formatına uygun değildir."); }else {
		 * while(passCheck) { System.out.println("Şifre Giriniz: "); String password =
		 * scanner.nextLine(); System.out.println("Şifrenizi Tekrar Giriniz: "); String
		 * repassword = scanner.nextLine(); if(password.equals(repassword)&&
		 * password.length()>=8) { System.out.println("Giriş Başarılı--> "+mail);
		 * mailCheck=false; passCheck=false; }else {
		 * System.out.println("Şifrelerde problem var."); } } }
		 * 
		 * }
		 */

		Scanner scanner = new Scanner(System.in);

		String mailSekil = "";
		String hotmail = "hotmail.com";
		String outlook = "outlook.com";
		int index = 0;

		System.out.println("Mail giriniz: ");
		String girilenMail = scanner.next().toLowerCase();

		for (;;) {

			for (int i = 0; i < girilenMail.length(); i++) {

				if (girilenMail.charAt(i) == '@') {
					index = i + 1;
					mailSekil = girilenMail.substring(index);
					break;
				}
			}

			if (!(mailSekil.equals(hotmail) || mailSekil.equals(outlook))) {
				System.out.println("Hatalı mail girdiniz!");
				System.out.println("Mail giriniz: ");
				girilenMail = scanner.next().toLowerCase();
			} else {
				break;
			}
		}
		donguBitir:
		for (;;) {
			
			System.out.println("Şifrenizi giriniz: ");
			String password1 = scanner.next();

			for (;;) {
				
				if (password1.length() < 8) {
					System.out.println("Şifreniz 8 karakterden kısa olamaz!");
					System.out.println("Şifrenizi giriniz: ");
					password1 = scanner.next();
				}
				System.out.println("Şifrenizi tekrar giriniz: ");
				String password2 = scanner.next();

				if (!(password1.equals(password2))) {
					System.out.println("Şifreleriniz uyuşmuyor!");
					break;
				} else {
					System.out.println("Giriş Başarılı -> " + girilenMail);
				}break donguBitir;
			}
		}
	}
}

