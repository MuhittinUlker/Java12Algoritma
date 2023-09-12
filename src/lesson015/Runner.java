package lesson015;

public class Runner {

	static Library library = new Library("Milli Kütüphane");
	static CustomerManager customerManager = new CustomerManager();
	static LibraryServiceImpl serviceImpl = new LibraryServiceImpl();
	
	public static void main(String[] args) {

		library.getBookList().add(new Book("XKitabı", "Ali", "AYayın", 150, new Category("Okul")));
		library.getBookList().add(new Book("YKitabı", "Ali", "BYayın", 200, new Category("Roman")));
		library.getBookList().add(new Book("ZKitabı", "Ayşe", "CYayın", 300, new Category("Öykü")));
		library.getBookList().add(new Book("DKitabı", "Mehmet", "DYayın", 350, new Category("Hikaye")));

		librarySystemMenu();

	}

	public static void systemMenu() {

		while (true) {
			showMenu();
			int election = Utility.getIntValue("Seçiminizi girin:");

			switch (election) {
			case 1:
				serviceImpl.crateBook();
				break;

			case 2:
				serviceImpl.getAllBooks();
				break;
			case 3:
				serviceImpl.getActiveBooks();
				break;
			case 4:
				serviceImpl.getAuthorByName();
				break;
			case 5:
				serviceImpl.deleteBookByID();
				break;
			case 6:
				serviceImpl.getAllBooks();
				String id = Utility.getStringValue("Silinecek kitabın id'sini girin: ");
				serviceImpl.changeStatusToDeleted(id);
				break;
			case 7:
				serviceImpl.getAllBooks();
				id = Utility.getStringValue("İndirim uygulanacak kitap ID'si :");
				double discountAmount = Utility.getDoubleValue("İndirim miktarı: ");
				serviceImpl.applyDiscount(id, discountAmount);
				break;
			case 0:
				System.out.println("Admin sayfasından çıktınız.");
				librarySystemMenu();
				break;

			default:

				break;
			}

		}
	}

	private static void showMenu() {
		System.out.println(" ___________________________________");
		System.out.println("|                                   |");
		System.out.println("| 1- Sisteme Kitap Ekle             |");
		System.out.println("| 2- Sistemdeki Kitapları Listele   |");
		System.out.println("| 3- Aktif Olan Kitapları Listele   |");
		System.out.println("| 4- Yazar İsmine Göre Arama        |");
		System.out.println("| 5- Kitap ID'sine Göre Silme       |");
		System.out.println("| 6- Status Değiştir                |");
		System.out.println("| 7- İndirim Uygula                 | ");
		System.out.println("| 0- LogOut                         |");
		System.out.println("|___________________________________|");

	}

	public static void librarySystemMenu() {
		System.out.println("1- Admin Girişi");
		System.out.println("2- User İşlemleri");
		
		
		while (true) {
			int secim = Utility.getIntValue("Seçiminizi girin: ");
			switch (secim) {
			case 1:
				systemMenu();	
				break;
			case 2:
				userPage();
				break;
			case 0:
				System.out.println("Sistemden çıkış yaptınız.");
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
	
	public static void userPage() {
		
		while (true) {
			System.out.println("1- Register");
			System.out.println("2- Login");
			System.out.println("0- Sistemi Kapat");
			int secim = Utility.getIntValue("Seçiminizi girin: ");
			switch (secim) {
			case 1:
				customerManager.register();
				break;
			case 2:
				Customer customer = customerManager.login();
				if (customer!=null) {
					userApplication(customer);
				}				
				break;
			case 0:
				System.out.println("Sistemden çıkış yaptınız.");
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
	
	public static void userApplication(Customer customer) {
		
		while (true) {
			System.out.println("1- Kitap Kirala");
			System.out.println("0- Logout");
			int secim = Utility.getIntValue("Seçiminizi girin: ");
			switch (secim) {
			case 1:
				//TODO: kirala metod
				break;
			case 0:
				System.out.println("Logout yaptınız.");
				systemMenu();
				break;
			default:
				break;
			}
		}
	}
	
	
}
