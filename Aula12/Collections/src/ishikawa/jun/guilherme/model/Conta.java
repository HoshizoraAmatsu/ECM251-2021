package ishikawa.jun.guilherme.model;

/**
 * Classe que representa a instancia de uma Conta.
 */
public class Conta
{
    public double saldo;

    /**
     * Construtor da classe que inicializa o saldo
     * @param saldo Valor do saldo inicial
     */
    public Conta(double saldo)
    {
        this.saldo = saldo;
    }

    /**
     * Construtor padrao - sem saldo
     */
    public Conta() {}

    /**
     * Metodo que imprime o estado do objeto Conta
     * @return
     */
    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                '}';
    }
}
