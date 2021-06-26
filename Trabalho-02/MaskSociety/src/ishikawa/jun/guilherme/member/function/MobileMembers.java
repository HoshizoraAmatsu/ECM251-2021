package ishikawa.jun.guilherme.member.function;

import ishikawa.jun.guilherme.member.Member;
import ishikawa.jun.guilherme.member.enumeracoes.MemberFunction;
import ishikawa.jun.guilherme.member.enumeracoes.SystemTime;

public class MobileMembers extends Member
{
    public MobileMembers(String username, String email, String pwd)
    {
        super(username, email, pwd, MemberFunction.MOBILE_MEMBERS.toString());
    }

    @Override
    public void postarMensagem(String message)
    {
        System.out.println("Message from " + this.function);
        System.out.println(message);
        if (st == SystemTime.NORMAL)
            System.out.println("Happy Coding!");
        else
            System.out.println("MAsK_S0C13ty");
    }
}
