package lesson004;

import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {

		// klavyeden girilen 0 ile 100 arasındaki 5 sayıdan en b&k bulan

		Scanner scanner = new Scanner(System.in);
		int enBuyuk = -1, enKucuk = 101;

		for (int i = 1; i <= 5; i++) {
			System.out.println(i + ". Sayı giriniz: ");
			int sayi = scanner.nextInt();
			if (sayi >= 0 && sayi <= 100) {
				if (sayi > enBuyuk) {
					enBuyuk = sayi;
				}
				if (sayi < enKucuk) {
					enKucuk = sayi;
				}
			} else {
				System.out.println("Lütfen 0 ile 100 arasında sayı girin");
				i--;
			}
		}
		System.out.println("En Küçük : " + enKucuk + " , " + "En Büyük: " + enBuyuk);
	}

}
