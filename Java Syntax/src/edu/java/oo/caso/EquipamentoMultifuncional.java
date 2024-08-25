package edu.java.oo.caso;

import edu.java.oo.caso.copiadora.Copiadora;
import edu.java.oo.caso.digitalizadora.Digitalizadora;
import edu.java.oo.caso.impressora.Impressora;

public class EquipamentoMultifuncional
		implements Copiadora, Digitalizadora, Impressora {

	@Override
	public void copiar() {
		System.out.println("Copiando via Equipamento Multifuncional");
	}

	@Override
	public void digitalizar() {
		System.out.println("Digitalizando via Equipmaneto Multifuncional");
	}

	@Override
	public void imprimir() {
		System.out.println("Imprimindo via Equipamento Multifuncional");
	}

	

}
