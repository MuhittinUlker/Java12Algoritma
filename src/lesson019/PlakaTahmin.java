package lesson019;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class PlakaTahmin {

	static Random rnd = new Random();
	static Scanner scanner = new Scanner(System.in);
	private int hak = 3;
	private int oyunSayisi = 1;
	
	private HashMap<Integer, String> sehirler;
	private HashMap<Integer, List<String>> tahminler = new HashMap<>();
	
	public PlakaTahmin() {
		sehirMapiniOlustur();
	}
	
	public void sehirMapiniOlustur() {
		sehirler = new HashMap<>();
		sehirler.put(1, "Adana");
		sehirler.put(1, "Adana");
		sehirler.put(2, "Adıyaman");
		sehirler.put(3, "Afyonkarahisar");
		sehirler.put(4, "Ağrı");
		sehirler.put(5, "Amasya");
		sehirler.put(6, "Ankara");
		sehirler.put(7, "Antalya");
		sehirler.put(8, "Artvin");
		sehirler.put(9, "Aydın");
		sehirler.put(10, "Balıkesir");
		sehirler.put(11, "Bilecik");
		sehirler.put(12, "Bingöl");
		sehirler.put(13, "Bitlis");
		sehirler.put(14, "Bolu");
		sehirler.put(15, "Burdur");
		sehirler.put(16, "Bursa");
		sehirler.put(17, "Çanakkale");
		sehirler.put(18, "Çankırı");
		sehirler.put(19, "Çorum");
		sehirler.put(20, "Denizli");
		sehirler.put(21, "Diyarbakır");
		sehirler.put(22, "Edirne");
		sehirler.put(23, "Elazığ");
		sehirler.put(24, "Erzincan");
		sehirler.put(25, "Erzurum");
		sehirler.put(26, "Eskişehir");
		sehirler.put(27, "Gaziantep");
		sehirler.put(28, "Giresun");
		sehirler.put(29, "Gümüşhane");
		sehirler.put(30, "Hakkari");
		sehirler.put(31, "Hatay");
		sehirler.put(32, "Isparta");
		sehirler.put(33, "Mersin");
		sehirler.put(34, "İstanbul");
		sehirler.put(35, "İzmir");
		sehirler.put(36, "Kars");
		sehirler.put(37, "Kastamonu");
		sehirler.put(38, "Kayseri");
		sehirler.put(39, "Kırkareli");
		sehirler.put(40, "Kırşehir");
		
	}
	
	public HashMap<Integer, String> getSehirler() {
		return sehirler;
	}

	public HashMap<Integer, List<String>> getTahminler() {
		return tahminler;
	}

	public int getHak() {
		return hak;
	}

	public void setHak(int hak) {
		this.hak = hak;
	}

	public int getOyunSayisi() {
		return oyunSayisi;
	}

	public void setOyunSayisi(int oyunSayisi) {
		this.oyunSayisi = oyunSayisi;
	}

	public void tahimEt() {
		//Önce tahmin etmemeiz gerek plakayı belirlememiz laızm
		//randomPlakaOluştur()
		//kullanıcıdan tahmin alcaz
		//bilemezse hakkından düşcez
		//bilsede bilmesede listeye eklicez--> kullanıcının yaptıgı tahmini
		//eğer 3 kere bilemezse --> hakkı dolcak kullancıya bilgi verelim ve yeni oyuna geçsin
		//yeni oyuna geçtiğimizde --> hakkımız yenilencek, oyunSayisi artcak
		
		tahminler.put(oyunSayisi, new ArrayList<>());
		int randomPlaka = randomPlakaOlustur();
		System.out.println("Plaka No = ("+randomPlaka+") hangi şehrin plakasıdır?");
		for (int i = 1; hak > 0; i++) {
			System.out.print("Tahminizi girin:");
			String tahmin = OyunMenusu.scanner.nextLine();
			tahminler.get(oyunSayisi).add(tahmin);
			if (tahmin.equalsIgnoreCase(sehirler.get(randomPlaka))) {
				System.out.println("Tebrikler "+i+" denemede buldunuz.");
				break;
			}
			hak--;
			System.out.println("Tahmininiz yanlış. Kalan hak: "+hak);
		}
		hak=3;
		oyunSayisi++;
	}
	
	public int randomPlakaOlustur() {
		List<Integer> plakaNoları = new ArrayList<>(getSehirler().keySet());
		return plakaNoları.get(rnd.nextInt(plakaNoları.size()));
	}

	public void tahminListem() {
		for (Map.Entry<Integer,List<String>> entry : tahminler.entrySet()) {
			System.out.println(entry.getKey()+". oyun tahminleri--->"+entry.getValue());
		}
	}
}
 
