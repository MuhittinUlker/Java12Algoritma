package lesson015;

public interface ILibraryService {

	void crateBook();

	void getAllBooks();

	void getActiveBooks();

	void getAuthorByName();

	void deleteBookByID();
	
	void changeStatusToDeleted(String id);
	
	void applyDiscount(String id,double indirimMiktari);
	
}
