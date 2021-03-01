package ishikawa.jun.guilherme;

import javax.swing.*;

public class basico02
{
    public static void main(String[] args)
    {
        //Estruturas de decisão no Java
        int poderDeLuta = 8000;

        //Decisão simples
        if(poderDeLuta >=8000)
        {
            System.out.println("Kakaroto!");
        }

        //Decisão composta
        if(poderDeLuta >10000)
        {
            System.out.println("Pode ser super saiyan");
        }
        else
        {
            System.out.println("Pode ser o kuririn!");
        }

        //Decisão múltipla
        int morreu = 5;

        if(morreu == 0)
        {
            System.out.println("Você é uma pessoa normal!");
        }
        else if(morreu < 3)
        {
            System.out.println("Você é um guerreiro que já foi salvo pelo Goku");
        }
        else if(morreu < 8)
        {
            System.out.println("Provavelmente você é um Saiyajin!");
        }
        else
        {
            System.out.println("Bem vindo de volta Kuririn!");
        }

        //Decisão mpultipla - switch
        switch(morreu)
        {
            case 0:
                System.out.println("Ola mundo");
                break;
            case 10:
                System.out.println("Vixi!");
                break;
            default:
                System.out.println("É nois!");
                break;
        }
    }
}
