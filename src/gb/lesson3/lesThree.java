package gb.lesson3;
import java.util.Scanner;
import java.lang.Math;

public class lesThree
{

//1. Написать программу, которая загадывает случайное число от 0 до 9,
// и пользователю дается 3 попытки угадать это число. При каждой попытке
// компьютер должен сообщить больше ли указанное пользователем число чем
// загаданное, или меньше. После победы или проигрыша выводится запрос –
// «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

    public static void main(String[] args)
    {
        numberGame();
    }

    static void numberGame()
    {
        Scanner sc = new Scanner(System.in);

        int ans;
        int num             = (int)(Math.random()*10);
        boolean flagCorr    = false;

        System.out.println("Отгадайте число от 0 до 9, у Вас 3 попытки");
        for (int i = 1; i < 4; i++)
        {
            System.out.println("Попытка " + i );
            ans = sc.nextInt();
            if (ans < num) System.out.println("Загаданное число больше");
            if (ans > num) System.out.println("Загаданное число меньше");
            if (ans == num)
            {
                System.out.println("Вы угадали!");
                qustionOfEnd();
                flagCorr    =   true;
                break;
            }
        }
        if (flagCorr    ==   false)
        {
            System.out.println("Вы не угадали :(");
            qustionOfEnd();
        }
    }

    static void qustionOfEnd()
    {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        if (sc2.nextInt() == 1) numberGame();
        else System.out.println("Конец игры.");
    }
}

