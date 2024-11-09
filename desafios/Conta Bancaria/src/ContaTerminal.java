import java.util.Scanner;

public class ContaTerminal {

	public static class ContaBancaria{
		
		//atributos
		public int numero;
		public int agencia;
		public String nomeCliente;
		public double saldo;
		
		/*
		//construtor
		public ContaBancaria(String nomeCliente, int agencia, int numero, double saldo) {
			super();
			this.nomeCliente = nomeCliente;
			this.agencia = agencia;
			this.numero = numero;
			this.saldo = saldo;
		}
		*/
		
		//metodo depositar
		public void deposita (double valor) {
			this.saldo += valor;
			System.out.println("Valor de "+valor+" reais foi depositado. Saldo: "+saldo+" reais.");
		}
		

		//metodo saque
		public void saca (double valor) { 
			if (this.saldo >= valor) {
				this.saldo -= valor;
				System.out.println("Valor de "+valor+" reais foi depositado");
			} else {
				System.out.println("Saldo insuficiente para este saque.");
			}
		}
		
		//metodo saldo atual
		public double getSaldo() {
			return saldo;
		}
		
	}
	
	
	
	public static void main (String[] args) {
		
		System.out.println("Bem-vindo(a)!\nSegue as instruções para a criação da conta bancária.");
		Scanner scanner = new Scanner(System.in);
		
		ContaBancaria conta = new ContaBancaria();
		
		System.out.println("1 - Digite seu nome: ");
		String nome = scanner.nextLine();
		conta.nomeCliente = nome;
		
		System.out.println("2 - Digite sua agencia: ");
		int agencia = scanner.nextInt();
		conta.agencia = agencia;
		
		System.out.println("3 - Digite o número da sua conta: ");
		int numero = scanner.nextInt();
		conta.numero = numero;
		
		System.out.println("4 - Digite seu saldo inicial: ");
		double saldo = scanner.nextDouble();
		conta.saldo = saldo;

		System.out.println("\nOlá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo de "+saldo+" reais já está disponível para saque");
		
		int opcao; //armazenando em uma variável
		do { //laço
			System.out.println("\nOperações disponiveis");
			System.out.println("1 - Deposito");
			System.out.println("2 - Saque");
			//System.out.println("3 - Transferencia"); -> em preparo...
			System.out.println("4 - Saldo atual");
			System.out.println("Escolha uma opção: ");
			opcao = scanner.nextInt(); //aguardando a opção do usuário final
			
			switch (opcao) {
			case 1:
				System.out.print("Digite o valor do deposito: ");
				double valorDeposito = scanner.nextDouble();
				conta.deposita(valorDeposito);
				break;
			case 2:
				System.out.print("Digite o valor do saque: ");
				double valorSaque = scanner.nextDouble();
				conta.saca(valorSaque);;
				break;
			case 3:
				return; //em preparo...
			case 4:
				System.out.println("O saldo atual é de: "+conta.getSaldo()+" reais.");
				break;
			default:
				System.out.println("Opção invalida. Por favor, escolha novamente.");
					
			}
		} while (opcao != 4);
		
		
	}
	
}
