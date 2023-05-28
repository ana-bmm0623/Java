package modelo;

public class Caneta {
	public String modelo;
	public String cor;
	private double ponta;
	protected int carga;
	private boolean tampada;

	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Caneta " + this.cor); // this é uma auto referenciação
		System.out.println("Ponta: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("A caneta esta tampada? " + this.tampada);
	}

	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("ERRO! Nao da para rabiscar, estou tampada!");
		} else {
			System.out.println("Estou rasbiscando");
		}

	}

	public void tampar() {
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}
}
