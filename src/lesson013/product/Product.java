package lesson013.product;

import lesson013.utility.RandomGenerateID;

public class Product {

	private String isim;
	private String id;
	private String productCode;
	private int stok;
	private double fiyat;

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
}
