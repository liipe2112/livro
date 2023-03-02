package livro;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("* Cadastre o Livro inserindo as informações solicitadas *\n" );
		
		System.out.println("Informe o título do livro: ");
		String titulo = entrada.nextLine();
		
		System.out.println("Informe o nome do autor: ");
		String autor = entrada.nextLine();
		
		System.out.println("Informe o número de páginas: ");
		int numeroPaginas = entrada.nextInt();
		
		System.out.println();
		Livro livro = new Livro(titulo, autor, numeroPaginas);
		
		System.out.println(String.format("O titulo do seu livro é: %s", titulo));
		System.out.println(String.format("O nome do autor do seu livro é: %s", autor));
		System.out.println(String.format("A quantidade de páginas do seu livro é: %d páginas", numeroPaginas));
	}
}
