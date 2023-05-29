package aplicacao;

import modelo.Livro;
import modelo.Pessoa;

public class Principal {
	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[1];
		
		p[0] = new Pessoa("Pedro Sousa", 22, "M");
		p[1] = new Pessoa("Maria da Silva", 25, "F");
	
		l[0] = new Livro("Aprendendo Java", p[0] , 300, p[1]);
		
		l[0].detalhes();
		System.out.println();
		
		l[0].abrir();
		l[0].folhear(100);
		
		System.out.println();
		l[0].detalhes();
	}
}
