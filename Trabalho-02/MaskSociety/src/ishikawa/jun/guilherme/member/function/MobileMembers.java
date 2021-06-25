package ishikawa.jun.guilherme.member.function;

import ishikawa.jun.guilherme.member.Member;
import ishikawa.jun.guilherme.member.enumeracoes.MemberFunction;

public class MobileMembers extends Member
{
    public MobileMembers(String username, String email, String pwd)
    {
        super(username, email, pwd, MemberFunction.MOBILE_MEMBERS.toString());
    }
}
