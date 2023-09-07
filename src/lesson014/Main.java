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
		adminManager.basvuruReddet(account3);
		System.out.println(account3.getMoney());
		
		
	}

}
