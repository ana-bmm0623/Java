package aplicacao;

import modelo.Aula;

public class Principal {

	public static void main(String[] args) {
		Aula videoAula = new Aula();
		videoAula.professor = "Guanabara";
		videoAula.materia = "Java OO";
		videoAula.duracao = "20:30";
		videoAula.iniciarAula();
		videoAula.status();
		
	}
}
