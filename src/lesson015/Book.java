package lesson015;

import java.time.LocalDateTime;
import java.util.UUID;

public class Book {

	private String id;
	private String name;
	private String author;
	private String publisher;
	private double price;
	private EStatus eStatus;
	private Category category;
	
	private LocalDateTime rentDate;
	private LocalDateTime returnDate;

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Book() {
		this.id = UUID.randomUUID().toString();
		this.eStatus = EStatus.ACTIVE;
	}

	public Book(String name, String author, String publisher, double price, Category category) {
		this();
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.category = category;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public EStatus geteStatus() {
		return eStatus;
	}

	public void seteStatus(EStatus eStatus) {
		this.eStatus = eStatus;
	}

	public LocalDateTime getRentDate() {
		return rentDate;
	}

	public void setRentDate(LocalDateTime rentDate) {
		this.rentDate = rentDate;
	}

	public LocalDateTime getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDateTime returnDate) {
		this.returnDate = returnDate;
	}

}
