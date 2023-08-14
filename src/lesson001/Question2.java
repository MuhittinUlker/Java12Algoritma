package lesson001;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		// kullanıcıdan girilen iki(int) sayıyı çarpalım
		
		
		Scanner sc = new Scanner(System.in);
		int sayi1,sayi2,carpim=0;
		
		System.out.println("İlk sayıyı giriniz:");
		sayi1 = sc.nextInt();
		System.out.println("İkinci sayıyı giriniz:");
		sayi2 = sc.nextInt();
		
		carpim = sayi1 * sayi2;
		
		System.out.println("Çarpım:"+carpim);
	}

}
