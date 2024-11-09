package edu.reprodutor_musical;

public class MP3Player implements ReprodutorMusical{

	@Override
	public void tocar() {
		System.out.println("Tocando.");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando música.");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando música.");
	}
	
}
