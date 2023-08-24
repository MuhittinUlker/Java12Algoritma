package lesson009;

import java.util.Scanner;

public class Question53 {

	public static void main(String[] args) {
		
		// girilen sayının kaç basamaklı olduğunu döndüren metod
		int sayi = sayiAl();
		int indexNum=basamakBul(sayi);
		basamakYaz(sayi, indexNum);
	}
	public static int basamakBul(int sayi) {
		
		String basamak =String.valueOf(sayi);
		int basamakSayisi = basamak.length();
		
		return basamakSayisi;
	}
	public static int sayiAl() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Basamağı bulunacak sayıyı girin: ");
		int sayi = scanner.nextInt();scanner.nextLine();
		scanner.close();
		return sayi;
	}
	public static void basamakYaz(int sayi,int basamak) {
		System.out.println(sayi+" sayısı " +basamak+" basamaklıdır.");
	}
}
