package lesson021;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchOrnek {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println(divide());
		
	}

	public static double divide() {
		try {
			int sayi1 = scanner.nextInt();
			int sayi2 = scanner.nextInt();
			double bolum = sayi1/sayi2;
			return bolum;
		} catch (InputMismatchException e) {
			System.out.println("String değer girilemez hatası..");
		}catch (ArithmeticException e) {
			System.out.println("Sayı sıfıra bölünemez hatası..");
		}catch (Exception e) {
			System.out.println("Sistemsel hata..");
		}
		return 0;
	}
}
