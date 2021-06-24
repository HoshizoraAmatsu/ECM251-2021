package ishikawa.jun.guilherme.member.function;

import ishikawa.jun.guilherme.member.Member;
import ishikawa.jun.guilherme.member.types.MemberFunction;

public class BigBrothers extends Member
{
    public BigBrothers(String username, String email, String function)
    {
        super(username, email, MemberFunction.BIG_BROTHERS.toString());
    }
}
