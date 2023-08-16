package lesson003;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {

		// girilen sayının basamaklarında olan rakamları söyleyen

		Scanner scanner = new Scanner(System.in);

		System.out.println("Basamakları gösterilecek sayıyı giriniz: ");
		int sayi = scanner.nextInt();

		int basamak = 0;
		int basamakSayisi = 1;

		while (sayi != 0) {
			basamak = (sayi % 10);
			sayi /= 10;
			System.out.println(basamakSayisi + ". " + basamak);
			basamakSayisi = basamakSayisi * 10;

		}
	}
}
