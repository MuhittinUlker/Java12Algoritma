package lesson015;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private String name;
	private List<Book> bookList;
	private List<Customer> customerList;
	
	
	public Library() {
		this.bookList=new ArrayList<Book>();
		this.customerList = new ArrayList<Customer>();
	}
	
	public Library(String name) {
		this();
		this.name = name;
	}

	

	public List<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
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
