package lesson018;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapOrnek {

	//character ve int tutan map oluşturalım
	//kullanıcıdan bir kelime alalım
	//ve girilen kelimede hangi harften kaç tane var onu yazdıralım
	
	public static void main(String[] args) {
		
		Map<Character, Integer> sayacMap = new LinkedHashMap<Character, Integer>();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir kelime girin: ");
		
		String kelime = scanner.nextLine();
		
		for (Character character : kelime.toCharArray()) {
			sayacMap.put(character, sayacMap.getOrDefault(character, 0)+1);
		}
		sayacMap.forEach((k,v)->System.out.println(k+"-"+v+" adet"));
//		for (int i = 0; i < kelime.length(); i++) {
//			if (sayacMap.containsKey(kelime.charAt(i))) {
//				sayacMap.put(kelime.charAt(i), sayacMap.get(kelime.charAt(i))+1);
//			}else {
//				sayacMap.put(kelime.charAt(i), 1);
//			}
//		}
//		for (Map.Entry<Character,Integer> entry : sayacMap.entrySet()) {
//			System.out.println(entry.getKey()+"-"+entry.getValue()+" adet");
//		}
		scanner.close();
	}
	
	
	
	
}
