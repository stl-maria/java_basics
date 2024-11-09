package edu.java.oo;

import edu.java.oo.animais.Cachorro;

public class Canil {

	public static void main(String[] args) {
		Cachorro cachorro1 = //variavel de referência: cachorro1, objeto: Cachorro
				new Cachorro(); //criando o objeto de classe Cachorro
		
		Cachorro cachorro2 = new Cachorro("Fifi", "Preto", 1.0, 2, 1, "nada");
		
		System.out.println("Quantidade de Cachorros inicial: "+Cachorro.getNumeroDeCachorros());
		
		Cachorro cachorro3 = new Cachorro("Gato", "Preto", 1.0, 2, 1, "nada");
		
		/*
		cachorro1.nome = "Ted"; //adicionando os valores no objeto
		cachorro1.altura = 1.2;
		cachorro1.cor = "Caramelo";
		cachorro1.peso = 20.0;
		cachorro1.tamanhoDoRabo = 5;
		**/
		
		cachorro1.setNome("Ted");
		cachorro1.setCor("Caramelo");
		cachorro1.setAltura(1.5);
		cachorro1.setPeso(5.6);
		cachorro1.setTamanhoDoRabo(3);
		
		
		//System.out.println(cachorro1); -> endereço da memória do objeto
		
		//cachorro1.soar(); //executando um método do objeto
		//System.out.println("O "+cachorro1.nome+" pegou a "+cachorro1.pegar());//irá imprimir o retorno do método que o objeto executa
		
		//System.out.println("O "+cachorro1.nome+" está "+cachorro1.interagir("vai dormir")+"!");
		//System.out.println(cachorro2.getNome()+" é da cor: "+cachorro2.getCor()); //segundo objeto utilizando construtor
		
		//System.out.println(cachorro1.toString()); //utilizando o toString declarado na classe Cachorro para uma melhor visualização dos dados do objeto
		//System.out.println(cachorro2.toString());
		
		//System.out.println(cachorro1.getNumeroDeCachorros());
		System.out.println("Quantidade de Cachorros após a criação do cachorro3 (pois o cachorro1 não foi criado pelo construtor): "+Cachorro.getNumeroDeCachorros());
		
	}

}
