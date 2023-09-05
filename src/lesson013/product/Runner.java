package lesson013.product;

public class Runner {

	public static void main(String[] args) {

		// product sınıfı oluşturalım
		// gerekli fieldları yazalım

		// private değişkenler ile

		Product product = new Product();
		product.setIsim("Asus");
		product.setStok(100);
		product.setFiyat(15000);
		System.out.println(product.getBarkod());

		Product product2 = new Product("HP", 150, 19000);
		System.out.println(product2.getBarkod());

		System.out.println(product.getIsim());
		product.isimGuncelle("AsusX");
		System.out.println(product.getIsim());

		product.veriTabanınaKaydet();

	}

}
