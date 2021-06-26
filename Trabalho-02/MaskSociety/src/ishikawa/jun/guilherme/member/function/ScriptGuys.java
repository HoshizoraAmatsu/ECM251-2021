package ishikawa.jun.guilherme.member.function;

import ishikawa.jun.guilherme.member.Member;
import ishikawa.jun.guilherme.member.enumeracoes.MemberFunction;
import ishikawa.jun.guilherme.member.enumeracoes.SystemTime;

public class ScriptGuys extends Member
{
    public ScriptGuys(String username, String email, String pwd)
    {
        super(username, email, pwd, MemberFunction.SCRIPT_GUYS.toString());
    }

    @Override
    public void postarMensagem(String message)
    {
        System.out.println("Message from " + this.function);
        System.out.println(message);
        if (st == SystemTime.NORMAL)
            System.out.println("*");
        else
            System.out.println("QU3Ro_S3us_r3curs0s.py");
    }
}
