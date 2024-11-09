public abstract class Conta implements IConta{
    //constante
    private static int SEQUENCIAL = 1;
    private static final int AGENCIA_PADRAO = 0001;

    // Atributos
    private int agencia;
    private int numero;
    private double saldo;

    //Construtor
    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++; //vai somando +1
    }

    //Métodos abstratos
    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transferencia(double valor, Conta contaDestino) {

    }

    public int getAgencia(){return agencia;}
    public int getNumero(){return numero;}
    public double getSaldo(){return saldo;}

}
