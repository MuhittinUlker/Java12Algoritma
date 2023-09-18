package lesson017;

import java.util.PriorityQueue;

public class PQueueOrnek {

	public static void main(String[] args) {

		PriorityQueue<Hasta> pqueue = new PriorityQueue<Hasta>();
		
		pqueue.add(new Hasta("A", EIllness.HEADACHE));
		pqueue.add(new Hasta("B", EIllness.EAR));
		pqueue.add(new Hasta("C", EIllness.APPENDICITIS));
		pqueue.add(new Hasta("D", EIllness.BURN));
		pqueue.add(new Hasta("E", EIllness.THROAT));
		pqueue.add(new Hasta("F", EIllness.EAR));
		pqueue.add(new Hasta("G", EIllness.BURN));
		pqueue.add(new Hasta("H", EIllness.THROAT));
		pqueue.add(new Hasta("J", EIllness.APPENDICITIS));
		pqueue.add(new Hasta("K", EIllness.HEADACHE));
		
		while (pqueue.iterator().hasNext()) {
			System.out.println(pqueue.poll()+" Tedavi olmuştur.");
			
		}
	}

}
