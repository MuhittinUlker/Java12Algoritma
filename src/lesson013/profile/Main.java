package lesson013.profile;

public class Main {

	public static void main(String[] args) {

		Profile profil1 = new Profile();

		profil1.isim = "ahmet";
		profil1.kullaniciAdi = "ahmet1";

		System.out.println(profil1.isim);
		System.out.println(profil1.kullaniciAdi);

		System.out.println(profil1.postSayisi);
		profil1.postEkle("Ankara'da kahve");
		System.out.println(profil1.postSayisi);
		profil1.postEkle("İstanbul'da kahve");
		System.out.println(profil1.postSayisi);

		System.out.println(Profile.toplamProfilSayisi);

		profil1.profilIsmiGuncelle("ahmet22");
		System.out.println(profil1.isim);

		profil1.istegiKabulEt();
		profil1.istegiKabulEt();
		profil1.istegiKabulEt();
		profil1.istegiKabulEt();
		profil1.istegiKabulEt();
		profil1.istegiKabulEt();
		profil1.istegiKabulEt();

		System.out.println(profil1.takipciSayisi);
		System.out.println(profil1.maviTik);

		profil1.profilBilgileriniGoster();

	}

}
