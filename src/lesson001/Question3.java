package lesson001;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		//%18 kdv ve %15 kar olan ürünün ham fiyatı
		
		Scanner sc = new Scanner(System.in);
		
		double kdv = 1.2, kar = 1.15, yurtdisiKar= 1.2,yurtdisiFiyat,fiyat,kdvsizFiyat=0,karsizFiyat=0,hamFiyat=0;
		
		
		System.out.println("Ürün fiyatını giriniz:");
		
		fiyat=sc.nextInt();
		
		kdvsizFiyat=fiyat/kdv;
		
		karsizFiyat=fiyat/kar;
		
		hamFiyat=fiyat/(kar*kdv);
		
		yurtdisiFiyat=fiyat*(yurtdisiKar*kdv);
		
		System.out.println("Ürünün ham fiyatı: "+ hamFiyat);
		
		System.out.println("Ürünün yurtdışı fiyatı: " + yurtdisiFiyat);
		
	}

}
