package lesson003;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		
		// 1den girilene kadar olan sayıları yazdıralım
		
		Scanner scanner = new Scanner(System.in);

		int i=scanner.nextInt();
		int sayac=1;
		
		while(sayac<=i) {
		
			System.out.println(i);
			i++;
		}

	}

}
