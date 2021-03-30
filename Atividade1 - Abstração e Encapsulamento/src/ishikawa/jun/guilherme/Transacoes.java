//Guilherme Jun Ishikawa 18.00906-9

package ishikawa.jun.guilherme;

import java.util.Random;

public class Transacoes
{
    private static int getRandomNumberInRange(int min ,int max)
    {
        Random r = new Random();
        return r . nextInt((max - min) + 1) + min ;
    }

    public String gerarQR(int valor, Contas contas)
    {
        int cod = getRandomNumberInRange(1000, 9999);
        String s = contas.getIdConta() + ";" + contas.getNome() + ";" + valor + ";" + cod;
        System.out.println(s);
        return s;
    }

    public boolean pagamento(String QR, )
    {

    }
}
