package nix;

import com.sun.jdi.LongType;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        long x = 214753649;
        System.out.println(Long.toBinaryString(x));

        /*я нашел правильное решение условия, но
        я совсем не могу понять как отстроить правильный
        цикл, который будет брать каждую цифру отдельно.
        Точнее в теории понимаю, но не могу это прописать без
        ошибок.
        Если возможно - покажите пожалуйста это на лекции
        в понедельник
         */


        int i = 3;
          {
            if (((i % 2) == 0) && ((i % 3) == 0))
                System.out.println("fizzbuzz");
            else if ((i % 2) == 0)
                System.out.println("fizz");
            else if ((i % 3) == 0)
                System.out.println("buzz");
            else
                System.out.println(i);
        }

    }

}



