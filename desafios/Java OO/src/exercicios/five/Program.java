package exercicios.five;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String[]arga){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        //n = mat.lenght
        int [][] mat //arranjo bidiresional com nome 'mat'
            = new int [n] [n]; //instanciando a matriz na memória

        //1 - Entrada de dados na matriz
        //laçoo para percorrer as linhas da matriz
        for (int i=0; i<mat.length; i++){
            //laço para percorrer as colunas da matriz
            for (int j=0; j<mat[i].length; j++){
                mat [i] [j] //matriz 'mat' da linha 'i' da coluna 'j'
                        = sc.nextInt();
            }
        }

        //2 - Imprimindo a diagonal da matriz
        System.out.print("Main diagonal:");
        for(int i=0; i<n; i++){
            System.out.print(mat[i][i]+ " "); //imprimir o elemento da linha e coluna que for igual a 'i'
        }
        System.out.println(); //para pular linha

        //3 - Calculando a quantidade de numeros negativos
        int quantidade = 0;
        for (int i=0; i<n; i++){ //percorrendo as linhas
            for (int j=0; j<n; j++){ //percorrendo as colunas
                if (mat[i][j] < 0){
                    quantidade++;
                }
            }
        }
        System.out.println("Negative numbers: "+quantidade);

        sc.close();
    }
}
