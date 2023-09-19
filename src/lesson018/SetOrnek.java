package lesson018;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOrnek {

	/*
	 * 2 tane set oluşturalım
	 * tekrarEdenler,tekrarEtmeyenler
	 * kullanıcıdan kelime alıcaz
	 * eğer tekrar eden hard varsa tekrarEdenler setine atalım
	 * ve tekrarEtmeyenlerden çıkaralım
	 */
	public static void main(String[] args) {

		Set<Character> tekrarEdenler = new LinkedHashSet<Character>();
		Set<Character> tekrarEtmeyenler = new LinkedHashSet<Character>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir kelime girin: ");
		String metin = scanner.nextLine();
		
		for (Character character : metin.toCharArray()) {
			if (!tekrarEdenler.contains(character)&&!tekrarEtmeyenler.add(character)) {
				tekrarEdenler.add(character);
				tekrarEtmeyenler.remove(character);
			}
		}
		System.out.println("tekrarEdenler:"+ tekrarEdenler);
		System.out.println("tekrarEtmeyenler"+tekrarEtmeyenler);
		scanner.close();
	}

}
