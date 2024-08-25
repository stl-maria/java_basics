package edu.java.oo.caso.estabeleciomento;

import edu.java.oo.caso.EquipamentoMultifuncional;
import edu.java.oo.caso.copiadora.Copiadora;
import edu.java.oo.caso.digitalizadora.Digitalizadora;
import edu.java.oo.caso.impressora.Impressora;

public class Fabrica {
	public static void main (String[] args) {
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		//equip. multifuncional pode ser uma impressora, digitalizadora e copiadora
		//mas uma impressora não pode ser uma digitalizadora e/ou copiadora
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
		
	}
}
