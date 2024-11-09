package edu.aparelho_telefonico;

public class TelefoneFixo implements AparelhoTelefonico{

	@Override
	public void ligar() {
		System.out.println("Ligando.");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação.");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz.");
	}

}
