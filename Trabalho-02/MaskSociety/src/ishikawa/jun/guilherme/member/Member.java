package ishikawa.jun.guilherme.member;

import ishikawa.jun.guilherme.member.types.SystemTime;

public class Member implements PostarMensagem
{
    protected String username;
    protected String email;
    protected String function;
    protected SystemTime st = SystemTime.NORMAL;

    public Member(String username, String email, String function) {
        this.username = username;
        this.email = email;
        this.function = function;
    }

    public void changeST()
    {
        if (st == SystemTime.NORMAL)
            st = SystemTime.EXTRA;
        else
            st = SystemTime.NORMAL;
    }

    @Override
    public void postarMensagem()
    {
        switch (function)
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
                        Something went wrong, so have this instead!
                        
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
