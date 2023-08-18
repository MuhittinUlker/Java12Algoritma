package lesson005;

import java.util.Scanner;

public class Question29 {

	public static void main(String[] args) {

		// girilen kelimenin harflerini alt alta yazdıralım

		Scanner scanner = new Scanner(System.in);

		System.out.println("Kelime giriniz.");
		String kelime = scanner.next();

		for (int i = 0; i < kelime.length(); i++) {

			System.out.println(kelime.charAt(i));
		}

	}

}
