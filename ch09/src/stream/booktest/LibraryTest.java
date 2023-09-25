package stream.booktest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Book {
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}

}

public class LibraryTest {

	public static void main(String[] args) {
		
		List<Book> bookList = new ArrayList();
		
		bookList.add(new Book("자바",25000));
		bookList.add(new Book("파이썬",1500));
		bookList.add(new Book("안드로이드",30000));
		
		//책의 총합 
		Stream<Book> stream = bookList.stream();
		int total = bookList.stream()	
							.mapToInt(t -> t.getPrice())
							.sum();
		System.out.println("모든 책의 가격의 합:" + total+"원");
		
		System.out.print("20000만원 이상인 책이름:" );
		//20000만원 이상 
		bookList.stream()	
				.filter(b ->b.getPrice() >=20000)
				.map(b -> b.getName())
				.sorted()	
				.forEach(n -> System.out.print(n + ","));
		
	}

}
