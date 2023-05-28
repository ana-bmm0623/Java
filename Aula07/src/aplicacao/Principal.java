package aplicacao;

import modelo.Lutador;

public class Principal {

	public static void main(String[] args) {
		Lutador l1 = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
		l1.apresentar();
		System.out.println();
		l1.status();
		System.out.println();

		Lutador l2 = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
		l2.apresentar();
		System.out.println();
		l2.perderLuta();
		l2.status();
		System.out.println();

		Lutador l3 = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
		l3.apresentar();
		System.out.println();
		l3.ganharLuta();
		l3.status();
		System.out.println();

		Lutador l4 = new Lutador("Dead Code", "Australia", 28, 1.93, 81.6, 13, 0, 2);
		l4.apresentar();
		System.out.println();
		l4.ganharLuta();
		l4.status();
		System.out.println();
		
		Lutador l5 = new Lutador("Ufocobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
		l5.apresentar();
		System.out.println();
		l5.empatarLuta();
		l5.status();
		System.out.println();
		
		Lutador l6 = new Lutador("Nerdaard", "EUA", 30, 1.81, 105.7, 12, 2, 4);
		l6.apresentar();
		System.out.println();
		l6.ganharLuta();
		l6.status();
		System.out.println();
		
	}
}
