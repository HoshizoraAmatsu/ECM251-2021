//Guilherme Jun Ishikawa 18.00906-9

package ishikawa.jun.guilherme;

import java.util.Random;

public class Transacoes
{
    private static int getRandomNumberInRange()
    {
        Random r = new Random();
        return r.nextInt((9999 - 1000) + 1) + 1000 ;
    }

    public String gerarQR(double valor, Contas contas)
    {
        int cod = getRandomNumberInRange();
        return contas.getIdConta() + ";" + contas.getNome() + ";" + valor + ";" + cod;
    }

    public void pagamento(String QR, Contas pagador, Contas beneficiario)
    {
        String[] dados = QR.split(";");
        double valor = Double.parseDouble(dados[2]);
        if(pagador.pagamento(valor))
        {
            beneficiario.deposito(valor);
        }
    }
}
