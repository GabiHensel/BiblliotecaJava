package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class User {
	//nome do usuario e livro emprestado
	private String name;
	private List<Book> borrowedBooks;
	
	//construtor da classe
	public User(String name) {
		this.name = name;
		this.borrowedBooks = new ArrayList<>();
	}
	
	//metodos para acessar as informações dos usuarios
	public String getName() {
		return name;
	}
	
	public List<Book> getBorrowedBook() {
		return borrowedBooks;
	}
	
	//metodo para emprestar um livro
	public void borrowBook(Book book) {
		borrowedBooks.add(book);
	}
	
	//metodo para devolver um livro
	public void returnBook(Book book) {
		borrowedBooks.remove(book);
	}
}
