package modelo;

public class Aula {
	public String professor;
	public String materia;
	public String duracao;
	public boolean inicioDaAula;

	public void iniciarAula() {
		this.inicioDaAula = true;

	}

	public void terminarAula() {
		this.inicioDaAula = false;
	}

	public void status() {
		System.out.println("Professor: " + this.professor);
		System.out.println("Materia: " + this.materia);
		System.out.println("Duracao: " + this.duracao + " minutos");
		System.out.println("A aula iniciou? " + this.inicioDaAula);
	}
}
