package lesson007;

import java.util.Arrays;

public class Question35 {

	public static void main(String[] args) {
		
		// a ile biten ülkelerin yerine ? koyalım

		String[] ulkeler=new String[] {"Amerika","Ukranya","Azerbeycan","Türkiye","Gana"};
		for (int i = 0; i < ulkeler.length; i++) {
			if (ulkeler[i].endsWith("a")) {
				ulkeler[i]="?";
				System.out.println(i+". index değişti.");
			}
		}
		System.out.println(Arrays.toString(ulkeler));
		
		
	}

}
