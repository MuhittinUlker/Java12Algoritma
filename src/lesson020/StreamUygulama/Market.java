package lesson020.StreamUygulama;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Market {

	static Scanner scanner = new Scanner(System.in);
	List<Product> productList;
	Map<String, Double> urunlerListesi;
	Map<String, Integer> cart=new HashMap<>();
	
	public Market() {
		createProducts();
		listOfProducts();
	}
		
	public void createProducts() {
		EProduct[] products = EProduct.values();
		
		productList = Arrays.asList(products)
			.stream()
			.map(p-> new Product(p.name(), p.getFiyat()))
			.collect(Collectors.toList());
	}
	
	public void listOfProducts() {
		urunlerListesi = productList.stream().collect(Collectors.toMap(u->u.getName(), u->u.getPrice()));
	}
	
	public void showListofProducts() {
		urunlerListesi.forEach((k,v)->System.out.println(k+" Fiyatı --> "+v));
	}
	
	public void addToCart() {
		System.out.println("Sepete eklemek istediğiniz ürün adı: ");
		String input = scanner.nextLine();
		if (urunlerListesi.containsKey(input)) {
			cart.put(input, cart.getOrDefault(input, 0)+1);
		}else {
			System.out.println("Sepete eklemek istediğiniz ürün markette yok..");
		}
	}
	
	public void showCart() {
		System.out.println("Sepetiniz: ");
		cart.forEach((k,v)->System.out.println(k+"-"+v));
	}
	
	public void getAvg() {
		double ort =productList.stream()
				.filter(p->p.getPrice()<50)
				.collect(Collectors.averagingDouble(p->p.getPrice()));
		System.out.println(ort);
	}
}
