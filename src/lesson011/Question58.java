package lesson011;

/*
 * bu sınıf içerisinde seçenekler arrayi olacak
 * array içerisinde {TAŞ,KAĞIT,MAKAS}
 * 
 * pc random bir index üretip
 * 
 * 
 * 
 * 
 */
import java.util.Random;
import java.util.Scanner;

public class Question58 {

	static String[] secenekler = { "TAŞ", "KAĞIT", "MAKAS" };
	static Random rnd = new Random();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		// Taş Kağıt Makas Uygulaması

		sonuc();

	}

	public static String pcSecim() {
		int index = rnd.nextInt(secenekler.length);
		return secenekler[index];

	}

	public static String secimYap() {

		int secim = secimKontrol();

		return secenekler[secim - 1];
	}

	public static int oyun(String pcSecim, String secim) {

		if (pcSecim.equals(secim)) {
			System.out.print("Berabere ===> ");
			System.out.println("PC: " + pcSecim + " Siz: " + secim);
			return 0;

		} else if ((pcSecim == "TAŞ" && secim == "KAĞIT") || (pcSecim == "KAĞIT" && secim == "MAKAS")
				|| (pcSecim == "MAKAS" && secim == "TAŞ")) {
			System.out.print("Kazandınız. ===> ");
			System.out.println("PC: " + pcSecim + " Siz: " + secim);
			return 1;

		} else {
			System.out.print("Kaybettiniz. ===> ");
			System.out.println("PC: " + pcSecim + " Siz: " + secim);
			return -1;
		}
	}

	public static int secimKontrol() {

		for (;;) {
			for (int i = 0; i < secenekler.length; i++) {
				System.out.println((i + 1) + "-" + secenekler[i]);
			}
			System.out.print("Seçiminizi yapın: ");
			int insanSecim = scanner.nextInt();
			if (insanSecim >= 1 && insanSecim <= 3) {
				return insanSecim;
			} else {
				System.out.println("Geçersiz Seçim Girdiniz...");
			}
		}
	}

	public static void sonuc() {
		int pc = 0;
		int user = 0;
		cikis: for (;;) {

			int sonuc = oyun(pcSecim(), secimYap());
			if (sonuc == 1) {
				user++;
			} else if (sonuc == -1) {
				pc++;
			}
			if (user >= 3 || pc >= 3) {
				break cikis;
			} else {
				System.out.println("PC: " + pc + " USER: " + user);
			}
		}
		System.out.println("PC: " + pc + " USER: " + user);
		if (pc < user) {
			System.out.println("Kazandınız !!");

		} else {
			System.out.println("Kaybettiniz :(");
		}
	}

}
