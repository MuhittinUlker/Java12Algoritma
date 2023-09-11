package lesson015;

public class LibraryServiceImpl implements ILibraryService {

	@Override
	public void crateBook() {
		String bookName = Utility.getStringValue("Kitap ismini girin:");
		String authorName = Utility.getStringValue("Yazar ismini girin:");
		String publisherName = Utility.getStringValue("Yayın Evi ismini girin:");
		String categoryName = Utility.getStringValue("Kitap kategorisini girin:");
		Category category = new Category(categoryName);
		double price = Utility.getDoubleValue("Kitap ücretini girin:");
		Book book = new Book(bookName, authorName, publisherName, price, category);
		if (Runner.library.getBookList().contains(book)) {
			System.out.println("Kitap sistemde var..");
		}
		Runner.library.getBookList().add(book);
		System.out.println(bookName + " sisteme eklendi.");
	}

	@Override
	public void getAllBooks() {
		System.out.println("Kitap Adı\tKitap Yazarı\tKategorisi\tKitap Fiyatı");
		for (Book book : Runner.library.getBookList()) {
			System.out.println(
					book.getName() + "\t" + book.getAuthor() + "\t" + book.getCategory() + "\t" + book.getPrice());
		}
	}

	@Override
	public void getActiveBooks() {
		System.out.println("Kitap Adı\tKitap Yazarı\tKategorisi\tKitap Fiyatı");
		for (Book book : Runner.library.getBookList()) {
			if (book.geteStatus().name().equals("ACTIVE")) {
				System.out.println(
						book.getName() + "\t" + book.getAuthor() + "\t" + book.getCategory() + "\t" + book.getPrice());
			}
		}
	}

	@Override
	public void getAuthorByName() {
		String author = Utility.getStringValue("Yazar ismi girin:");
		int index = 1;
		for (Book book : Runner.library.getBookList()) {
			if (book.getAuthor().equalsIgnoreCase(author)) {
				System.out.println(index + "\t" + book.getName() + "\t" + book.getAuthor() + "\t" + book.getCategory()
						+ "\t" + book.getPrice());
				index++;
			}
		}
		if (index == 1) {
			System.out.println("Aradığınız yazara ait bir kitap bulunamadı.");
		}
	}

	@Override
	public void deleteBookByID() {
		for (Book book : Runner.library.getBookList()) {
			System.out.println(book.getName() + " " + book.getId());
		}
		int index = 1;
		String delID = Utility.getStringValue("Silmek istediğiniz kitabın ID'sini girin: ");
		for (int i = 0; i < Runner.library.getBookList().size() - 1; i++) {
			if (Runner.library.getBookList().get(i).getId().equalsIgnoreCase(delID)) {
				Runner.library.getBookList().get(i).seteStatus(EStatus.DELETED);
				;
				index--;
				System.out.println(delID + " ID'li kitap silindi.");
			}
		}
		if (index == 1) {
			System.out.println("Aradığınız ID'de bir kitap bulunamadı.");
		}
	}

}
