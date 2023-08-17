package lesson004;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {

		// girilen sayı için çarpım tablosunu veren program

		Scanner scanner = new Scanner(System.in);

		System.out.println("Sayı giriniz: ");
		int sayi = scanner.nextInt();

		for (int i = 1; i <= 10; i++) {

			System.out.println(sayi + " x " + i + " = " + i * sayi);
		}

		for (int j = 1; j <= 10; j++) {
			for (int k = 1; k <= 10; k++) {
				System.out.println(j + " x " + k + " = " + j * k);
			}
		}

	}
}
