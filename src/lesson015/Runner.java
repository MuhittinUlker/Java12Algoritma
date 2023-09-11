package lesson015;

public class Runner {

	static Library library = new Library("Milli Kütüphane");

	public static void main(String[] args) {

		library.getBookList().add(new Book("XKitabı", "Ali", "AYayın", 150, new Category("Polisiye")));
		library.getBookList().add(new Book("YKitabı", "Ali", "BYayın", 200, new Category("Roman")));
		library.getBookList().add(new Book("ZKitabı", "Ayşe", "CYayın", 300, new Category("Öykü")));
		library.getBookList().add(new Book("DKitabı", "Mehmet", "DYayın", 350, new Category("Hikaye")));

		systemMenu();

	}

	public static void systemMenu() {

		LibraryServiceImpl serviceImpl = new LibraryServiceImpl();

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
			case 0:
				System.out.println("Sistemden çıktınız.");
				System.exit(0);
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
		System.out.println("| 0- Çıkış                          |");
		System.out.println("|___________________________________|");

	}

}
