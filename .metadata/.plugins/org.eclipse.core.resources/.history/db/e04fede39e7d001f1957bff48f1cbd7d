package edu.java.basico;

public enum EstadoBrasileiro {
	SAO_PAULO ("SP", "São Paulo"),
	RIO_JANEIRO ("RJ", "Rio de Janeiro"),
	PIAUI ("PI", "Piauí"),
	MARANHAO ("MA", "Maranhão"),
	CEARA("CE","Ceara");
	
	//ATRIBUTOS
	private String nome;
	private String sigla;
	
	
	//MÉTODOS
	private EstadoBrasileiro(String sigla, String nome) {
		this.nome = nome;
		this.sigla = sigla;
	}

	


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}

	
	
	
	//MÉTODO MAIN
	public static void main (String []args) {
		//imprimindo o conjunto de objetos
		for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
				System.out.println(e.getSigla()+ " - "+e.getNome());
		}
		//selecionando um objeto especifico
		EstadoBrasileiro eb = EstadoBrasileiro.PIAUI;
		
		System.out.println(eb.getNome());
		System.out.println(eb.getSigla());
		System.out.println(eb.getNomeMaiusculo());
		
		
	}
	
}
