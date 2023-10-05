package lesson023;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchOrnek {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String[] array = {"6","10","bc","55",null};
		
		//parametre olarak array alan ve girdiğimiz değere
		//karşılık gelen indexi yazan program
		
		//input -> 3
		//output -> 55
		
		try {
			hesapla(array);
		} catch (NullPointerCheck e) {
			System.out.println(e.getMesaj());
		}		
		
	}
	
	public static void goster(String[] array) {
		
		try {
			System.out.println("Hangi indexteki bilgiyi istiyorsunuz: ");
			int input = scanner.nextInt();scanner.nextLine();
			System.out.println(array[input]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Girilen index arrayde yok..");
		}catch (InputMismatchException e) {
			System.out.println("Lütfen index olarak sayı girin..");
		}
	}
	
	public static void hesapla(String[] array) throws NullPointerCheck {
		int totalSum = 0;
		int totalErr = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]==null) {
				throw new NullPointerCheck("Null Olamaz");
			}
			try {
				totalSum+=Integer.parseInt(array[i]);
			} catch (Exception e) {
				System.out.println(e);
				totalErr++;
			}
		}
		System.out.println("İndex toplamları: "+totalSum+"\nToplam hata sayısı: "+totalErr);
	}
}
