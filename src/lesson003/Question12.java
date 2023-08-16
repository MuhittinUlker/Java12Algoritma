package lesson003;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		
		// girilen iki sayının toplamı çift ise true tek ise false yazdıralım

		Scanner scanner = new Scanner(System.in);
		
		int toplam=0;
		boolean booleanSonuc;
		
		System.out.println("İlk sayıyı giriniz:");
		int sayi1 = scanner.nextInt();

		System.out.println("İkinci sayıyı giriniz:");
		int sayi2 = scanner.nextInt();
		
		toplam=sayi1+sayi2;
		
		
		if(toplam%2==0) {
			booleanSonuc=true;
		}
		else {
			booleanSonuc=false;
		}
		System.out.println("1.Sayı: "+sayi1+ "2.Sayi: "+ sayi2+ "Sonuç: "+booleanSonuc);

	}

}
