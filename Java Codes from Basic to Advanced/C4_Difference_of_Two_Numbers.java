import java.util.Scanner;
public class C4_Difference_of_Two_Numbers
{
    public void Difference()
    {
        // Using 'Scanner' to take Input from the User.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st Number: ");
        float a = scanner.nextFloat();

        System.out.println("Enter the 2nd Number: ");
        float b = scanner.nextFloat();

        System.out.println("The Two Numbers are " + a + " and " + b);

        // 'if-else' block to handle the error without using Exception Handling
        if(a<b)
        {
            System.out.println("");
            System.out.println("ERROR...! The First is Smaller then the Second Number");
            System.out.println("Enter Valid Data");
            System.out.println("");
            Difference();
        }
        else
        {
            System.out.println("The Difference between First and Second Number is: ");
            float result = a - b;
            System.out.println(result);
        }
        // Closing the Scanner tag.
        scanner.close();
    }
    public static void main(String[] args)
    {
        C4_Difference_of_Two_Numbers DN = new C4_Difference_of_Two_Numbers();
        DN.Difference();
    }
}
