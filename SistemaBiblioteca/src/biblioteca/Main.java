package biblioteca;

public class Main {

	public static void main(String[] args) {
		//criando a biblioteca
		Library library = new Library();
		
		//cadastrando autores
		Author JackCheng = new Author("Jack Cheng");
		Author EmilyBronte = new Author("Emily Bronte");
		Author CharlieDonlea = new Author("Charlie Donlea");
		Author CJTudor = new Author("C.J. Tudor");
		Author MarkusZusak = new Author("Markus Zusak");
		
		//cadastrando livros
		Book VejoVoceNoEspaco = new Book("Vejo você no espaço",JackCheng);
		Book OMorroDosVentosUivantes = new Book("O morro dos ventos uivantes",EmilyBronte);
		Book AGarotaDoLago = new Book("A garota do lago",CharlieDonlea);
		Book AMeninaQueRoubavaLivros = new Book("A menina que roubava livros",MarkusZusak);
		Book OHomemDeGiz = new Book("O homem de giz",CJTudor);
		
		//cadastrando usuarios
		User Gabriela = new User ("Gabriela");
		User Matheus = new User ("Matheus");
		User AnaClara = new User ("Ana Clara");
		
		
		//cadastrando livos na biblioteca
		library.addBook(OHomemDeGiz);
		library.addBook(AMeninaQueRoubavaLivros);
		library.addBook(AGarotaDoLago);
		library.addBook(OMorroDosVentosUivantes);
		library.addBook(VejoVoceNoEspaco);
		
		System.out.println("- - - - - - - - - - - - - - ");
		//emprestando livros para usuarios
		library.lendBook(OHomemDeGiz, AnaClara);
		library.lendBook(AMeninaQueRoubavaLivros, Matheus);
		
		System.out.println("- - - - - - - - - - - - - - ");
		//tentando emprestar um livro indisponivel
		library.lendBook(OHomemDeGiz, Gabriela);
		
		System.out.println("- - - - - - - - - - - - - - ");
		//tentando pegar mais de um livro emprestado
		library.lendBook(AGarotaDoLago, AnaClara);
		
		System.out.println("- - - - - - - - - - - - - - ");
		//tentando devolver um livro que não foi emprestado
		library.returnBook(VejoVoceNoEspaco, Gabriela);
		
		System.out.println("- - - - - - - - - - - - - - ");
		//exibir lista de livros da biblioteca
		library.AllBooks();
		
		System.out.println("- - - - - - - - - - - - - - ");
		//devolvendo um livro
		library.returnBook(OHomemDeGiz, AnaClara);
		
		System.out.println("- - - - - - - - - - - - - - ");
		//exibir lista de livros da biblioteca
		library.AllBooks();
		
	}

}
