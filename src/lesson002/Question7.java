package lesson002;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// Girilen sayının çift mi tek mi olduğunu söyleyen program

		Scanner scanner = new Scanner(System.in);

		int sayi;

		System.out.println("Sayı giriniz:");
		sayi = scanner.nextInt();

		if (sayi % 2 == 0) {
			System.out.println("Girilen sayı çifttir :" + sayi);

		} else {
			System.out.println("Girilen sayı tektir :" + sayi);

		}
	}

}
