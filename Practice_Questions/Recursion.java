package Practice_Questions;
import java.util.Scanner;

public class Recursion
{
    int RecursionName (int n, String s)
    {
        if(n <= 0)
        {
            return 0;
        }
        else
        {
            System.out.println(s);
            RecursionName(n-1, s);
        }
        return 0;

    }
    public static void main(String[] args)
    {
        System.out.println("Enter the Number of Times you want to Print the String : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the String you want to Print : ");
        String s = sc.next();

        Recursion obj = new Recursion();
        obj.RecursionName(n, s);
    }
}
