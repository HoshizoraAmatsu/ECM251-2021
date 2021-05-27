package br.maua.estudo_javadoc.model;

public abstract class Pessoa
{
    private String nome;
    private String cpf;

    /**
     * Método construtor da classe pessoa que inicializa os seus parâmetros.
     * @param nome Nome atribuído a instância de pessoa.
     * @param cpf CPF atribuído a instância de pessoa, sempre deve existir.
     */
    public Pessoa(String nome, String cpf)
    {
        this.nome = nome;
        this.cpf = cpf;
    }

    /**
     * Método construtor alternativo para classe <strong>Pessoa</strong>. Inicializa o atributo nome com uma String "".
     * @param cpf CPF atribuído a instância de pessoa.
     */
    public Pessoa(String cpf)
    {
        this.nome = "";
        this.cpf = cpf;
    }

    /**
     * Getter do valor do nome da instância de Pessoa.
     * @return O valor do atributo nome.
     */
    public String getNome()
    {
        return nome;
    }

    /**
     * Getter do valor do CPF da instância de Pessoa.
     * @return O valor do atributo CPF.
     */
    public String getCpf()
    {
        return cpf;
    }
}
