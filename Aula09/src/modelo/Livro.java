package modelo;

public class Livro implements Publicacao {
	private String titulo;
	private Pessoa autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;

	public Livro(String titulo, Pessoa autor, Integer totPaginas, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}

	public Livro() {

	}

	public void detalhes() {
		System.out.println("Titulo: " + this.getTitulo());
		System.out.println("Nome do autor: " + this.getAutor().getNome());
		System.out.println("Total de paginas: " + this.getTotPaginas());
		System.out.println("O livro esta aberto: " + this.getAberto());
		System.out.println("Pagina atual: " + this.getPagAtual());
		System.out.println("Leitor: " + this.getLeitor().getNome());
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Pessoa getAutor() {
		return autor;
	}

	public void setAutor(Pessoa autor) {
		this.autor = autor;
	}

	public Integer getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(Integer totPaginas) {
		this.totPaginas = totPaginas;
	}

	public Integer getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(Integer pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean getAberto() {
		return aberto = this.setAberto(true);
	}

	public boolean setAberto(boolean aberto) {
		return this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		this.aberto = true;

	}

	@Override
	public void fechar() {
		this.setAberto(false);

	}

	@Override
	public void folhear(int p) {
		if (this.aberto = true) {
			if (p > this.getTotPaginas()) {
				this.setPagAtual(0);
			} else {
				this.pagAtual = p;
			}
		} else {
			System.out.println("O livro esta fechado.");
		}

	}

	@Override
	public void avancarPag() {
		this.setPagAtual(getPagAtual() + 1);

	}

	@Override
	public void voltarPag() {
		this.setPagAtual(getPagAtual() - 1);

	}

}
