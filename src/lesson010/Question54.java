package lesson010;

import java.util.Scanner;

public class Question54 {

	public static void main(String[] args) {
		
		// girilen sayıya kadar olan sayıların asal olanlarını yazdıracak bir metod
		// asalMi() metodu asallık kontrolü yapacak
		asallariGoster();
		
	}
	
	public static boolean asalMi(int sayi) {
		boolean asalMi=true;
		if (sayi<2) {
			asalMi= false;
		}else {
			for (int i = 2; i < sayi ; i++) {
				if (sayi%i==0) {
					asalMi= false;
				break;
				}
			}
		}
		return asalMi;
	}
	
	public static void asallariGoster() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		int sayi = scanner.nextInt();
		for (int i = 1; i < sayi; i++) {
			if(asalMi(i)) {
			System.out.print(i+" ");	
			}
		}
		scanner.close();
	}

}
