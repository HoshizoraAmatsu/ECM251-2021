//Guilherme Jun Ishikawa 18.00906-9

package ishikawa.jun.guilherme;

import java.util.Random;

public class Transacoes
{
    private static int getRandomNumberInRange()
    {
        //Random number generator com Max = 9999 e Min = 1000
        int max = 9999;
        int min = 1000;
        Random r = new Random();
        return r.nextInt((max - min) + 1) + max ;
    }

    public String gerarQR(double valor, Contas contas)
    {
        //Gera um QR com o ID, nome do beneficiario, valor e um numero aleatorio
        return contas.getIdConta() + ";" + contas.getNome() + ";" + valor + ";" + getRandomNumberInRange();
    }

    public void pagamento(String QR, Contas pagador, Contas beneficiario)
    {
        //Confere o valor do pagamento e se existe saldo para o pagamento. Caso exista, realiza o pagamento
        String[] dados = QR.split(";");
        double valor = Double.parseDouble(dados[2]);
        if(pagador.pagamento(valor))
        {
            beneficiario.deposito(valor);
        }
    }
}
