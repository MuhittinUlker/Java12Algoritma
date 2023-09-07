package lesson013.product;

import java.util.Scanner;

public class Runner {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		// product sınıfı oluşturalım
		// gerekli fieldları yazalım

		// private değişkenler ile

//		Product product = new Product();
//		product.setIsim("Asus");
//		product.setStok(100);
//		product.setFiyat(15000);
//		System.out.println(product.getBarkod());
//
//		Product product2 = new Product("Apple", 150, 19000);
//		System.out.println(product2.getBarkod());
//
//		System.out.println(product.getIsim());
//		product.isimGuncelle("AsusX");
//		System.out.println(product.getIsim());
//		
//		System.out.println(product2.getProductCode());
		
		Product product3 = new Product("Asus", 2, 500);
		Product product4 = new Product("Lenovo", 2, 600);
		Product product5 = new Product("Casper", 2, 400);
		
		Cart sepet = new Cart();
		sepet.addToCart(product3);
		sepet.addToCart(product3);
		sepet.addToCart(product4);
		sepet.addToCart(product5);
		Product yeniProduct = addProduct();
		sepet.addToCart(yeniProduct);
		System.out.println("--------------------------------------");
		sepet.showCart();
		System.out.println("--------------------------------------");
		System.out.println("Sepetteki toplam ürün sayısı: "+sepet.getAmount());
		System.out.println("Toplam sepet tutarı: "+sepet.getTotalPrice());
		System.out.println("--------------------------------------");
		
		
		
		//menu class oluşturalım
		//1-product ekle
		//2-ürünleri listele (isim,stok,fiyat,id) !!ürünleri listelerken sadece isActive true olanları listele!!
		//3-sepete ürün ekle -- id isteyecek girilen id varsa ekleyecek
		//4-databasede productCoda göre arama, ürün var ise bütün özelliklerini göster
		
		//5-gösterimden kaldır
		//6-user sınıfı, (email,şifre),sepet,bütçe
		//7-user sepete ürün ekle
		//8-user sepetten ürün çıkarabilsin
		//9-ödeme= sepet boşalt, bütçe azalt
		
		//0-çıkış
	}
	public static Product addProduct() {
		Product product = new Product();
		System.out.print("Ürün adı girin: ");
		product.setIsim(scanner.nextLine());
		System.out.print("Ürün stoğu girin: ");
		product.setStok(scanner.nextInt());
		System.out.println("Ürün fiyatı girin: ");
		product.setFiyat(scanner.nextDouble());
		System.out.println("Ürün eklendi.");
		scanner.close();
		Database.getDatabase().add(product);
		return product;
	}

}
