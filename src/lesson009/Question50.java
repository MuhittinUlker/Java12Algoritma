package lesson009;

import java.util.Scanner;

public class Question50 {

	public static void main(String[] args) {
		
		// kullanıcıdan kelime alıp türkçe karakterlerini 
		// ingilizce karşılığı ile değiştiren program.
		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
	    String[] turkceKarakter    = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };
		
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Bir kelime girin: ");
	    String kelime = scanner.next();
	   
	    System.out.println(chageTrToEng(kelime,turkceKarakter,ingilizceKarakter));
	    scanner.close();
	}
	public static String chageTrToEng(String kelime,String[]array1,String[]array2) {	
	   
		for (int i = 0; i < array1.length; i++) {
			if (kelime.contains(array1[i])) {
				kelime=kelime.replaceAll(array1[i], array2[i]);
			}
		}
		return kelime;
	}
	
}
