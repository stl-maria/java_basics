package edu.equipamento_multifuncional;

import edu.aparelho_telefonico.AparelhoTelefonico;
import edu.navegador_internet.NavegadorInternet;
import edu.reprodutor_musical.ReprodutorMusical;

public class Celular implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página via celular.");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba via celular.");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página via celular.");
	}

	@Override
	public void ligar() {
		System.out.println("Ligando via celular.");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação via celular.");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz via celular.");
	}

	@Override
	public void tocar() {
		System.out.println("Tocando musica via celular.");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando musica via celular.");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando musica via celular");
	}

}
