package lesson005;

import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {
		
		// sisteme giriş uygulaması
		
		Scanner scanner = new Scanner(System.in);
		/*
		String mailSekil ="";
		int index=0;
		int pass=123456789;
		
		System.out.println("Mail giriniz: ");
		String kelime = scanner.next().toLowerCase();
		
		for (int i = 0; i<kelime.length() ; i++) {
			if (kelime.charAt(i) == '@') {
				i++;
				mailSekil=kelime.substring(i);
				break;
			}
		}
		if(mailSekil.equals("outlook.com")||mailSekil.equals("hotmail.com")) {
			System.out.println("şifrenizi giriniz: ");
			int password1=scanner.nextInt();
			if(password1==pass) {
			System.out.println("şifrenizi tekrar giriniz: ");
			int password2=scanner.nextInt();
			System.out.println("Giriş Yaptınız"+ kelime);
			}else {
				System.out.println("şifrenizi giriniz: ");
				password1=scanner.nextInt();
			}		
	}*/
		
		boolean mailCheck=true;
		boolean passCheck=true;
		
		String emailFormat1="@hotmail.com";
		String emailFormat2="@outlook.com";
		
		
		while(mailCheck) {
			System.out.println("Mail Giriniz: ");
			String mail = scanner.nextLine();
			
			if(!mail.substring((mail.length() - 12)).equals(emailFormat1)|| mail.substring((mail.length() - 12)).equals(emailFormat2)) {
				System.out.println("Email formatına uygun değildir.");
			}else {
				while(passCheck) {
					System.out.println("Şifre Giriniz: ");
					String password = scanner.nextLine();
					System.out.println("Şifrenizi Tekrar Giriniz: ");
					String repassword = scanner.nextLine();
					if(password.equals(repassword)&& password.length()>=8) {
						System.out.println("Giriş Başarılı--> "+mail);
						mailCheck=false;
						passCheck=false;
					}else {
						System.out.println("Şifrelerde problem var.");
					}
				}
			}
			
		}
		
		
		
		
		
		
		
		
		
	}
}
