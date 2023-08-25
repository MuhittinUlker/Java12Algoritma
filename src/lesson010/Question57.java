package lesson010;

import java.util.Scanner;

public class Question57 {

	public static void main(String[] args) {
		
		// girilen kelimenin ilk ve son harfini değiştirelim
		// girilen kelime 0-100 arasında olması lazım
		// eğer tek harfli girildiyse girilen harfi return etsin
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kelime Girin: ");
		String kelime=scanner.nextLine();
		System.out.println(yerDegistir(kelime));
		

	}
	
	public static String yerDegistir(String kelime) {
		String text = "";
		for(;;) {
		if (kelime.length()>100 || kelime.length()==0) {
			System.out.println("Hata");
		}else if (kelime.length()==1) {
			System.out.println(kelime);
		}
		
		else {
			char ilkHarf = kelime.charAt(0);
			char sonHarf = kelime.charAt(kelime.length()-1);
			text=sonHarf+kelime.substring(1, kelime.length()-1)+ilkHarf;
		}		
		return text;
	}
	}
}
