package ishikawa.jun.guilherme.member.function;

import ishikawa.jun.guilherme.member.Member;
import ishikawa.jun.guilherme.member.types.MemberFunction;

public class MobileMembers extends Member
{
    public MobileMembers(String username, String email)
    {
        super(username, email, MemberFunction.MOBILE_MEMBERS.toString());
    }
}
