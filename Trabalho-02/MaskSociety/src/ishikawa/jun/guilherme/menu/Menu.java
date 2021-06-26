package ishikawa.jun.guilherme.menu;

import ishikawa.jun.guilherme.member.Member;
import ishikawa.jun.guilherme.member.function.BigBrothers;

import java.util.LinkedList;
import java.util.Scanner;

public class Menu
{
    public static void menu()
    {
        LinkedList<Member> m = new LinkedList<>();
        Scanner s = new Scanner(System.in);

        boolean bool = true;
        while (bool)
        {
            Member logged = login(m);

            switch (logged.getFunction())
            {
                case "MOBILE_MEMBERS":
                case "HEAVY_LIFTERS":
                case "SCRIPT_GUYS":
                case "BIG_BROTHERS":
                    logged.showMenu(m);
                    break;
                case "error":
                    System.out.println("User don`t exist");
                    break;
                default:
                    System.out.println("""
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
                    break;
            }

            boolean otherBool = true;
            while (otherBool)
            {
                System.out.println("\nExit? (Y/N)");
                switch (s.next().toLowerCase())
                {
                    case "y":
                        otherBool = false;
                        bool = false;
                        break;
                    case "n":
                        otherBool = false;
                        break;
                    default:
                        System.out.println("\nInvalid input.\n");
                        break;
                }
            }
        }
    }

    private static Member login(LinkedList<Member> m)
    {
        if (m.isEmpty())
        {
            //This considers that the first one to access this menu is going to be a BigBrother
            System.out.println("There is no user registered peko! Creating one now peko...\n");
            m.add(new BigBrothers("Hoshizora", "name@email.com", "pwd"));
            System.out.println("Created user:");
            m.getFirst().apresentar();
            return m.getFirst();
        }

        Scanner s = new Scanner(System.in);
        System.out.println("\nUsername: ");
        String user = s.next();
        System.out.println("\nPassword: ");
        String pwd = s.next();

        for (Member member : m)
        {
            if (member.getUsername().equals(user) && member.getPwd().equals(pwd))
            {
                return member;
            }
        }
        return new Member("error", "error", "error", "error");
    }
}
