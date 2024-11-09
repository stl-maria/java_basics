package exercicios.two.entities;

public class Banco {
    // Atributo
    private int numeroConta;
    private String nome;
    private double saldo;

    // Método
    //Construtor com 3 argumentos
    public Banco (int numeroConta, String nome, double depositoInicial){
        this.numeroConta = numeroConta;
        this.nome = nome;
        deposito(depositoInicial); //chamando a operação de deposito e passando o argumento
    }
    //Construtor com 2 argumentos
    public Banco (int numeroConta, String nome){
        this.numeroConta = numeroConta;
        this.nome = nome;
    }

    //getters e setters
    public int getNumeroConta() {return numeroConta;}
    public String getNome() {return nome;}
    public double getSaldo() {return saldo;}
    public void setNome(String nome) {this.nome = nome;}

    public void deposito(double valor){
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor invalido.");
        }
    }

    public void saque(double valor){
        saldo -= valor + 5.00;
    }

    @Override
    public String toString() {
        return "Conta "+numeroConta+", Nome: "+nome+", Saldo: $ "+String.format("%.2f", saldo);
    }
}
