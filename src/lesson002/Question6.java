package lesson002;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// Kullanıcıdan alınan vize ve final notları ile geçti/kaldı

		Scanner scanner = new Scanner(System.in);

		int vizeNotu, finalNotu;
		double ort;

		System.out.println("Vize notunu giriniz:");
		vizeNotu = scanner.nextInt();

		System.out.println("Final notunu giriniz:");
		finalNotu = scanner.nextInt();

		ort = (vizeNotu * 0.4) + (finalNotu * 0.6);

		if (vizeNotu < 0 || vizeNotu > 100 || finalNotu < 0 || finalNotu > 100) {
			System.out.println("Doğru değer giriniz");
		} else {
			if (ort >= 50) {
				System.out.println("Öğrenci " + ort + " ile geçti");
			}

			else {
				System.out.println("Öğrenci " + ort + " ile kaldı");

			}

		}
	}
}
