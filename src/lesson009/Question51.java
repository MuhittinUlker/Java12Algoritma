package lesson009;

import java.util.Scanner;

public class Question51 {

	public static void main(String[] args) {
		
		// metodlar ile isim soyisim alıp yine metod ile ekrana
		// isminiz----> isim soyisminiz ----> soyisim yazdıran program

	
		String name = adAl();
		String surname = soyadAl();
		adSoyadYazdır(name,surname);
		
		//adSoyadYazdır(adAl(),soyadAl());  doğru çalışır ama 

		
	}
	public static String adAl() {
		System.out.print("İsminizi giriniz: ");
		Scanner scanner = new Scanner(System.in);
		String isim = scanner.next();
		scanner.close();
		return isim;
	}
	public static String soyadAl() {
		System.out.print("Soyisminizi giriniz: ");
		Scanner scanner = new Scanner(System.in);
		String soyisim = scanner.next();
		scanner.close();
		return soyisim;
	}
	
	public static void adSoyadYazdır(String ad , String soyad) {
		
		System.out.println("İsminiz---> "+ad+" Soyisminiz---> "+soyad);
	}

}
