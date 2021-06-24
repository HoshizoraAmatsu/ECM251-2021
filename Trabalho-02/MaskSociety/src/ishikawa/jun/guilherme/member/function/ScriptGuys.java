package ishikawa.jun.guilherme.member.function;

import ishikawa.jun.guilherme.member.Member;
import ishikawa.jun.guilherme.member.types.MemberFunction;

public class ScriptGuys extends Member
{
    public ScriptGuys(String username, String email, String function)
    {
        super(username, email, MemberFunction.SCRIPT_GUYS.toString());
    }
}
