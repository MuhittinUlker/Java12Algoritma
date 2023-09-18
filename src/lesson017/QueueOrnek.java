package lesson017;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueOrnek {

	public static void main(String[] args) {

		//bir queue oluşturalım
		// 12 tane isim gönderelim
		// 1-10 arası random sayı üretelim (hediyeÇek sayısı)
		//çek sayısı kadar kuyruktan 
		
		Queue<String> isimler = new LinkedList<String>();
		isimler.add("A");
		isimler.add("B");
		isimler.add("C");
		isimler.add("D");
		isimler.add("E");
		isimler.add("F");
		isimler.add("G");
		isimler.add("H");
		isimler.add("J");
		isimler.add("K");
		isimler.add("L");
		
		Random rnd = new Random();
		
		int cekSayisi = rnd.nextInt(1,10);
		
		System.out.println("Çek sayısı: "+cekSayisi);
		
		for (int i = 0; i < cekSayisi; i++) {
			System.out.println(isimler.poll()+" Hediye çeki aldı.");
		}
		int size = isimler.size();
		for (int i = 0; i < size; i++) {
			System.out.println(isimler.poll()+" Hediye çeki alamadı..");
		}
		
		
	}
}
