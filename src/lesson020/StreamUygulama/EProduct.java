package lesson020.StreamUygulama;

public enum EProduct {

	Cips(50),Kola(60),Gofret(15),Sut(20),Kek(10);
	
	private double fiyat;
	
	private EProduct(double fiyat) {
		this.fiyat=fiyat;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}
	
	
	
}
