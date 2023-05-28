package aplicacao;

import modelo.ControleRemoto;

public class Principal {
public static void main(String[] args) {
	ControleRemoto c = new ControleRemoto();
	c.ligar();
	c.maisVolume();
	c.ligarMudo();
	c.pause();
	c.abrirMenu();
	c.fecharMenu();
}
}
