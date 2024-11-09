package exercicios.three;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt(); //determinando a quantidade de N pessoas para o vetor
        Pessoa[] vect = new Pessoa[n]; //criando vertor de objeto Pessoa com tamanho n

        for(int i=0; i< vect.length; i++){ //laço de repetição para percorrer
            System.out.println("Dados da %da pessoa:");
            System.out.print("Nome: ");
            String nome = sc.next(); //atributo
            System.out.print("Idade: ");
            int idade = sc.nextInt(); //atributo
            System.out.print("Altura: ");
            double altura = sc.nextDouble(); //atributo
            vect[i] = new Pessoa(nome, idade, altura); //instanciando o objeto
        }




        sc.close();
    }
}