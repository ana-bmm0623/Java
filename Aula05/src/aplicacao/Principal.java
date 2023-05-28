package aplicacao;

import modelo.Conta;

public class Principal {
	public static void main(String[] args) {
		Conta p1 = new Conta();
		p1.setNumConta(1111);
		p1.setDono("Jubileu");
		p1.abrirConta("CC");
		p1.depositar(100.0);
		p1.estadoAtual();

		Conta p2 = new Conta();
		p2.setNumConta(2222);
		p2.setDono("Creuza");
		p2.abrirConta("CP");
		p2.depositar(500.0);
		p2.sacar(1000.0);
		p2.estadoAtual();
	}
}
