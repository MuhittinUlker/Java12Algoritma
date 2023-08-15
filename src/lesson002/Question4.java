package lesson002;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		// Verilen iki sayıdan hangisinin büyük olduğunu bulan program
		
		Scanner scanner = new Scanner(System.in);
		
		int sayi1,sayi2;
		
		System.out.println("İlk sayıyı giriniz:");
		sayi1 = scanner.nextInt();
		
		System.out.println("İkinci sayıyı giriniz:");
		sayi2 = scanner.nextInt();
		
		if (sayi1>sayi2) {
			System.out.println("Büyük sayı: "+ sayi1);
		} else if (sayi1==sayi2) {
			System.out.println("Girilen sayılar eşittir ");

		}
		else {
			System.out.println("Büyük sayı: "+ sayi2);

		}

	}

}
