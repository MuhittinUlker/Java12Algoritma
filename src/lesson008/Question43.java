package lesson008;

import java.util.Scanner;

public class Question43 {

	public static void main(String[] args) {
		
		// 2*2 boş matris oluştur
		
		Scanner scanner = new Scanner(System.in);
		String[][] isimler = new String[2][2];
		
		for (int i = 0; i < isimler.length; i++) {
			for (int j = 0; j < isimler.length; j++) {
				System.out.println("Bir isim giriniz: ");
				isimler[i][j] = scanner.next();   
			}	
		}
		for (int i = 0; i < isimler.length; i++) {
			System.out.println((i+1)+". Grup");
			for (int j = 0; j < isimler.length; j++) {
				System.out.println(isimler[i][j]+" ");
			}
		}
		scanner.close();
	}

}
