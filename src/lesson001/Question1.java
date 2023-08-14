package lesson001;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		//Verilen isim ve soyisim değerlerini
		//Hoşgeldiniz "isim" "soyisim" yazdıralım
		
		Scanner sc = new Scanner(System.in);
		String isim,soyIsim;
		
		System.out.println("İsim giriniz:");
		isim = sc.next();
		System.out.println("Soyisim giriniz:");
		soyIsim = sc.next();
	
		System.out.println("Hoşgeldiniz!! " + isim + " " + soyIsim);
		
	}

}
