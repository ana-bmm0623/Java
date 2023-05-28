package modelo;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;// leve, médio e pesado
	private int vitorias;
	private int derrotas;
	private int empates;

	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas,
			int empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	
	

	public void apresentar() {
		System.out.println("---------------------------------------");
		System.out.println("CHEGOU A HORA !");
		System.out.println("Lutador: " + getNome());
		System.out.println("Origem: " + getNacionalidade());
		System.out.println("Idade: " + getIdade() + " anos");
		System.out.println("Altura: " + getAltura() + " m de altura");
		System.out.println("Peso: " + getPeso() + " Kg");
		System.out.println("Ganhou:" + getVitorias());
		System.out.println("Perdeu:" + getDerrotas());
		System.out.println("Empatou:" + getEmpates());
	}

	public void status() {
		System.out.println(getNome());
		System.out.println("é um peso " + getCategoria());
		System.out.println(getVitorias() + " vitórias");
		System.out.println(getDerrotas() + " derrotas");
		System.out.println(getEmpates() + " empates");
	}

	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}

	public void perderLuta() {
		this.setDerrotas(getDerrotas() + 1);
	}

	public void empatarLuta() {
		this.setEmpates(getEmpates() + 1);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Invalido";
		} else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "Médio";
		} else if (this.peso <= 120.2) {
			this.categoria = "Pesado";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

}
