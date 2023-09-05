package lesson011;

public class Question59 {

	//UserProfile sınıfı oluşturalım
	
	String name;
	String surname;
	String username;
	String about;	
	String avatar;
	int followers;
	int following;
	int postCount;
	
	public void editProfile() {
		System.out.println(name+" Profilini düzenledi.");
	}
	
	public void createPost() {
		System.out.println("Post oluşturuldu.");
		postCount++;
	}
	
	public void shareStory() {
		System.out.println("Hikaye oluşturuldu.");
	}
	
	public void addFriend() {
		following++;
		System.out.println("Takip edildi.");
	}
	
	public void getInfo() {
		System.out.println("=== Profil Bilgileri ===");
		System.out.println("İsim Soyisim: "+name+" "+surname);
		System.out.println("Kullanıcı Adı: "+username);
		System.out.println("Post Sayısı: "+postCount);
		System.out.println("Takipçi Sayısı: "+followers);
		System.out.println("Takip edilen: "+following);
		System.out.println("=========================");
	}
}
