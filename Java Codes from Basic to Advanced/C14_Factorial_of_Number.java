import java.util.Scanner;

class C14_Factorial_of_Number
{
    void Factorial(int Fact)
    {
        if(Fact == 0)
        {
            Fact = 1;
        }
        else
        {
            Fact = 1;
        }

    }
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Value to Find the Factorial of : ");
        int a = scanner.nextInt();
        scanner.close();

        C14_Factorial_of_Number FN = new C14_Factorial_of_Number();
        FN.Factorial(a);
    }

}
