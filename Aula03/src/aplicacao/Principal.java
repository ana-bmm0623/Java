package aplicacao;

import modelo.Caneta;

public class Principal {
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
//		c1.ponta = 0.5; para alterar teria que utilizar um método set
		c1.tampar();
		c1.status();
		c1.destampar();
		c1.rabiscar();

		Caneta c2 = new Caneta();
		c2.modelo = "Hostnet";
		c2.cor = "Preta";
		c2.destampar();// mesmo que tampada esteja privado, é possível utilizar o método tampar e destampar, pois só quem pode mexer nesse atributo privado é quem esta na classe
		c2.status();
		c2.rabiscar();

	}
}
