package ishikawa.jun.guilherme.member.function;

import ishikawa.jun.guilherme.member.Member;
import ishikawa.jun.guilherme.member.enumeracoes.MemberFunction;

import java.util.LinkedList;
import java.util.Scanner;

public class BigBrothers extends Member
{
    public BigBrothers(String username, String email, String pwd)
    {
        super(username, email, pwd, MemberFunction.BIG_BROTHERS.toString());
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
                    5 - Add member
                    6 - Delete member
                    7 - Show all members
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
                    break;
                case "3":
                    changeST();
                    break;
                case "4":
                    System.out.println(getSt());
                    break;
                case "5":
                    createMember(members);
                    break;
                case "6":
                    deleteMember(members);
                    break;
                case "7":
                    for (Member m : members) {
                        m.apresentar();
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
        int id = 0;

        for (Member member : m)
        {
            if (member.getFunction().equals(func) && i == -1)
            {
                id++;
                System.out.println("\n" + id + "user found");
                System.out.println("\nDelete " + member.getUsername() + "? (Y/N)");
                String resp = s.next();
                if (resp.equalsIgnoreCase("y"))
                {
                    i = m.indexOf(member);
                }
            }
        }
        if (i != -1)
            m.remove(i);
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
}
