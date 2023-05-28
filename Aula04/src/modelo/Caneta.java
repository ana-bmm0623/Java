package modelo;

public class Caneta {
	private String modelo;
	private double ponta;
	private boolean tampada;
	private String cor;

	public Caneta(String modelo, double ponta, boolean tampada, String cor) {
		super();
		this.modelo = modelo;
		this.ponta = ponta;
		this.tampada = tampada;
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPonta() {
		return ponta;
	}

	public void setPonta(double ponta) {
		this.ponta = ponta;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void imprimir() {
		System.out.println(toString());
		System.out.println("A caneta esta tampada?");
		if (this.tampada == true) {
			System.out.println("Sim, a caneta esta tampada.");
		} else {
			System.out.println("Nao, a caneta esta destampada.");
		}
	}

	public void tampar() {
		this.tampada = true;
	}

	public void destampar() {
		this.tampada = false;
	}

	@Override
	public String toString() {
		return "Caneta [modelo=" + modelo + ", ponta=" + ponta + ", tampada=" + tampada + ", cor=" + cor + "]";
	}

}
