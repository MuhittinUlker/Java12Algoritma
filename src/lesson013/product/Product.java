package lesson013.product;

import java.util.Scanner;

import lesson013.utility.RandomGenerateID;

public class Product {
	static Scanner scanner = new Scanner(System.in);
	
	private String isim;
	private String id;
	private String productCode;
	private int stok;
	private double fiyat;
	private boolean isActive=true;

	public Product() {
		super();
		this.id = RandomGenerateID.generateID();
		
	}

	public Product(String isim, int stok, double fiyat) {
		super();
		this.isim = isim;
		this.stok = stok;
		this.fiyat = fiyat;
		this.id = RandomGenerateID.generateID();
		this.productCode =  RandomGenerateID.generateProductCode(isim);
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getBarkod() {
		return id;
	}

	public int getStok() {
		return stok;
	}

	public void setStok(int stok) {
		if (stok < 0) {
			System.out.println("Stok sayısı 0'dan az olamaz.");
		} else {
			this.stok = stok;
		}
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		if (fiyat < 0) {
			System.out.println("Ürün fiyatı 0'dan az olamaz.");
		} else {
			this.fiyat = fiyat;
		}
	}

	public void isimGuncelle(String isim) {
		setIsim(isim);
	}

	public void veriTabanınaKaydet() {
		System.out.println(getIsim() + " veri tabanına kaydedildi.");
	}
	
	public void removeFromListing() {
			setIsActive(false);
			System.out.println(getIsim()+" gösterimden kaldırıldı.");
	}
	public void addToListing() {
			setIsActive(true);
			System.out.println(getIsim()+" gösterime alındı.");
	}
	
	public static Product addProduct() {
		
		System.out.print("Ürün adı girin: ");
		String name =(scanner.nextLine());
		System.out.print("Ürün stoğu girin: ");
		int stock =(scanner.nextInt());
		System.out.println("Ürün fiyatı girin: ");
		double price =(scanner.nextDouble());
		System.out.println("Ürün eklendi.");
		Product product = new Product(name,stock,price);
		scanner.close();
		Database.getDatabase().add(product);
		return product;
	}
}
