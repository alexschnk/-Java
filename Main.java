import java.util.Scanner;
public class Main
{
    public static int func(String x)
    {
        int y = 0;
        if (x.equals("I")) {
            y = 1;
        }
        if (x.equals("II"))
        {
            y = 2;
        }
        if (x.equals("III"))
        {
            y = 3;
        }
        if (x.equals("IV"))
        {
            y = 4;
        }
        if (x.equals("V"))
        {
            y = 5;
        }
        return y;
    }
    public static int func1(int x, int y, String z)
    {
        int q=0;
        if (z.equals("*"))
        {
            q = (x * y);
        }
        if (z.equals("/"))
        {
            q = (x / y);
        }
        if (z.equals("+"))
        {
            q = (x + y);
        }
        if (z.equals("-"))
        {
            q = (x - y);
        }
        return q;
    }
    private static Scanner read;
    public static void main(String[] args)
    {
        read = new Scanner(System.in);
        int b;
        String operator;
        System.out.println("Выберете калькулятор: ");
        System.out.print("0 - арабские цифры, 1 - римские цифры: ");
        b = read.nextInt();
        if (b==0)
        {
            int x, y;
            System.out.print("x = ");
            x = read.nextInt();
            System.out.print("Operator = ");
            operator = read.next();
            System.out.print("y = ");
            y = read.nextInt();
            System.out.print("Ответ = "+ func1(x, y, operator));
        }
        else
        {
            String x,y;
            System.out.println("Введите римские цифры от I до V");
            System.out.print("x = ");
            x = read.next();
            System.out.print("Оператор = ");
            operator = read.next();
            System.out.print("y = ");
            y = read.next();
            int a = func1(func(x),func(y),operator);
            if(a>0)
            {
                System.out.print("Ответ= "+ a);
            }
            else System.out.print("Исключение!");

        }
    }
}
