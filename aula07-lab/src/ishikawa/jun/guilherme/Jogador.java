package ishikawa.jun.guilherme;

public class Jogador
{
    private String nome;
    private boolean isHuman;
    private Jogada jogada;

    public Jogador(String nome, boolean isHuman)
    {
        this.nome = nome;
        this.isHuman = isHuman;
    }

    public Jogador(String nome)
    {
        this.nome = nome;
        this.isHuman = false;
    }

    public String getNome()
    {
        return nome;
    }

    public boolean isHuman()
    {
        return isHuman;
    }

    public Jogada getJogada()
    {
        return jogada;
    }

    public void setJogada(Jogada jogada)
    {
        this.jogada = jogada;
    }
}
