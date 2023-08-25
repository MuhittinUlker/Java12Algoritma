package lesson010;

import java.util.Scanner;

public class Question56 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		// register() methodu
		// email ve şifre ile login yapılacak
		// email---> @hotmail ve @outlook uzantıları kabul edilecek
		// pass ve repass aynı ise
		// email ve pass doğru olması gerekecek
		// emailChech() passwordCheck()

		register();

	}

	public static void register() {
		if (emailCheck() && passCheck()) {
			System.out.println("Kayıt Başarılı");
		}
	}

	public static boolean emailCheck() {
		String hotmail = "hotmail.com";
		String outlook = "outlook.com";
		String girilenMail = mailAl();
		int index = 0;
		String mailSekil = "";
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
				girilenMail = scanner.nextLine().toLowerCase();
			} else {
				return true;
			}
		}
	}

	public static boolean passCheck() {
		for (;;) {
			String password1 = passAl();
			String password2 = rePassAl();
			if (!(password1.equals(password2))) {
				System.out.println("Şifreleriniz uyuşmuyor!");
				continue;
			} else
				return true;
		}
	}

	public static String mailAl() {
		System.out.println("Mail adresinizi girin: ");
		String girilenMail = scanner.nextLine();
		return girilenMail;
	}

	public static String passAl() {
		System.out.println("Şifrenizi giriniz: ");
		String password1 = scanner.nextLine();
		return password1;
	}

	public static String rePassAl() {
		System.out.println("Şifrenizi tekrar giriniz: ");
		String password2 = scanner.nextLine();
		return password2;
	}
}
