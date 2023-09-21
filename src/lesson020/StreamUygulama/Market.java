package lesson020.StreamUygulama;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Market {

	List<Product> productList;
	Map<String, Double> urunlerListesi;
	
	public Market() {
		createProducts();
	}
		
	public void createProducts() {
		EProduct[] products = EProduct.values();
		
		productList = Arrays.asList(products)
			.stream()
			.map(p-> new Product(p.name(), p.getFiyat()))
			.collect(Collectors.toList());
	}
	
	
	
	
}
