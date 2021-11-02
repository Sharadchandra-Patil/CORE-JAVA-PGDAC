package tester;

import static com.app.core.Book.sdf;
import static com.app.core.Category.valueOf;

import java.util.LinkedHashSet;
import java.util.Scanner;

import com.app.core.Book;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// empty HS
			LinkedHashSet<Book> books = new LinkedHashSet<>();// capa : 16 L.F 0.75f
			while (true) {
				System.out.println("Enter book details : isbn,category,price,publishDate,authorName,quantity");
				System.out.println(
						"Added " + books.add(new Book(sc.next(), valueOf(sc.next().toUpperCase()),
								sc.nextDouble(), sdf.parse(sc.next()), sc.next(),sc.nextInt())));
				System.out.println("Library contains :");
				for(Book b : books)
					System.out.println(b);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
