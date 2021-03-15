package ishikawa.jun.guilherme;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class Titulo
{
    double valor;
    String descricao;
    //Para guardar dados de data
    LocalDate dataDeVencimento;
    double jurosAoDia;

    public Titulo(double valor, String descricao, String dataDeVencimento, double jurosAoDia)
    {
        this.valor = valor;
        this.descricao = descricao;
        this.dataDeVencimento = dataDeVencimento;
        this.jurosAoDia = jurosAoDia;
    }

    public double totalParaPagar()
    {
        if (!estaAtrasada())
        {
            return this.valor;
        } else {
            return calcularJuros();
        }
    }

    private double calcularJuros()
    {
        return this.valor + this.valor * this.jurosAoDia * dataDeVencimento.until(LocalDate.now(), DAYS);
    }

    private boolean estaAtrasada()
    {
        return LocalDate.now().isAfter(dataDeVencimento);
    }
}
