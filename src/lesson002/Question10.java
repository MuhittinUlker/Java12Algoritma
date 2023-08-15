package lesson002;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {

		// Girilen 3 sayıdan en büyük olanı yazdıran program

		Scanner scanner = new Scanner(System.in);

		int sayi1, sayi2, sayi3;

		System.out.println("İlk sayıyı giriniz:");
		sayi1 = scanner.nextInt();

		System.out.println("İkinci sayıyı giriniz:");
		sayi2 = scanner.nextInt();

		System.out.println("Üçüncü sayıyı giriniz:");
		sayi3 = scanner.nextInt();

		if (sayi1 > sayi2) {
			if (sayi1 > sayi3) {
				System.out.println("En büyük sayı: " + sayi1);
			} else {
				System.out.println("En büyük sayı: " + sayi3);
			}
		} else if (sayi2 > sayi3) {
			System.out.println("En büyük sayi: " + sayi2);
		} else {
			System.out.println("En büyük sayi: " + sayi3);
		}

	}

}
