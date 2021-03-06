package janken_2.model.classic;

import janken_2.model.Jogada;
import janken_2.model.jeff.Lagarto;
import janken_2.model.jeff.Spoke;

public class Tesoura extends Jogada
{
    @Override
    public Jogada[] jogadasQueVenco()
    {
        return new Jogada[]{new Papel(), new Lagarto()};
    }

    @Override
    public Jogada[] jogadasQuePerco()
    {
        return new Jogada[]{new Pedra(), new Spoke()};
    }

    @Override
    public String toString()
    {
        return "Tesoura";
    }
}
