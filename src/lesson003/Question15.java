package lesson003;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		
		/*
		  Koç Burcu : 21 Mart - 20 Nisan
		  Boğa Burcu : 21 Nisan - 21 Mayıs
		  İkizler Burcu : 22 Mayıs - 22 Haziran
		  Yengeç Burcu : 23 Haziran - 22 Temmuz
		  Aslan Burcu : 23 Temmuz - 22 Ağustos
		  Başak Burcu : 23 Ağustos - 22 Eylül
		  Terazi Burcu : 23 Eylül - 22 Ekim
		  Akrep Burcu : 23 Ekim - 21 Kasım
		  Yay Burcu : 22 Kasım - 21 Aralık
		  
		  1. Ay Oğlak Burcu : 22 Aralık - 21 Ocak
		  1. Ay Kova Burcu : 22 Ocak - 19 Şubat
		  
		  Balık Burcu : 20 Şubat - 20 Mart
		*/
		
		// Kaçıncı ayda doğdunuz-->  4. ayda 
		// hangi gün doğdunuz-->  Ayın 20'sinde
		
		//Switch case kullanalım
		//Default --> lütfen 1-12 arasında bir sayı girin
		
		Scanner scanner = new Scanner(System.in);

		int dogumAyı,dogumGunu,burc;

		System.out.println("Doğum ayınızı giriniz:");
		dogumAyı = scanner.nextInt();
		
		System.out.println("Doğum gününüzü giriniz:");
		dogumGunu = scanner.nextInt();
				
		switch (dogumAyı) {
		case 1:
			if(dogumGunu<=21) {
				System.out.println("Oğlak");
			}else {
				System.out.println("Kova");
			}
			break;
		case 2:
			if(dogumGunu<19) {
				System.out.println("Kova");
			}else {
				System.out.println("Balık");
			}
			break;
		default:
			System.out.println("Lütfen 1 ile 12 arasında bir değer girin.");
			break;
		}

	}

}
