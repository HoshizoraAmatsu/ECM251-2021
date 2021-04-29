package ishikawa.jun.guilherme.model;

import ishikawa.jun.guilherme.enumeracao.Resultado;

public abstract class Jogada
{
    public Resultado verificarResultado(Jogada jogada)
    {
        if (verificarSeGanhei(jogada))
        {
            return Resultado.GANHOU;
        }

        if (verificarSePerdi(jogada))
        {
            return Resultado.PERDEU;
        }

        return Resultado.EMPATOU;
    }

    public boolean verificarSeGanhei(Jogada jogada)
    {
        return true;
    }

    public boolean verificarSePerdi(Jogada jogada)
    {
        return true;
    }
}
