import java.util.Scanner;

public class C6_Swap_Two_Numbers
{
    public void Swap(float a, float b)
    {
        // Swapping the values of 'a' and 'b' using a temporary variable.
        System.out.println("\n Swapping The Numbers With Third 'temp' Variable : ");
        float temp = a;
        a = b;
        b = temp;
        System.out.println("The Value of A after Swapping is : " + a);
        System.out.println("The Value of B after Swapping is : " + b);
    }
    public void SwapWithoutTemp(float a, float b)
    {
        // Swapping the Values of 'a' and 'b' without using temporary variable.
        System.out.println("\n Swapping The Numbers Without Third 'temp' Variable : ");
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("The Value of A after Swapping is : " + a);
        System.out.println("The Value of B after Swapping is : " + b);
    }
    // Main method to execute the program.
    public static void main(String[] args)
    {
        // Using 'Scanner' to take Input from the User.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st Number : ");
        float a = scanner.nextFloat();
        System.out.println("Enter the 2nd Number : ");
        float b = scanner.nextFloat();
        scanner.close();

        System.out.println("The Two Number are " + a + " and " + b);
        System.out.println("The Value of A before Swapping is : " + a);
        System.out.println("The Value of B before Swapping is : " + b);

        C6_Swap_Two_Numbers SN = new C6_Swap_Two_Numbers();
        SN.Swap(a, b);
        SN.SwapWithoutTemp(a, b);


    }
}
