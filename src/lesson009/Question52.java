package lesson009;

import java.util.Scanner;

public class Question52 {

	public static void main(String[] args) {
		
		// topla metodu yazalım
		// ondanBuyukMu() metodu yazalım
		// toplam büyük ise true değilse false dönen program
		
		int toplam = topla();
		boolean check = ondanBuyukMu(toplam);
		indirim(check);
	}
	public static int topla() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Sayıyı girin: ");
		int sayi1 = scanner.nextInt();scanner.nextLine();
		System.out.println("2. Sayıyı girin: ");
		int sayi2 = scanner.nextInt();scanner.nextLine();
		scanner.close();
		int sonuc = sayi1+sayi2;
		return sonuc;
	}
	public static boolean ondanBuyukMu(int sum) {
		if (sum>10) 
			return true;
		else 
			return false;	
	}
	public static void indirim(boolean kontrol) {
		System.out.println(kontrol?"İndirim kazandınız":"İndiriminiz yok");
	}
}
