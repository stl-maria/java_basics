import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class RegistroTransacoes {
    //Entradas:
    //Solicitar ao USUARIO o saldo inicial da conta
    //Pergunta a quantidade total de transações que o cliente deseja
        //Para cada transação, solicitar:
        // - O tipo de transição (D = deposito, S = saque)
        // - O valor da transação

    //Saidd:



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Lê a Entrada que informa o saldo inicial da conta
            double saldo = scanner.nextDouble();

            // Lê a Entrada com a quantidade total de transações
            int quantidadeTransacoes = scanner.nextInt();

            // Lista para armazenar as transações
            List<String> transacoes = new ArrayList<>();

            // Loop para iterar sobre as transações
            for (int i = 1; i <= quantidadeTransacoes; i++) {
                // Lê a Entrada com o tipo de transação (D para depósito ou S para saque)
                // O método "toUpperCase" padroniza o tipo de transação com a letra maiúscula
                char tipoTransacao = scanner.next().toUpperCase().charAt(0);
                // Lê a Entrada com o valor da transação
                double valorTransacao = scanner.nextDouble();

                // Atualiza o saldo da conta e adicionar a transação à lista
                if (tipoTransacao == 'D') {
                    saldo += valorTransacao;
                    transacoes.add("Deposito de " + valorTransacao);
                } else if (tipoTransacao == 'S') {
                    saldo -= valorTransacao;
                    transacoes.add("Saque de " + valorTransacao);
                } else {
                    System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                    i--; // Decrementa o índice para repetir a iteração
                }
            }

            // TODO: Exibir o saldo final e a lista de transações conforme a tabela de Exemplos.
            System.out.println("Saldo: "+saldo);
            //String str = transacoes.toString();
            //str = str.replaceAll("[\\[\\]]", "");
            //System.out.print("Transacoes:\n"+str);
            System.out.println("Transacoes:");
            for (int i = 0; i < transacoes.size(); i++){
                System.out.println((i+1)+". "+transacoes.get(i));
            }


            // Fechar o scanner para evitar vazamentos de recursos
            scanner.close();
        }




}
