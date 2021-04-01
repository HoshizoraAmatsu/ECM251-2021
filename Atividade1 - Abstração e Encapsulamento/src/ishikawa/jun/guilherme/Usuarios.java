//Guilherme Jun Ishikawa 18.00906-9

package ishikawa.jun.guilherme;

public class Usuarios
{
    private String nome;
    private String senha;
    private String email;

    //Constructor

    public Usuarios(String nome)
    {
        this.nome = nome;
    }

    //getter

    public String getNome()
    {
        return nome;
    }

    @Override
    public String toString()
    {
        return "Usuarios{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
