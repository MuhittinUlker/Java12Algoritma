package lesson004;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		// kullanıcıdan taban ve üs alınacak ve hesaplayacak

		Scanner scanner = new Scanner(System.in);

		System.out.println("Taban giriniz: ");
		int taban = scanner.nextInt();

		System.out.println("Üs giriniz: ");
		int us = scanner.nextInt();

		int sonuc = 1;

		for (int i = 1; i <= us; i++) {
			sonuc = sonuc * taban;
		}
		System.out.println(taban + " ^ " + us + " = " + sonuc);
	}

}
