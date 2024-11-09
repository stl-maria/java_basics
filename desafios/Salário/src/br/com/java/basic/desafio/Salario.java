package br.com.java.basic.desafio;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner leitorDeEntradas = new Scanner(System.in);
		
		System.out.println("Informe o valor do salário: ");
		float valorSalario = leitorDeEntradas.nextFloat(); //melhorar
		
		System.out.println("Informe o valor dos benefícios: ");
		float valorBeneficios = leitorDeEntradas.nextFloat();
		
		float valorImposto = 0;
		
		if(valorSalario >= 0 && valorSalario <= 1100) {
			valorImposto = 0.05F * valorSalario;
		} else if (valorSalario >= 1100.01 && valorSalario<=2500) {
			valorImposto = 0.10F * valorSalario;
		} else if (valorSalario > 2500) {
			valorImposto = 0.15F * valorSalario;
		} else {
			System.out.println("Valor de salario invalido."); //melhorar
		}
		
		
		float saida = valorSalario - valorImposto + valorBeneficios;
		System.out.println("O valor a ser transferido é de R$ "+String.format("%.2f", saida));
		
	}

}
