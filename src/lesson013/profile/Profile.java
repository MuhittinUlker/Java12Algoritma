package lesson013.profile;

public class Profile {

	// attribute,property,field
	public static int toplamProfilSayisi;
	public String profilResmi;
	public String kullaniciAdi;
	public String isim;
	public int takipciSayisi;
	public int takipSayisi;
	public String[] posts;
	public int postSayisi;
	public boolean maviTik;

	public Profile() {
		this.posts = new String[100];
		toplamProfilSayisi++;
	}

	// post oluşturma metodu
	// String isim

	public void postEkle(String isim) {
		System.out.println(isim + " adlı post oluşturuldu.");
		this.posts[postSayisi] = isim;
		postSayisi++;
	}

	public void profilIsmiGuncelle(String isim) {
		this.isim = isim;
	}

	// istegiKabulEt()
	// takiptenCikar()

	public void istegiKabulEt() {
		System.out.println("Kabul edildi");
		this.takipciSayisi++;
		maviTikKontrol();
	}

	public void takiptenCikar() {
		if (takipciSayisi > 0) {
			System.out.println("Arkadaş çıkarıldı");
			this.takipciSayisi--;
			maviTikKontrol();
		} else {
			System.out.println("Takipçiniz yok");
		}
	}

	// kullanıcılara mavitik vermek istiyorum

	private void maviTikKontrol() {
		if (takipciSayisi > 5 && maviTik == false) {
			this.maviTik = true;
		} else if (takipciSayisi <= 5 && maviTik == false) {
			this.maviTik = false;
		}
	}

	// profil bilgilerini göster
	// isim,takipçisayisi,postsayisi,mavitik

	public void profilBilgileriniGoster() {
		System.out.println("İsim: " + this.isim + " Takipçi Sayısı: " + takipciSayisi + " Post Sayısı: " + postSayisi
				+ " Mavi Tik: " + maviTik);
	}

}
