package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

//isbn(string),category(enum),price(double),publishDate,authorName(string),quantity(int)
public class Book {
	private String isbn;
	private Category bookCategory;
	private double price;
	private Date publishDate;
	private String authorName;
	private int quantity;
	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}

	public Book(String isbn, Category bookCategory, double price, Date publishDate, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.bookCategory = bookCategory;
		this.price = price;
		this.publishDate = publishDate;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", bookCategory=" + bookCategory + ", price=" + price + ", publishDate="
				+ sdf.format(publishDate) + ", authorName=" + authorName + ", quantity=" + quantity + "]";
	}

	// fulfill the contract
	@Override
	public boolean equals(Object o) {
		System.out.println("in books'eq");
		if (o instanceof Book)
			return isbn.equals(((Book) o).isbn);
		return false;
	}
	//O(1) :time complexity
	@Override
	public int hashCode()
	{
		System.out.println("in book's hc");
		return isbn.hashCode();
	}
	

}
