package edu.java.basico;

public class EstruturasCondicionais {

	public static void main(String[] args) {
		int nota = 70;
		String graduacao = null;
		
		if (nota >= 80) {
			graduacao = "A";
		} else if (nota < 80 && nota >=70) {
			graduacao = "B";
		} else if (nota < 70 && nota >= 60) {
			graduacao = "C";
		} else if (nota < 60 && nota >= 0) {
			graduacao = "D";
		} else {
			graduacao = "";
		}

		switch (graduacao) {
			case "A":
			case "B":
				System.out.println("Aluno aprovado"); //caso "A" ou "B"
				break; //interromper a analise
			case "C":
			case "D":
				System.out.println("Não aprovado"); //caso "C" ou "D"
				break; //interromper a analise
			default:
				System.out.println("Graduação invalida!");
				//como é a útima linha, não é necessário o "break"
		}
	}

}
