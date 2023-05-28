package modelo;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private Integer rounds;
	private boolean aprovada;

	public Luta(Lutador desafiado, Lutador desafiante, Integer rounds, boolean aprovada) {
		super();
		this.desafiado = desafiado;
		this.desafiante = desafiante;
		this.rounds = rounds;
		this.aprovada = aprovada;
	}

	public Luta() {
		super();
	}

	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			System.out.println("A luta foi aprovada!");
			this.setAprovada(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
		} else {
			System.out.println("A luta nao foi aprovada!");
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}

	public void lutar() {
		if (this.getAprovada() == true) {
			System.out.println("## DESAFIADO ##");
			this.desafiado.apresentar();
			System.out.println("## DESAFIANTE ##");
			this.desafiante.apresentar();

			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(0, 2);
			System.out.println("---------- RESULTADO DA LUTA ------------");
			switch (vencedor) {
			case 0: // Empate
				System.out.println("Empate!");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;

			case 1: // Ganhou desafiado
				System.out.println(this.desafiado.getNome() + " ganhou!");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;

			case 2: // Ganhou desafiante
				System.out.println(this.desafiante.getNome() + " ganhou!");
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				break;
			}
		} else {
			System.out.println("A luta nao pode acontecer!");
		}
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public Integer getRounds() {
		return rounds;
	}

	public void setRounds(Integer rounds) {
		this.rounds = rounds;
	}

	public boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

}
