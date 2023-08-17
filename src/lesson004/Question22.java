package lesson004;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {

		// girilen sayının asal olup olmadığını bulalım

		Scanner scanner = new Scanner(System.in);

		System.out.println("Sayı giriniz: ");
		int sayi = scanner.nextInt();
		boolean isPrime = true;

		if (sayi <= 2) {

			isPrime = false;

		}
			for (int i = 2; i < sayi; i++) {

				if (sayi % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println("Asaldır");
			} else {
				System.out.println("Asal değildir");
			}
		}

	}


