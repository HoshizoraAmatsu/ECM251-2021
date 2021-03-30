//Guilherme Jun Ishikawa 18.00906-9

package ishikawa.jun.guilherme;

public class Main {

    public static void main(String[] args)
    {
	    Contas user1 = new Contas(1, 1000, "user1");
        Contas user2 = new Contas(2, 250, "user2");
        Contas user3 = new Contas(3, 3000, "user3");

        Transacoes op = new Transacoes();

        op.gerarQR(250, user1);
    }
}
