package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }
    
    //informa todos os livros da biblioteca, seus autores e status
    public void AllBooks() {
    	System.out.println("Livros da biblioteca:");
    	String status;
    	
    	for (int i = 0; i<books.size();i++){
  
    		if(books.get(i).isAvailable()) {
    			status = "disponível";
    		}else {
    			status = "indisponível";
    		}
    		
    		System.out.println("Livro: " +books.get(i).getTitle()+ " - Autor: "+ books.get(i).getAuthor().getName()+" - Status: "+ status);
    	}
    }
    
    //metodo para adicionar um novo livro a biblioteca
    public void addBook(Book book) {
    	books.add(book);
    	System.out.println("Livro: "+book.getTitle()+" adicionado a biblioteca");
    	this.AllBooks();
    	System.out.println("- - - - - - - - - - - - - - ");
    }
    
    //metodo para emprestar um livro
    public void lendBook(Book book,User user) {
    	//verifica se o livro esta disponivel na biblioteca
    	if(!book.isAvailable()) {
    		System.out.println("O livro \""+ book.getTitle() +"\" já foi emprestado e não está disponível na biblioteca");
    		return;
    	}
    	
    	//verifica se o usuario que deseja realizar o emprestimo possui livros emprestados
    	if (user.getBorrowedBook().size() !=0 ) {
    		System.out.println("O usuario "+ user.getName()+ " já possui um livro emprestado, devolva o livro para pegar outro emprestado");
    		return;
    	}
    	
    	//faz o emprestimo do livro apos as verificações 
    	//atualiza o livro para indisponivel
    	book.setAvailable(false);
    	
    	//empresta o livro para o usuario
    	user.borrowBook(book);
    	System.out.println("O usuario "+ user.getName()+ " pegou o livro \"" +book.getTitle()+ "\" emprestado.");
    }
    
    //metodo para devolver um livro
    public void returnBook(Book book, User user) {
    	//verifica se o usuario pegou emprestado o livro que deseja devolver
    	if(!user.getBorrowedBook().contains(book)) {
    		System.out.println("O usuario "+ user.getName()+ " não pegou o livro \""+book.getTitle()+"\" emprestado, então não pode fazer a devolução do mesmo.");
    		return;
    	}
    	
    	//faz a devolução do livro pelo usuario, se passar pela verificação
    	//define o status do livro como disponivel
    	book.setAvailable(true);
    	
    	//remove o livro dos empréstimos do usuario
    	user.returnBook(book);
    	System.out.println("O usuário "+ user.getName()+" devolveu o livro \""+book.getTitle()+"\" a biblioteca.");
    }
    
}
