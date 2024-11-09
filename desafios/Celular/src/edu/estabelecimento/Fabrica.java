package edu.estabelecimento;

import edu.aparelho_telefonico.TelefoneFixo;
import edu.equipamento_multifuncional.Celular;
import edu.navegador_internet.NavegadorInternet;

public class Fabrica {

	public static void main(String[] args) {
		
		//celular pode ter as mesmas funções que o aparelho de telefone, reprodutor musical e navegador de internet
		System.out.println("Produto: iPhone");
		Celular iPhone = new Celular();
		
		iPhone.atender();
		iPhone.tocar();
		
		System.out.println("###################");
		
		System.out.println("Produto: Vtech Vtc105W");
		TelefoneFixo VtechVtc105W = new TelefoneFixo();
		
		VtechVtc105W.atender();
		VtechVtc105W.ligar();
		
		
		
	}

}
