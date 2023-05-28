package aplicacao;

import modelo.Luta;
import modelo.Lutador;

public class Principal {

	public static void main(String[] args) {
		Lutador l1 = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);

		Lutador l2 = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);

		Lutador l3 = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);

		Lutador l4 = new Lutador("Dead Code", "Australia", 28, 1.93, 81.6, 13, 0, 2);
		
		Lutador l5 = new Lutador("Ufocobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
		
		Lutador l6 = new Lutador("Nerdaard", "EUA", 30, 1.81, 105.7, 12, 2, 4);

		Luta UEC01 = new Luta();
		UEC01.marcarLuta(l1, l2);
		UEC01.lutar();
		
		System.out.println();
		
		Luta UEC02 = new Luta();
		UEC02.marcarLuta(l1, l6);
		
		System.out.println();
		Luta UEC03 = new Luta();
		UEC03.marcarLuta(l1, l1);
	}
}
