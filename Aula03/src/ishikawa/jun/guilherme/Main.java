package ishikawa.jun.guilherme;

public class Main
{
    public static void main(String[] args)
    {
        //Cria um objeto do tipo Conta
	    Conta c1;
	    //Instancia um objeto Conta
	    c1 = new Conta();

	    //Pede para a conta exibir o saldo
        c1.visualizarSaldo();

        //Modificar o saldo
        c1.saldo = 100;
        c1.visualizarSaldo();

        //Cria um novo objeto do tipo Conta
        Conta c2 = new Conta();
        c2.saldo = 123.0;

        c1.depositar(300);
        c2.depositar(100);

        c1.visualizarSaldo();
        c2.visualizarSaldo();

//        if(c1.sacar(1000))
//        {
//            System.out.println("Saque sucedido");
//        }
//        else
//        {
//            System.out.println("Saldo insuficiente");
//        }

        if (c1.transferirDinheiro(c2, 250))
        {
            System.out.println("Transferencia realizada com sucesso");
        }
        else
        {
            System.out.println("Nao foi possivel realizar a transferencia");
        }

        c1.visualizarSaldo();
        c2.visualizarSaldo();

        c1.cliente = new Cliente();
        c2.cliente = new Cliente();
        System.out.println("Nome do cliente: " + c1.cliente.nome);
        System.out.println("Nome do cliente: " + c2.cliente.nome);

        c1.cliente.nome = "Midoriya";
        c1.cliente.sobrenome = "Izuku";
        c1.numero = 9;

        System.out.println("C1: " + c1.toString());
    }
}
