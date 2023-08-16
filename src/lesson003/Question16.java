package lesson003;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {

		// kullanıcıdan 1-7 arası sayı alalım
		// hafta içi yada dışı olduğunu söylesin

		Scanner scanner = new Scanner(System.in);

		System.out.println("Gün giriniz:");
		int gun = scanner.nextInt();

		switch (gun) {

		case 1, 2, 3, 4, 5 -> System.out.println(gun + " haftaiçi.");

		case 6, 7 -> System.out.println(gun + " haftasonu.");

		default -> System.out.println("Hatalı değer girdiniz.");

		}
	}

}
