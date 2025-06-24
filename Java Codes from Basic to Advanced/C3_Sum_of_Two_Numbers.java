import java.util.Scanner;
public class C3_Sum_of_Two_Numbers
{
    public void Sum()
    // The Program contains Operation on the Float type of Data.
        {
            Scanner scanner = new Scanner(System.in);
            // To Take the Data from the User, we use the Scanner Library.

            System.out.println("Enter the 1st Number: ");
            float a = scanner.nextInt();
            // scanner.nextInt() for accepting Integer Value.

            System.out.println("Enter the 2nd Number: ");
            float b = scanner.nextInt();
            // scanner.nextInt() for accepting Integer Value.


            System.out.println("The Two Numbers are "+ a +" and "+ b );

            float result = a + b;
            System.out.println("The Sum of the Two Numbers is " + a +" + " + b +" is: ");
            System.out.println(result);

            scanner.close();
        }

    public static void main(String[] args)
    {
        C3_Sum_of_Two_Numbers SN = new C3_Sum_of_Two_Numbers();
        SN.Sum();
    }

}
