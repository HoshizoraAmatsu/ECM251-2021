package ishikawa.jun.guilherme.member.function;

import ishikawa.jun.guilherme.member.Member;
import ishikawa.jun.guilherme.member.enumeracoes.MemberFunction;

public class HeavyLifters extends Member
{
    public HeavyLifters(String username, String email, String pwd)
    {
        super(username, email, pwd, MemberFunction.HEAVY_LIFTERS.toString());
    }
}
