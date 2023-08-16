package lesson003;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {

		// girilen sayının 5in kuvveti olup olmadığını bulan program

		Scanner scanner = new Scanner(System.in);

		System.out.println("Sayı giriniz: ");
		int sayi = scanner.nextInt();

		/*
		 * int kat=1;
		 * 
		 * if(sayi%5==0) { while(sayi%5!=0) { sayi=sayi/5; }
		 * System.out.println("5in kuvvetidir.");
		 * 
		 * } else { System.out.println("5in kuvveti değildir"); }
		 */

		boolean kontrol = true;

		while (kontrol) {
			if (sayi % 5 == 0) {
				sayi = sayi / 5;
				if (sayi == 1) {
					System.out.println("5in kuvvetidir.");
					kontrol = false;
				}
			} else {
				System.out.println("5in kuvveti değildir.");
				kontrol = false;
			}

		}
	}

}
