package lesson002;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {

		// Kenarları kullanıcıdan alınan üçgenin nasıl bir üçgen olduğunu söyleyen
		// program

		Scanner scanner = new Scanner(System.in);

		int kenar1, kenar2, kenar3;

		System.out.println("1.kenarı giriniz:");
		kenar1 = scanner.nextInt();
		System.out.println("2.kenarı giriniz:");
		kenar2 = scanner.nextInt();
		System.out.println("3.kenarı giriniz:");
		kenar3 = scanner.nextInt();

		
		if (kenar1 == kenar2 && kenar1 == kenar3) {
			System.out.println("Bu bir eşkenar üçgendir.");
		} else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {
			System.out.println("Bu bir ikizkenar üçgendir.");
		} else {
			System.out.println("Bu bir çokkenar üçgendir.");
		}
	}

}
