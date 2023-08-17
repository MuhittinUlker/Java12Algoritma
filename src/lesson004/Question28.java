package lesson004;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		
		// hesap makinesi

		Scanner scanner = new Scanner(System.in);
		double sonuc = 0;
		System.out.println("İşlem yapılacak ilk sayıyı giriniz: ");
		double sayi1 = scanner.nextInt();
		System.out.println("İşlem yapacak operantı giriniz: ");
		String op = scanner.next();
		System.out.println("İşlem yapılacak ikinci sayıyı giriniz: ");
		double sayi2 = scanner.nextInt();
		
		
	switch (op) {
	
	case "+":
		sonuc=sayi1+sayi2;
		System.out.println("Toplam işleminin sonucu: "+ sonuc);
	break;
	
	case "-":
		sonuc=sayi1-sayi2;
		System.out.println("Çıkarma işleminin sonucu: "+ sonuc);
	break;
	
	case "/":
		sonuc=sayi1/sayi2;
		System.out.println("Bölme işleminin sonucu: "+ sonuc);
	break;
	
	case "*":
		sonuc=sayi1*sayi2;
		System.out.println("Çarpım işleminin sonucu: "+ sonuc);
	break;
	
	case "%":
		sonuc=sayi1%sayi2;
		System.out.println("Mod işleminin sonucu: "+ sonuc);
	break;
	
	default:
		System.out.println("Geçerli bir işlem seçiniz.");
		break;
	}
	
	
	}

}
