package lesson017;

import java.util.Scanner;
import java.util.Stack;

public class StackOrnek2 {
	
	public static void main(String[] args) {
		
		// parametre olarak string alan ve girilen kelimenin palindrom olup olmadığını bulalım
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kelime girin: ");
		String kelime = scanner.nextLine();
		if (palindromeMu(kelime)) {
			System.out.println("Palindromdur.");
		}else {
			System.out.println("Palindrom değildir.");
		}
		scanner.close();
	}
	
	private static boolean palindromeMu(String kelime) {
		Stack<Character> stack = new Stack<Character>();
		for (Character character : kelime.toCharArray()) {
			stack.add(character);
		}
		for (int i = 0; i < kelime.length()/2; i++) {
			if (kelime.charAt(i)!=stack.pop()) {
				return false;
			}
		}
		return true;
	}
}
