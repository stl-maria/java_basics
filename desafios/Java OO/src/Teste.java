import exercicios.one.Dollar;

import java.util.Locale;
import java.util.Scanner; //importando a biblioteca

public class Teste {
    public static void main (String[]args) {
        Locale.setDefault(Locale.US);
        Scanner nomeQualquer = new Scanner(System.in);

        System.out.println("What is the dollar price? ");
        double cotacaoDolar = nomeQualquer.nextDouble();
        System.out.println("How many dollars will be bought? ");
        double compraDolar = nomeQualquer.nextDouble();

        double pagar = Dollar.currencyConverter(cotacaoDolar, compraDolar);

        System.out.printf("Amount to be paid in reais = %.2f%n", pagar);
        nomeQualquer.close();
    }
}
