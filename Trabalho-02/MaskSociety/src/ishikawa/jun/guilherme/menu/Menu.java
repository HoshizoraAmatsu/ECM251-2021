package ishikawa.jun.guilherme.menu;

import ishikawa.jun.guilherme.member.Member;
import ishikawa.jun.guilherme.member.enumeracoes.MemberFunction;
import ishikawa.jun.guilherme.member.function.BigBrothers;
import ishikawa.jun.guilherme.member.function.HeavyLifters;
import ishikawa.jun.guilherme.member.function.MobileMembers;
import ishikawa.jun.guilherme.member.function.ScriptGuys;

import java.util.LinkedList;
import java.util.Scanner;

public class Menu
{
    public static void menu()
    {
        LinkedList<Member> m = new LinkedList<>();
        Scanner s = new Scanner(System.in);

        System.out.println("""
                 __  __    _    ____  _  _______ ____     ____   ___   ____ ___ _____ _______   __
                |  \\/  |  / \\  / ___|| |/ / ____|  _ \\   / ___| / _ \\ / ___|_ _| ____|_   _\\ \\ / /
                | |\\/| | / _ \\ \\___ \\| ' /|  _| | | | |  \\___ \\| | | | |    | ||  _|   | |  \\ V /\s
                | |  | |/ ___ \\ ___) | . \\| |___| |_| |   ___) | |_| | |___ | || |___  | |   | | \s
                |_|  |_/_/   \\_\\____/|_|\\_\\_____|____/___|____/ \\___/ \\____|___|_____| |_|   |_| \s
                                                                                                   \s
                               
                               
                """);

        boolean bool = true;
        while (bool)
        {
            Member logged = login(m);

            switch (logged.getFunction())
            {
                case "MOBILE_MEMBERS":
                case "HEAVY_LIFTERS":
                case "SCRIPT_GUYS":
                    showMenu(logged);
                    break;
                case "BIG_BROTHERS":
                    showAdminMenu(logged, m);
                    break;
                case "error":
                    System.out.println("""
                            ⣿⢸⣿⣿⣿⣿⣿⢹⣿⣿⣿⣿⣿⢿⣿⡇⡇⣿⣿⡇⢹⣿⣿⣿⣿⣿⣿⠄⢸⣿
                            ⡟⢸⣿⣿⣭⣭⡭⣼⣶⣿⣿⣿⣿⢸⣧⣇⠇⢸⣿⣿⠈⣿⣿⣿⣿⣿⣿⡆⠘⣿
                            ⡇⢸⣿⣿⣿⣿⡇⣻⡿⣿⣿⡟⣿⢸⣿⣿⠇⡆⣝⠿⡌⣸⣿⣿⣿⣿⣿⡇⠄⣿
                            ⢣⢾⣾⣷⣾⣽⣻⣿⣇⣿⣿⣧⣿⢸⣿⣿⡆⢸⣹⣿⣆⢥⢛⡿⣿⣿⣿⡇⠄⣿
                            ⣛⡓⣉⠉⠙⠻⢿⣿⣿⣟⣻⠿⣹⡏⣿⣿⣧⢸⣧⣿⣿⣨⡟⣿⣿⣿⣿⡇⠄⣿
                            ⠸⣷⣹⣿⠄⠄⠄⠄⠘⢿⣿⣿⣯⣳⣿⣭⣽⢼⣿⣜⣿⣇⣷⡹⣿⣿⣿⠁⢰⣿
                            ⠄⢻⣷⣿⡄⢈⠿⠇⢸⣿⣿⣿⣿⣿⣿⣟⠛⠲⢯⣿⣒⡾⣼⣷⡹⣿⣿⠄⣼⣿
                            ⡄⢸⣿⣿⣷⣬⣽⣯⣾⣿⣿⣿⣿⣿⣿⣿⣿⡀⠄⢀⠉⠙⠛⠛⠳⠽⠿⢠⣿⣿
                            ⡇⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⢄⣹⡿⠃⠄⠄⣰⠎⡈⣾⣿⣿
                            ⡇⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣭⣽⣖⣄⣴⣯⣾⢷⣿⣿⣿
                            ⣧⠸⣿⣿⣿⣿⣿⣿⠯⠊⠙⢻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣏⣾⣿⣿⣿
                            ⣿⣦⠹⣿⣿⣿⣿⣿⠄⢀⣴⢾⣼⣻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⣾⣿⣿⣿⣿
                            ⣿⣿⣇⢽⣿⣿⣿⡏⣿⣿⣿⣿⣿⡇⣿⣿⣿⣿⡿⣿⣛⣻⠿⣟⣼⣿⣿⣿⣿⢃
                            ⣿⣿⣿⡎⣷⣽⠻⣇⣿⣿⣿⡿⣟⣵⣿⣟⣽⣾⣿⣿⣿⣿⢯⣾⣿⣿⣿⠟⠱⡟
                            ⣿⣿⣿⣿⢹⣿⣿⢮⣚⡛⠒⠛⢛⣋⣶⣿⣿⣿⣿⣿⣟⣱⠿⣿⣿⠟⣡⣺⢿
                            """);
                    break;
                default:
                    System.out.println("""
                            Something went wrong!
                            
                            ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣬⡛⣿⣿⣿⣯⢻
                            ⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⢻⣿⣿⢟⣻⣿⣿⣿⣿⣿⣿⣮⡻⣿⣿⣧
                            ⣿⣿⣿⣿⣿⢻⣿⣿⣿⣿⣿⣿⣆⠻⡫⣢⠿⣿⣿⣿⣿⣿⣿⣿⣷⣜⢻⣿
                            ⣿⣿⡏⣿⣿⣨⣝⠿⣿⣿⣿⣿⣿⢕⠸⣛⣩⣥⣄⣩⢝⣛⡿⠿⣿⣿⣆⢝
                            ⣿⣿⢡⣸⣿⣏⣿⣿⣶⣯⣙⠫⢺⣿⣷⡈⣿⣿⣿⣿⡿⠿⢿⣟⣒⣋⣙⠊
                            ⣿⡏⡿⣛⣍⢿⣮⣿⣿⣿⣿⣿⣿⣿⣶⣶⣶⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿
                            ⣿⢱⣾⣿⣿⣿⣝⡮⡻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠛⣋⣻⣿⣿⣿⣿
                            ⢿⢸⣿⣿⣿⣿⣿⣿⣷⣽⣿⣿⣿⣿⣿⣿⣿⡕⣡⣴⣶⣿⣿⣿⡟⣿⣿⣿
                            ⣦⡸⣿⣿⣿⣿⣿⣿⡛⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⣿⣿⣿
                            ⢛⠷⡹⣿⠋⣉⣠⣤⣶⣶⣿⣿⣿⣿⣿⣿⡿⠿⢿⣿⣿⣿⣿⣿⣷⢹⣿⣿
                            ⣷⡝⣿⡞⣿⣿⣿⣿⣿⣿⣿⣿⡟⠋⠁⣠⣤⣤⣦⣽⣿⣿⣿⡿⠋⠘⣿⣿
                            ⣿⣿⡹⣿⡼⣿⣿⣿⣿⣿⣿⣿⣧⡰⣿⣿⣿⣿⣿⣹⡿⠟⠉⡀⠄⠄⢿⣿
                            ⣿⣿⣿⣽⣿⣼⣛⠿⠿⣿⣿⣿⣿⣿⣯⣿⠿⢟⣻⡽⢚⣤⡞⠄⠄⠄⢸⣿
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

    private static Member login(LinkedList<Member> m) //Eu podia fazer logins unicos, mas a preguiça é maior
    {
        if (m.isEmpty())
        {
            System.out.println("There is no user registered peko! Please, create one peko!");
            createMember(m);
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

        System.out.println("\nUser not found.\n\n");
        return new Member("error", "error", "error", "error");
    }

    private static void createMember(LinkedList<Member> m)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nType in the username: ");
        String user = scanner.next();

        System.out.println("\nType in the password: ");
        String pwd = scanner.next();

        System.out.println("\nType in the e-mail: ");
        String email = scanner.next();

        boolean bool = true;

        while (bool)
        {
            System.out.println("""
                
                Choose the member function:
                1 - Mobile Members
                2 - Heavy Lifters
                3 - Big Brothers
                4 - Script Guys
                """);
            String iter = scanner.next();

            switch (iter)
            {
                case "1":
                    m.add(new MobileMembers(user, email, pwd));
                    bool = false;
                    break;
                case "2":
                    m.add(new HeavyLifters(user, email, pwd));
                    bool = false;
                    break;
                case "3":
                    m.add(new BigBrothers(user, email, pwd));
                    bool = false;
                    break;
                case "4":
                    m.add(new ScriptGuys(user, email, pwd));
                    bool = false;
                    break;
                default:
                    System.out.println("\nInvalid input, please try again.");
                    break;
            }
        }
    }

    private static void deleteMember(LinkedList<Member> m)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("""
                
                Delete member from which function?
                1 - Mobile Members
                2 - Heavy Lifters
                3 - Script Guys
                4 - Big Brothers
                """);
        String func = s.next();
        switch (func)
        {
            case "1":
                func = MemberFunction.MOBILE_MEMBERS.toString();
                break;
            case "2":
                func = MemberFunction.HEAVY_LIFTERS.toString();
                break;
            case "3":
                func = MemberFunction.SCRIPT_GUYS.toString();
                break;
            case "4":
                func = MemberFunction.BIG_BROTHERS.toString();
                break;
            default:
                System.out.println("\nInvalid input");
                return;
        }

        int i = -1;

        for (Member member : m)
        {
            if (member.getFunction().equals(func) && i == -1)
            {
                System.out.println("\nDelete " + member.getUsername() + "? (Y/N)");
                String resp = s.next();
                if (resp.equalsIgnoreCase("y"))
                {
                    i = m.indexOf(member);
                }
            }
        }

        m.remove(i);
    }

    private static void showMenu(Member member)
    {
        Scanner s = new Scanner(System.in);
        boolean whileBool = true;

        while (whileBool)
        {
            System.out.println("\nWelcome to the Masked society");
            System.out.println("Work time: " + member.getSt());
            System.out.println("""
                    
                    1 - Present
                    2 - Work
                    3 - Change time
                    4 - Check time
                    0 - Log out
                    """);
            String iter = s.next();

            switch (iter)
            {
                case "1":
                    System.out.println("Present");
                    break;
                case "2":
                    System.out.println("Work");
                    break;
                case "3":
                    member.changeST();
                    break;
                case "4":
                    member.printST();
                    break;
                case "0":
                    whileBool = false;
                    break;
                default:
                    System.out.println("Invalid input");
            }
        }
    }

    private static void showAdminMenu(Member member, LinkedList<Member> m)
    {
        Scanner s = new Scanner(System.in);
        boolean whileBool = true;

        while (whileBool)
        {
            System.out.println("\nWelcome to the Masked society");
            System.out.println("Work time: " + member.getSt());
            System.out.println("""
                    
                    1 - Present
                    2 - Work
                    3 - Change time
                    4 - Check time
                    5 - Add member
                    6 - Delete member
                    7 - Show all members
                    0 - Log out
                    """);
            String iter = s.next();

            switch (iter)
            {
                case "1":
                    System.out.println("Present");
                    break;
                case "2":
                    System.out.println("Work");
                    break;
                case "3":
                    member.changeST();
                    break;
                case "4":
                    member.printST();
                    break;
                case "5":
                    createMember(m);
                    break;
                case "6":
                    deleteMember(m);
                    break;
                case "7":
                    for (Member members : m)
                    {
                        System.out.println("Function: " + members.getFunction() + " Username: " + members.getUsername());
                    }
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
