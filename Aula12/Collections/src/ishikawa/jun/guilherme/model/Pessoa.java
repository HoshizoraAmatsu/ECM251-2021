package ishikawa.jun.guilherme.model;

/**
 * Classe que representa uma pessoa
 */
public class Pessoa
{
    final private String nome;
    final private String cpf;

    /**
     * Constructor da classe Pessoa
     * @param nome Nome atribuido a pessoa
     * @param cpf CPF atribuido a pessoa
     */
    public Pessoa(String nome, String cpf)
    {
        this.nome = nome;
        this.cpf = cpf;
    }

    /**
     * Devolve o estado de objeto Pessoa
     * @return
     */
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
