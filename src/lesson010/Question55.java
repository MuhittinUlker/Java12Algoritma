package lesson010;

import java.util.Scanner;

public class Question55 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		// doğum yılını girerek yaşı ve hangi yy.da doğduğunu
		// hesaplayan metodları yazalım

		// kullaniciBilgileriGoster() metodu çağırıldığında
		// hem yy.da doğduğunu hemde yaşını söyleyecek

		kullaniciBilgileriGoster();

	}

	public static void kullaniciBilgileriGoster() {
		int gecerliYil = gecerliYilIste();
		int dogumYili = bilgiIste();
		int yas = yasHesapla(dogumYili, gecerliYil);
		int yuzYil = yuzYilHesapla(dogumYili);
		System.out.println("Yaşınız: " + yas + " " + yuzYil + ". YY'da doğdunuz.");

	}

	public static int yasHesapla(int dogumYili, int gecerliYil) {
		int yas = gecerliYil - dogumYili;
		return yas;
	}

	public static int yuzYilHesapla(int dogumYili) {
		int yuzYil = (dogumYili / 100) + 1;
		return yuzYil;
	}

	public static int bilgiIste() {

		System.out.print("Doğum yılınızı girin: ");
		int dogumYili = scanner.nextInt();

		return dogumYili;
	}

	public static int gecerliYilIste() {

		System.out.print("Olduğunuz yılı girin: ");
		int gecerliYil = scanner.nextInt();

		return gecerliYil;
	}
}
