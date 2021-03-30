//Guilherme Jun Ishikawa 18.00906-9

package ishikawa.jun.guilherme;

public class Contas
{
    private int idConta;
    private double saldo;
    private Usuarios usuarios;

    public Contas(int idConta, double saldo, String nome)
    {
        this.idConta = idConta;
        this.saldo = saldo;
        this.usuarios = new Usuarios(nome);
    }

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
}
