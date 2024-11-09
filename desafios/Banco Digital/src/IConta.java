public interface IConta {
    //todos os métodos são public
    // Métodos
    void sacar(double valor);

    void depositar(double valor);

    void transferencia(double valor, Conta contaDestino);

}
