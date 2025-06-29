import java.util.Scanner;

public class C9_Largest_of_Three
{
    public void LargestofThree(float a, float b, float c)
    {
        if(a > b && a > c)
        {
            System.out.println("\n'A' is the Largest Number i.e. : "+ a);
        }
        else if(b > a && b > c)
        {
            System.out.println("\n'B' is the Largest Number i.e. : "+ b);
        }
        else
        {
            System.out.println("\n'C' is the Largest Number i.e. : "+ c);
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Value of 'a' : ");
        float x = scanner.nextFloat();

        System.out.println("Enter the Value of 'b' : ");
        float y = scanner.nextFloat();

        System.out.println("Enter the Value of 'c' : ");
        float z = scanner.nextFloat();
        scanner.close();

        System.out.println("The Value of 'A' is : "+ x);
        System.out.println("The Value of 'B' is : "+ y);
        System.out.println("The Value of 'C' is : "+ z);

        C9_Largest_of_Three LoT = new C9_Largest_of_Three();
        LoT.LargestofThree(x, y, z);
    }
}

