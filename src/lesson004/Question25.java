package lesson004;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		
		//girilen sayının mükemmel olup olmadığı
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Sayı giriniz: ");
		int sayi = scanner.nextInt();
		int toplam=0;
		
		for(int i=1;i<sayi;i++) {
			if(sayi%i==0) {
				toplam+=i;
			}			
		}
		if(sayi==toplam) {
			System.out.println("Mükemmeldir");
		}else {
			System.out.println("Mükemmel değildir");

		}
	}

}
