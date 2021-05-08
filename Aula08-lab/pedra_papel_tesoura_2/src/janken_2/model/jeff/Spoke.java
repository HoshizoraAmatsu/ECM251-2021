package janken_2.model.jeff;

import janken_2.model.Jogada;
import janken_2.model.classic.Papel;
import janken_2.model.classic.Pedra;
import janken_2.model.classic.Tesoura;

public class Spoke extends Jogada
{
    @Override
    public Jogada[] jogadasQueVenco()
    {
        return new Jogada[]{new Pedra(), new Tesoura()};
    }

    @Override
    public Jogada[] jogadasQuePerco()
    {
        return new Jogada[]{new Papel(), new Lagarto()};
    }

    @Override
    public String toString()
    {
        return "Spoke";
    }
}
