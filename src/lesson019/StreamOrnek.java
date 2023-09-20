package lesson019;

import java.util.ArrayList;
import java.util.List;

public class StreamOrnek {

	public static void main(String[] args) {
		
		//
		
		List<Integer> sayilar = new ArrayList<>();
		sayilar.add(5);
		sayilar.add(55);
		sayilar.add(60);
		sayilar.add(12);
		sayilar.add(97);
		sayilar.add(77);
		System.out.println("*****Sayılar*****");
		System.out.println(sayilar);
				
		//sayıları kendisi ile çarpıp yeni bir listeye atalım
		System.out.println("*****Sayıların Karesi*****");
		List<Integer> sayilarinKaresi = sayilar.stream().map(sayi->sayi*sayi).toList();
		System.out.println(sayilarinKaresi);
		
		//5 ile bölünen sayıları bir listeye atıp listeyi yazdıralım
		System.out.println("*****5e Bölünen Sayılar*****");
		List<Integer> bolunenSayilar = sayilar.stream().filter(sayi->sayi%5==0).toList();
		System.out.println(bolunenSayilar);
				
		//kaç tane 5e bölünen sayı var
		System.out.println("*****5e Bölünen Sayıların Adedi*****");
		System.out.println(sayilar.stream().filter( $ -> $ %5==0).count());
		
	}
}
