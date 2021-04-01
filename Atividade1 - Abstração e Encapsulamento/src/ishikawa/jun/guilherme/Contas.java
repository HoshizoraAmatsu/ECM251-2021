//Guilherme Jun Ishikawa 18.00906-9

package ishikawa.jun.guilherme;

public class Contas
{
    private int idConta;
    private double saldo;
    private Usuarios usuarios;

    //Constructor

    public Contas(int idConta, double saldo, String nome)
    {
        this.idConta = idConta;
        this.saldo = saldo;
        this.usuarios = new Usuarios(nome);
    }

    //Getters

    public int getIdConta()
    {
        return idConta;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public String getNome()
    {
        return usuarios.getNome();
    }

    //Operações de saldo

    public void deposito(double valor)
    {
        this.saldo += valor;
    }

    public boolean pagamento(double valor)
    {
        //Verifica se existe saldo suficiente para realizar um pagamento
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString()
    {
        return "Contas{" +
                "idConta=" + idConta +
                ", saldo=" + saldo +
                ", usuarios=" + usuarios +
                '}';
    }
}
