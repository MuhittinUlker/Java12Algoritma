package lesson002;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		
		// Girilen ortalamanın harf notuna göre geçip geçmediğini bulan program
		
		//90 üstü AA
		//80-90 BB
		//70-80 CC
		//60-70 DD
		//60tan küçük FF kaldı

		Scanner scanner = new Scanner(System.in);

		int ortalama;

		System.out.println("Ortalama giriniz:");
		ortalama = scanner.nextInt();
		
		if(ortalama<0 || ortalama>100) {
			System.out.println("Geçersiz ortalama girdiniz.");
		}else {
		if(ortalama>=90) {
			System.out.println("Öğrenci AA ile geçti.");
		}else if (ortalama>=80) {
			System.out.println("Öğrenci BB ile geçti.");
		}else if (ortalama>=70) {
			System.out.println("Öğrenci CC ile geçti.");
		}else if (ortalama>=60) {
			System.out.println("Öğrenci DD ile geçti.");
		}else {
			System.out.println("Öğrenci FF ile kaldı.");
		}
	}
	}
}
