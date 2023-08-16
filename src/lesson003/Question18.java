package lesson003;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		
		// girilen sayının basamaklarının toplamını bulan program
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Basamakları toplanacak sayıyı giriniz: ");
		int sayi=scanner.nextInt();
		
		int toplam=0;
		
		while(sayi!=0) {
			toplam=(sayi%10)+toplam;
			sayi/=10;
			
		}
		System.out.println(toplam);

	}

}
