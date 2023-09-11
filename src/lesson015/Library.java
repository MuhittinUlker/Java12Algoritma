package lesson015;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private String name;
	private List<Book> bookList;
	
	
	public Library() {
		this.bookList=new ArrayList<Book>();
	}
	
	public Library(String name) {
		this();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Book> getBookList() {
		return bookList;
	}
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	
}
