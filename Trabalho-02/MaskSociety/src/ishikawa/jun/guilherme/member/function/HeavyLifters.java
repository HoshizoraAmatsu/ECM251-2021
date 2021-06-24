package ishikawa.jun.guilherme.member.function;

import ishikawa.jun.guilherme.member.Member;
import ishikawa.jun.guilherme.member.types.MemberFunction;

public class HeavyLifters extends Member
{
    public HeavyLifters(String username, String email)
    {
        super(username, email, MemberFunction.HEAVY_LIFTERS.toString());
    }
}
