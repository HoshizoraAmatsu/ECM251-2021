//Guilherme Jun Ishikawa 18.00906-9

package ishikawa.jun.guilherme;

public class Usuarios
{
    private String nome;
    private String senha;
    private String email;

    public Usuarios(String nome)
    {
        this.nome = nome;
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
