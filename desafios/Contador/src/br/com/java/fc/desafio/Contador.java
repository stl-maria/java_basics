package br.com.java.fc.desafio;
import java.util.Scanner;

public class Contador {
	public static void main (String[] args) throws ParametrosInvalidosException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um numero inteiro: ");
		int parametroUm = scanner.nextInt();
		
		System.out.println("Informe outro numero inteiro: ");
		int parametroDois = scanner.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		} catch (br.com.java.fc.desafio.ParametrosInvalidosException e) {
			System.out.println("O segundo parametro deve ser maior que o primeiro");
		}
		
		
	}
	
	//metodo
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		if (parametroUm > parametroDois)
			throw new ParametrosInvalidosException();
		
		int contagem = parametroDois - parametroUm;
		for (int i = 1; i <= contagem; i++) {
			System.out.println(i);
		}
	}
}
