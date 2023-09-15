package lesson016;

import java.util.ArrayList;

public class ArrayListOrnek1 {

	// arraylist oluşturalım
	// birkaç şehir ekleyelim
	//şehirlerden an ile başlayanları xxx ile değiştirelim
	
	public static void main(String[] args) {
	
		ArrayList<String> sehirler = new ArrayList<String>();
		sehirler.add("Ankara");
		sehirler.add("Antalya");
		sehirler.add("İzmir");
		sehirler.add("İstanbul");
		System.out.println("Liste: "+sehirler);

		degerDegistirme(sehirler);
		
		

	}

	public static void degerDegistirme(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).toLowerCase().startsWith("an")) {
				list.set(i, "xxx");
			}
		}
		System.out.println("Yeni Liste: "+list);
	}
}
