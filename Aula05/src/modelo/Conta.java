package modelo;

public class Conta {
	private int numConta;
	private String tipo; // CC ou CP
	private String dono;
	private double saldo;
	private boolean status; // aberta = true ou fechada = false

	public Conta() {
		super();
		this.saldo = 0;
		this.status = false;
	}

	public void estadoAtual() {
		System.out.println("-----------------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
	}

	public void abrirConta(String tipo1) {
		this.setStatus(true);
		this.setTipo(tipo1);
		if (tipo1 == "CC") {
			this.setSaldo(50);
		} else if (tipo1 == "CP") {
			this.setSaldo(150);
		}
	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out
					.println("Voce tem " + this.saldo + ". Voce precisa sacar todo o valor antes de fechar a conta .");
			this.sacarTodoValor();
		} else if (this.getSaldo() < 0) {
			this.pagarMensal();
		} else {
			this.setStatus(false);
		}
	}

	public void depositar(Double valor) {
		if (this.status = true) {
			this.setSaldo(getSaldo() + valor);
			System.out.println("Deposito realizado!");
		} else {
			System.out.println("Esta conta esta fechada. Nao e possivel realizar o deposito");
		}
	}

	public void sacar(Double valor) {
		if (this.getStatus() == true) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque realizado!");
			} else {
				System.out.println("Saldo insuficiente!");
			}
		} else {
			System.out.println("Impossivel sacar de uma conta fechada!");
		}
	}

	public void sacarTodoValor() {
		this.saldo = saldo - saldo;
	}

	public void pagarMensal() {
		if (this.status = true) {
			if (this.tipo == "CC") {
				this.saldo = saldo - 12;
			} else {
				this.saldo = saldo - 20;
			}
		}
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
