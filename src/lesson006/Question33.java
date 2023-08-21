package lesson006;

import java.util.Scanner;

public class Question33 {

	public static void main(String[] args) {
		// string işlemler
		// sorgulama metodu şeçme
		// sorgulanacak input verme
		// sonuçlar
		
		Scanner scanner = new Scanner(System.in);
		
		bitir:
			for(;;) {
		System.out.println("=====String İşlemleri=====");
		System.out.println("1-Harf Saydırma");
		System.out.println("2-Harf Değiştirme");
		System.out.println("3-Palindrom Kontrol");
		System.out.println("4-Kelimenin harf aralarını doldurma");
		System.out.println("5-Kelimenin 3 indexi hariç 3. ile yazdır");
		System.out.println("6-Kelimenin 3 indexi hariç . ile yazdır");
		System.out.println("0-Çıkış");

		int secim = scanner.nextInt();
		
		
		switch (secim) {
		case 0:
			break bitir;	
		
		case 1:
			System.out.println("Lütfen bir kelime giriniz: ");
			String kelime = scanner.next();
			System.out.println("Hangi harfi saymak istiyorsunuz: ");
			String karakter=scanner.next();
			int sayac=0;
			String index="";
			
			if(!kelime.contains(karakter)) {
				System.out.println("Aradığınız harf kelimede yok.\n");
			}else {
				for (int i = 0; i < kelime.length(); i++) {
					if(kelime.charAt(i)==karakter.charAt(0)) {
						sayac++;
						index+=i+",";
					}
				}
				System.out.println(karakter+" harfi kelime içinde "+sayac+" adet bulunuyor.");
				System.out.println(karakter+" harfinin indexleri===> "+index.substring(0,index.length()-1));		
				break;
			}
		case 2:
			System.out.println("Lütfen bir kelime giriniz: ");
			kelime = scanner.next();
			System.out.println("Hangi harfi değiştirmek istiyorsunuz: ");
			karakter=scanner.next();
			System.out.println("Hangi harf ile değiştirmek istiyorsunuz: ");
			String karakter1=scanner.next();
			
			if(!kelime.contains(karakter)) {
				System.out.println("Değiştirmek istediğiniz harf kelimede yok.\n");
			}else {
				kelime=kelime.replace(karakter,karakter1);
				System.out.println(kelime);
			}		
			break;
			
		case 3:
			
			System.out.println("Lütfen bir kelime giriniz: ");
			kelime = scanner.next();
			String emilek="";
			
			for (int i = kelime.length()-1; i >=0; i--) {
				emilek+=kelime.charAt(i);
				}
				if(kelime.equals(emilek)) {
					System.out.println("Polindromdur.");
				}else {
					System.out.println("Polindrom değildir.");
					}
			break;
		case 4:
			System.out.println("Lütfen bir kelime giriniz: ");
			kelime = scanner.next();
			System.out.println("Aralara ne eklemek istiyorsunuz: ");
			karakter=scanner.next();
			String yeniKelime="";
			for(int i=0;i<kelime.length();i++) {
				yeniKelime+=kelime.charAt(i)+karakter;
			}
			System.out.println(yeniKelime.substring(0,yeniKelime.length()-1));		
			break;
			
		case 5:
			System.out.println("Lütfen bir kelime giriniz: ");
			kelime = scanner.next();
			yeniKelime="";
			yeniKelime=kelime.substring(0,3)+"...";
			System.out.println(yeniKelime);
			break;
			
		case 6:
			System.out.println("Lütfen bir kelime giriniz: ");
			kelime = scanner.next();
			yeniKelime=kelime.substring(0,3);
			for(int i=0; i<kelime.length()-3;i++) {
				yeniKelime+=".";
			}
			System.out.println(yeniKelime);
			break;
			
			
			}
		}

	}
}

