package aplicacao;

import modelo.Caneta;

public class Principal {
	public static void main(String[] args) {
		Caneta c1 = new Caneta("Bic", 0.5, false, "Azul");
		c1.setTampada(true);
		c1.imprimir();
		System.out.println();

		c1.setModelo("Uniball");
		c1.setPonta(0.3);
		c1.imprimir();
		System.out.println();

		Caneta c2 = new Caneta("Bic", 1.0, true, "Preta");
		c2.destampar();
		c2.imprimir();

		System.out.println();
		Caneta c3 = new Caneta("Cis", 0.9, true, "Verde");
		c3.imprimir();
	}
}
