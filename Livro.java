package livro;

/*Crie uma classe "Livro" que possua atributos como título, autor e número de páginas. 
 *Adicione métodos para definir e obter esses atributos. */

public class Livro {
	private String titulo;
	private String autor;
	private int numeroPaginas;
	
	public Livro(String titulo, String autor, int numeroPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
}
