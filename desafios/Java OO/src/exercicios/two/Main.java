package exercicios.two;
import exercicios.two.entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n]; //vetor de classe Product de tamanho n = vect.lenght
        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price); //instanciando a classe Produto
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++){
            sum += vect[i].getPrice(); //pegando apenas o preço do elemento na posição i
        }

        double avg = sum / vect.length;
        System.out.printf("Average price: %.2f%n", avg);
        sc.close();
    }
}
