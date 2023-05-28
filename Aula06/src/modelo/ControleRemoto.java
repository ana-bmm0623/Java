package modelo;

public class ControleRemoto implements Controlador {

	private int volume;
	private boolean ligado;
	private boolean tocando;

	public ControleRemoto() {
		super();
		this.volume = 50;
		this.ligado = true;
		this.tocando = false;
	}

	@Override
	public void ligar() {
		setLigado(true);

	}

	@Override
	public void desligar() {
		setLigado(false);

	}

	@Override
	public void abrirMenu() {
		System.out.println("--------MENU----------");
		System.out.println("Esta ligado? " + this.getLigado());
		System.out.println("Esta tocando?" + this.getTocando());
		System.out.print("Volume: " + this.getVolume());
		for (int i = 0; i <= this.getVolume(); i+=5) {
			System.out.print("|");
		}
		System.out.println("");
	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechando Menu...");
	}

	@Override
	public void maisVolume() {
		if (this.getLigado() == true) {
			this.setVolume(getVolume() + 5);
		}
	}

	@Override
	public void menosVolume() {
		if (this.getLigado() == true) {
			this.setVolume(getVolume() - 5);
		}
	}

	@Override
	public void ligarMudo() {
		if (this.getLigado() == true && this.getVolume() > 0) {
			this.setVolume(0);
		}

	}

	@Override
	public void desligarMudo() {
		if (this.getLigado() == true && this.getVolume() == 0) {
			this.setVolume(50);
		}

	}

	@Override
	public void play() {
		if (this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}

	}

	@Override
	public void pause() {
		if (this.getLigado() && (this.getTocando())) {
			this.setTocando(false);
		}

	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean getTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

}
