package lesson016;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListOrnek2 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int sayi;
		ArrayList<Integer> tekSayilar = new ArrayList<Integer>();
		ArrayList<Integer> ciftSayilar = new ArrayList<Integer>();
		for (int i = 0; i < 35 ; i++) {
			sayi = rnd.nextInt(0,101);
			if (sayi%2==0) {
				ciftSayilar.add(sayi);
			}else {
				tekSayilar.add(sayi);
			}
		}
		
		System.out.println("Tek Sayılar: "+tekSayilar+"\nTek sayılar eleman sayısı: "+tekSayilar.size());
		System.out.println("Çift Sayılar: "+ciftSayilar+"\nÇift sayılar eleman sayısı: "+ciftSayilar.size());
		
	}

}
