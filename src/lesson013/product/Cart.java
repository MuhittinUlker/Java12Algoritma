package lesson013.product;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private double totalPrice;
	private int amount;
	private List<Product> products;
	
	public Cart() {
		this.products = new ArrayList<>();
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public int getAmount() {
		return amount;
	}

	public List<Product> getProducts() {
		return products;
	}

	/*
	 * sepete ekle metodu
	 * totalprice güncelle
	 * amount güncelle
	 * stok kontrolü yap
	 */
	
	public void addToCart(Product product) {
		if (!(product.getStok()<=0)) {
			getProducts().add(product);
			product.setStok(product.getStok()-1);
			setAmount(getAmount()+1);
			setTotalPrice(getTotalPrice()+product.getFiyat());
			System.out.println(product.getIsim()+" sepete eklendi.");
		}else {
			System.out.println("Ürün sepete eklenemedi. Stokta yok.");
			product.removeFromListing();
		}
	}

	public void showCart() {
		for (Product product : products) {
			System.out.println("Ürün: "+product.getIsim()+" Fiyatı: "+product.getFiyat());
		}
	}
	

	
	
}
