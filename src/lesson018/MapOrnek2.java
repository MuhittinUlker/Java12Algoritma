package lesson018;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapOrnek2 {

	public static void main(String[] args) {

		String[] ogrenci = {"Ayşe","Zeynep","Mehmet"};
		Integer[] notlar = {60,80,70};
		
		MapOrnek2 mapOrnek2 = new MapOrnek2();
		//1
		mapOrnek2.notlariDuzenle(ogrenci, notlar);
		System.out.println("*******************************");
		String[] ogrenci2 = {"Ayşe","Zeynep","Mehmet"};
		Integer[][] notlar2 = {{60,80,70},{60,80,70},{60,80,70}};
		//2
		mapOrnek2.notlariDuzenle(ogrenci2, notlar2);
		System.out.println("*******************************");
		//3
		mapOrnek2.notlariDuzenleListe(ogrenci2, notlar2);
		System.out.println("*******************************");
	}
	
	public void notlariDuzenle(String[] ogrenci,Integer[] notlar) {
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < notlar.length; i++) {
			map.put(ogrenci[i], notlar[i]);
		}
		for (Map.Entry<String,Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
	}
	
	public void notlariDuzenle(String[] ogrenci,Integer[][] notlar) {
		Map<String, Integer[]> map = new HashMap<>();
		for (int i = 0; i < notlar.length; i++) {
			map.put(ogrenci[i], notlar[i]);
		}
		for (Map.Entry<String,Integer[]> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			for (int i = 0; i < entry.getValue().length; i++) {
				System.out.println(entry.getValue()[i]);
			}
		}
	}
	
	public void notlariDuzenleListe(String[] ogrenci, Integer[][]notlar) {
		Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
		for (int i = 0; i < ogrenci.length; i++) {
			map.put(ogrenci[i], new ArrayList<Integer>(Arrays.asList(notlar[i])));
		}
		for ( Map.Entry<String,List<Integer>> entry : map.entrySet()) {
			System.out.println(entry);
		
		}
	}

}
