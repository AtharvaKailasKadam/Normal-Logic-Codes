import java.util.Scanner;

public class C13_Fibonacci_Series
{
    public void Fibonacci(int n)
    {
        int a = 0;
        int b = 1;

        for(int i = 0; i < n; i++)
        {
            System.out.println(a + ", ");
            int NextTerm = a + b;
            a = b;
            b = NextTerm;
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number till what you Want the Fibonacci Series : ");
        int a = scanner.nextInt();
        scanner.close();
        System.out.println("The Fibonacci Series is as Follows : ");

        C13_Fibonacci_Series FS = new C13_Fibonacci_Series();
        FS.Fibonacci(a);
    }
}
