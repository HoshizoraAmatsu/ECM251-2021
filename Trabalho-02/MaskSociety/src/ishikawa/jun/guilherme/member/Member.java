package ishikawa.jun.guilherme.member;

import ishikawa.jun.guilherme.member.enumeracoes.SystemTime;

import java.util.LinkedList;
import java.util.Scanner;

public class Member implements PostarMensagem, Apresentacao, showMenu
{
    protected String username;
    protected String email;
    protected String pwd;
    protected String function;
    protected SystemTime st = SystemTime.NORMAL;

    public Member(String username, String email, String pwd, String function)
    {
        this.username = username;
        this.email = email;
        this.pwd = pwd;
        this.function = function;
    }

    public String getUsername()
    {
        return username;
    }

    public String getFunction()
    {
        return function;
    }

    public String getPwd()
    {
        return pwd;
    }

    public String getEmail()
    {
        return email;
    }

    public SystemTime getSt()
    {
        return st;
    }

    public void changeST()
    {
        if (this.st == SystemTime.NORMAL)
            this.st = SystemTime.EXTRA;
        else
            this.st = SystemTime.NORMAL;
    }

    @Override
    public void postarMensagem(String message)
    {
        System.out.println("Message from " + this.function);
        System.out.println(message);
        switch (this.function)
        {
            case "MOBILE_MEMBERS":
                if (st == SystemTime.NORMAL)
                    System.out.println("Happy Coding!");
                else
                    System.out.println("MAsK_S0C13ty");
                break;
            case "HEAVY_LIFTERS":
                if (st == SystemTime.NORMAL)
                    System.out.println("Podem contar conosco!");
                else
                    System.out.println("N00b_qu3_n_Se_r3pita.bat");
                break;
            case "SCRIPT_GUYS":
                if (st == SystemTime.NORMAL)
                    System.out.println("*");
                else
                    System.out.println("QU3Ro_S3us_r3curs0s.py");
                break;
            case "BIG_BROTHERS":
                if (st == SystemTime.NORMAL)
                    System.out.println("Sempre ajudando as pessoas membros ou não S2!");
                else
                    System.out.println("...");
                break;
            default:
                System.out.println(
                        """
                        お帰りなさいご主人様
                        
                        ⣿⡇⣿⣿⣿⠛⠁⣴⣿⡿⠿⠧⠹⠿⠘⣿⣿⣿⡇⢸⡻⣿⣿⣿⣿⣿⣿⣿
                        ⢹⡇⣿⣿⣿⠄⣞⣯⣷⣾⣿⣿⣧⡹⡆⡀⠉⢹⡌⠐⢿⣿⣿⣿⡞⣿⣿⣿
                        ⣾⡇⣿⣿⡇⣾⣿⣿⣿⣿⣿⣿⣿⣿⣄⢻⣦⡀⠁⢸⡌⠻⣿⣿⣿⡽⣿⣿
                        ⡇⣿⠹⣿⡇⡟⠛⣉⠁⠉⠉⠻⡿⣿⣿⣿⣿⣿⣦⣄⡉⠂⠈⠙⢿⣿⣝⣿
                        ⠤⢿⡄⠹⣧⣷⣸⡇⠄⠄⠲⢰⣌⣾⣿⣿⣿⣿⣿⣿⣶⣤⣤⡀⠄⠈⠻⢮
                        ⠄⢸⣧⠄⢘⢻⣿⡇⢀⣀⠄⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⡀⠄⢀
                        ⠄⠈⣿⡆⢸⣿⣿⣿⣬⣭⣴⣿⣿⣿⣿⣿⣿⣿⣯⠝⠛⠛⠙⢿⡿⠃⠄⢸
                        ⠄⠄⢿⣿⡀⣿⣿⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣿⣿⣿⣿⡾⠁⢠⡇⢀
                        ⠄⠄⢸⣿⡇⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⣫⣻⡟⢀⠄⣿⣷⣾
                        ⠄⠄⢸⣿⡇⠄⠈⠙⠿⣿⣿⣿⣮⣿⣿⣿⣿⣿⣿⣿⣿⡿⢠⠊⢀⡇⣿⣿
                        ⠒⠤⠄⣿⡇⢀⡲⠄⠄⠈⠙⠻⢿⣿⣿⠿⠿⠟⠛⠋⠁⣰⠇⠄⢸⣿⣿⣿
                        ⠄⠄⠄⣿⡇⢬⡻⡇⡄⠄⠄⠄⡰⢖⠔⠉⠄⠄⠄⠄⣼⠏⠄⠄⢸⣿⣿⣿
                        ⠄⠄⠄⣿⡇⠄⠙⢌⢷⣆⡀⡾⡣⠃⠄⠄⠄⠄⠄⣼⡟⠄⠄⠄⠄⢿⣿⣿
                        """);
                break;
        }
    }

    @Override
    public void apresentar()
    {
        System.out.println("\nUsername:  " + getUsername());
        System.out.println("Function:  " + getFunction());
        System.out.println("Work time: " + getSt());
        System.out.println("e-mail:    " + getEmail());
    }

    @Override
    public void showMenu(LinkedList<Member> members)
    {
        Scanner s = new Scanner(System.in);
        boolean whileBool = true;

        while (whileBool)
        {
            System.out.println("\nWelcome to the Masked society");
            System.out.println("Work time: " + getSt());
            System.out.println("""
                    
                    1 - Present
                    2 - Post message
                    3 - Change time
                    4 - Check time
                    0 - Log out
                    """);
            String iter = s.next();

            switch (iter)
            {
                case "1":
                    apresentar();
                    break;
                case "2":
                    System.out.println("Write your message: ");
                    String message = s.next();
                    postarMensagem(message);
                    s.reset();
                    break;
                case "3":
                    changeST();
                    break;
                case "4":
                    System.out.println(getSt());
                    break;
                case "0":
                    whileBool = false;
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
