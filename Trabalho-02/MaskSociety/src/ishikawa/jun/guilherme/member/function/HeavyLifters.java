package ishikawa.jun.guilherme.member.function;

import ishikawa.jun.guilherme.member.Member;
import ishikawa.jun.guilherme.member.enumeracoes.MemberFunction;
import ishikawa.jun.guilherme.member.enumeracoes.SystemTime;

public class HeavyLifters extends Member
{
    public HeavyLifters(String username, String email, String pwd)
    {
        super(username, email, pwd, MemberFunction.HEAVY_LIFTERS.toString());
    }

    @Override
    public void postarMensagem(String message)
    {
        System.out.println("Message from " + this.function);
        System.out.println(message);
        if (this.st == SystemTime.NORMAL)
            System.out.println("Podem contar conosco!");
        else
            System.out.println("N00b_qu3_n_Se_r3pita.bat");
    }
}
