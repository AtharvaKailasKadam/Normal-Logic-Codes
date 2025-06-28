import java.util.Scanner;

class C7_Even_or_Odd {
    public void EvenorOdd(float a)
    {
        if(a == 0)
        {
            System.out.println("\nThe Number Entered is Zero i.e. '0'");
        }
        else
        {
            if(a % 2 == 0)
            {
                System.out.println("The Number Entered is a Positive Number...!");
            }
            else if(a % 2 != 0)
            {
                System.out.println("The Number Entered is a Negative Number....!");
            }
            else
            {
                System.out.println("Invalid Data Input...!");
            }
        }
    }

    // The 'main()' function.
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number to be Checked as 'Even' of 'Odd' : ");
        float x = scanner.nextFloat();

        System.out.println("\nThe Entered Number is : "+ x );

        C7_Even_or_Odd EoO = new C7_Even_or_Odd();
        EoO.EvenorOdd(x);


    }
}