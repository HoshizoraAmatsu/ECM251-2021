package ishikawa.jun.guilherme.member;

import ishikawa.jun.guilherme.member.enumeracoes.SystemTime;

public class Member implements PostarMensagem
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

    public void printST()
    {
        System.out.println(this.st);
    }

    @Override
    public void postarMensagem()
    {
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
            case "BIG_BROTHERS":
                if (st == SystemTime.NORMAL)
                    System.out.println("*");
                else
                    System.out.println("QU3Ro_S3us_r3curs0s.py");
                break;
            case "SCRIPT_GUYS":
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
}
