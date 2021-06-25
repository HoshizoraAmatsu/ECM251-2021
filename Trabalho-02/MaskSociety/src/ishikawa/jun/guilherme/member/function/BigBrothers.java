package ishikawa.jun.guilherme.member.function;

import ishikawa.jun.guilherme.member.Member;
import ishikawa.jun.guilherme.member.enumeracoes.MemberFunction;

public class BigBrothers extends Member
{
    public BigBrothers(String username, String email, String pwd)
    {
        super(username, email, pwd, MemberFunction.BIG_BROTHERS.toString());
    }
}
