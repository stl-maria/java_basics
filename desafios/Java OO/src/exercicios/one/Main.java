//class main
package exercicios.one;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student aluno = new Student();
        aluno.name = sc.next();
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();
        double notaFinal = aluno.pegaNotalFinal();
        double faltou = aluno.quantoFaltou();

        System.out.printf("Final grade = %.2f%n", notaFinal);
        if (notaFinal < 60){
            System.out.println("Failed");
            System.out.printf("Missing %.2f points%n",faltou);
        } else {
            System.out.println("Pass");
        }

        sc.close();
    }
}
