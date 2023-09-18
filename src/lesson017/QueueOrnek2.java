package lesson017;

import java.util.Comparator;
import java.util.PriorityQueue;


public class QueueOrnek2 {

	public static void main(String[] args) {
		
		//bir müşteri sınıfı açalım, kuyruğa müşterileri atalım
		//müşterilerin isim ve yaş değerleri olacak
		//yaşı büyük olanlar ilk sırada yer alacaklar
		
		PriorityQueue<Musteri> pqueue = new PriorityQueue<>(Comparator.comparing(Musteri::getAge).reversed());
		
		pqueue.add(new Musteri("A",65));
		pqueue.add(new Musteri("B",50));
		pqueue.add(new Musteri("C",15));
		pqueue.add(new Musteri("D",20));
		pqueue.add(new Musteri("E",40));
		pqueue.add(new Musteri("F",30));
		
		while (pqueue.iterator().hasNext()) {
			System.out.println(pqueue.poll()+" İşlemini Yaptı");
		}
	}
}
