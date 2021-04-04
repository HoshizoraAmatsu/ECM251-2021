//Guilherme Jun Ishikawa 18.00906-9

package ishikawa.jun.guilherme;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        //Inicia o Scanner
        Scanner scanner = new Scanner(System.in);

        //Cria lista das Contas
        ArrayList<Contas> listaID = new ArrayList<>();

        System.out.println("Informe o nome do Usuário 1: ");
        String nome1 = scanner.nextLine();
        System.out.println("Informe o nome do Usuário 2: ");
        String nome2 = scanner.nextLine();
        System.out.println("Informe o nome do Usuário 3: ");
        String nome3 = scanner.nextLine();

	    Contas user1 = new Contas(listaID, 1000, nome1);
	    listaID.add(user1);
        Contas user2 = new Contas(listaID, 250, nome2);
        listaID.add(user2);
        Contas user3 = new Contas(listaID, 3000, nome3);
        listaID.add(user3);

        //Inicia as operações
        Transacoes op = new Transacoes();

        //Mostra o estado inicial das contas antes das operações (nome + saldo)

        System.out.println("Estado Inicial:");
        System.out.println("Nome Usuário: " + user1.getNome() + " - Saldo: " + user1.getSaldo());
        System.out.println("Nome Usuário: " + user2.getNome() + " - Saldo: " + user2.getSaldo());
        System.out.println("Nome Usuário: " + user3.getNome() + " - Saldo: " + user3.getSaldo());

        String QR = op.gerarQR(250, user1); //Gera QR de pagamento para o usuario 1

        //Operações
        op.pagamento(QR, user2, listaID);
        op.pagamento(QR, user3, listaID);
        op.pagamento(QR, user2, listaID);

        String QR2 = op.gerarQR(1000, user2); //Gera QR de pagamento para o usuario 2

        //Operações
        op.pagamento(QR2, user3, listaID);

        //Mostra o estado final das contas antes das operações (nome + saldo)

        System.out.println("Estado Final:");
        System.out.println("Nome Usuário: " + user1.getNome() + " - Saldo: " + user1.getSaldo());
        System.out.println("Nome Usuário: " + user2.getNome() + " - Saldo: " + user2.getSaldo());
        System.out.println("Nome Usuário: " + user3.getNome() + " - Saldo: " + user3.getSaldo());
    }
}
