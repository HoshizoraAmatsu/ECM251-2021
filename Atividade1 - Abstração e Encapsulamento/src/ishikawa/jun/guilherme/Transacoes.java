//Guilherme Jun Ishikawa 18.00906-9

package ishikawa.jun.guilherme;

import java.util.ArrayList;
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

    public void pagamento(String QR, Contas pagador, ArrayList<Contas> listaID)
    {
        //Confere o valor do pagamento e se existe saldo para o pagamento. Caso exista, realiza o pagamento
        String[] dados = QR.split(";");
        double valor = Double.parseDouble(dados[2]);
        int id = Integer.parseInt(dados[0]) - 1; //ArrayList começa do 0, por isso diminuimos 1 do id
        if(pagador.pagamento(valor)) //Verifica se o usuario possui saldo para realizar o pagamento
        {
            //Com o id fornecido pelo QRcode, conseguimos encontrar a conta que recebera o pagamento e realiza-lo
            Contas recebedor = listaID.get(id);
            recebedor.deposito(valor);
            listaID.set(id, recebedor);
        }
    }
}
