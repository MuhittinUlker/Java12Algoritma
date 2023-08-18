package lesson005;

import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {
		
		// girilen textte kaç tane girilen harf var bulalım
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Kelime giriniz.");
		String kelime = scanner.next().toLowerCase();
		
		System.out.println("Kelime giriniz.");
		String harf = scanner.next().toLowerCase();
		
		int sayac=0;
		
		for (int i = 0; i < kelime.length(); i++) {
			if(kelime.charAt(i)==harf.charAt(0)) {
				sayac++;
			}	
		}
		System.out.println(harf +" harf adedi: " +sayac);
	}

}
