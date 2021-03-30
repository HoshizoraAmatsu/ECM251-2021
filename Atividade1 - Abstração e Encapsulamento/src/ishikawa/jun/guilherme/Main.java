//Guilherme Jun Ishikawa 18.00906-9

package ishikawa.jun.guilherme;

public class Main {

    public static void main(String[] args)
    {
	    Contas user1 = new Contas(1, 1000, "user1");
        Contas user2 = new Contas(2, 250, "user2");
        Contas user3 = new Contas(3, 3000, "user3");

        Transacoes op = new Transacoes();

        System.out.println("Estado Inicial:");
        System.out.println("Nome Usuário: " + user1.getNome() + " - Saldo: " + user1.getSaldo());
        System.out.println("Nome Usuário: " + user2.getNome() + " - Saldo: " + user2.getSaldo());
        System.out.println("Nome Usuário: " + user3.getNome() + " - Saldo: " + user3.getSaldo());

        String QR = op.gerarQR(250, user1);
        System.out.println(QR);

        op.pagamento(QR, user2);
        op.pagamento(QR, user3);
        op.pagamento(QR, user2);

        String QR2 = op.gerarQR(1000, user2);
        System.out.println(QR2);

        op.pagamento(QR2, user2);

        System.out.println("Estado Final:");
        System.out.println("Nome Usuário: " + user1.getNome() + " - Saldo: " + user1.getSaldo());
        System.out.println("Nome Usuário: " + user2.getNome() + " - Saldo: " + user2.getSaldo());
        System.out.println("Nome Usuário: " + user3.getNome() + " - Saldo: " + user3.getSaldo());
    }
}
