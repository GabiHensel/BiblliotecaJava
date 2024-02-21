package biblioteca;

public class Book {
	//titulo do livro, nome do autor e status de disponibilidade 
	private String title;
	private Author author;
	private boolean available;
	
	//construtor da classe 
	public Book(String title, Author author) {
		this.title = title;
		this.author = author;
		this.available = true;
	}
	
	//metodos para acessar as informações dos livros 
	public String getTitle() {
		return title;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public boolean isAvailable() {
		return available;
	}
	
	//metodo para alterar o status de disponibilidade do livro 
	public void setAvailable(boolean available) {
		this.available = available;
	}
}
