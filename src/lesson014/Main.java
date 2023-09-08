package lesson014;

public class Main {

	public static void main(String[] args) {
		
		//Account,
		//accountNo, money
		
		//paraYatir()---> hesabımıza bizim belirttiğimiz miktarda para eklensin 
		//ne kadar yatırdığı ve güncel bakiye söyleyelim , max 10000 yatırabilsin
		//paraCek()-----> hesabımızdan çekilen miktar düşülsün
		//ne kadar çektiğini ve güncel bakiye söyleyelim , max 5000 çekebilsin
		
		//accManager sınıfı yaratıp metodları taşıyalım 
		
		//User sınıfı oluşturalım
		//isim,soyisim,email,account
		
		//user oluşturduğumda otomatik mail oluşsun
		
		//kredi başvuru; 
		//çekmek istediği tutar ve hesapno alalım
		//admin onayından sonra para hesaba geçecek
		
		//krediBorcunuOde()
		//dışarıdan nakit
		//ödenecek kredi borcu var mı
		//borç var ise ödeme gerçekleşsin ve kredi borcundan düşülsün ve güncel borcu söyleyelim
		//ve her ödemede kredi puanını 10 puan arttıralım.
		//max kredi tutarı kadar ödeyebilsin
		
		//başvuru onaylanınca ya da reddedilince usera mail atalım
		
		Account account = new Account(1000);
		
		AccountManager accountManager = new AccountManager();
		AdminManager adminManager = new AdminManager();
		accountManager.paraCek(account,100);
		accountManager.hesapBilgileri(account);
		
		User user = new User("mehmet", "yardımcı");
		Account account3 = new Account(3000);
		user.setAccount(account3);
		System.out.println(user.getEmail());
		
		UserManager manager = new UserManager();
		manager.krediBasvurusu(account3, 10000.0);
		try {
			adminManager.basvuruOnayla(user);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(account3.getMoney());
		
		manager.krediOde(user, 5000, false);
		System.out.println(account3.getKrediBorcu());
		System.out.println(user.getKrediPuanı());
		System.out.println(account3.getMoney());
		
		manager.krediBasvurusu(account3, 20000.0);
		try {
			adminManager.basvuruOnayla(user);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
