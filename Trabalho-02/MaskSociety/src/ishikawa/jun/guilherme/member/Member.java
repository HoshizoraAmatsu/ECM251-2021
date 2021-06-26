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
        System.out.println("Message from default member");
        System.out.println(message);
        System.out.println(
                """
                if I show up, something went wrong.
                
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

        System.out.println("""
                                                  Welcome to the
                 __  __    _    ____  _  _______ ____     ____   ___   ____ ___ _____ _______   __
                |  \\/  |  / \\  / ___|| |/ / ____|  _ \\   / ___| / _ \\ / ___|_ _| ____|_   _\\ \\ / /
                | |\\/| | / _ \\ \\___ \\| ' /|  _| | | | |  \\___ \\| | | | |    | ||  _|   | |  \\ V /\s
                | |  | |/ ___ \\ ___) | . \\| |___| |_| |   ___) | |_| | |___ | || |___  | |   | | \s
                |_|  |_/_/   \\_\\____/|_|\\_\\_____|____/___|____/ \\___/ \\____|___|_____| |_|   |_| \s
                
                              
                """);

        while (whileBool)
        {
            System.out.println("Work time: " + getSt());
            System.out.println("""
                    
                    1 - Post message
                    2 - Change time
                    0 - Log out
                    """);
            String iter = s.next();

            switch (iter)
            {
                case "1":
                    System.out.println("Message: ");
                    String message = s.next();
                    postarMensagem(message);
                    s.reset();
                    break;
                case "2":
                    changeST();
                    break;
                case "0":
                    whileBool = false;
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}
