package ishikawa.jun.guilherme.member.function;

import ishikawa.jun.guilherme.member.Member;
import ishikawa.jun.guilherme.member.enumeracoes.MemberFunction;

public class ScriptGuys extends Member
{
    public ScriptGuys(String username, String email, String pwd)
    {
        super(username, email, pwd, MemberFunction.SCRIPT_GUYS.toString());
    }
}
