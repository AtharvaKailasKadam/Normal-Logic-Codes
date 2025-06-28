import java.util.Scanner;
public class C8_Positive_Negative_or_Zero
{
    public void PositeNegativeorZero(float a)
    {
        if(a < 0)
        {
            System.out.println("The Number is a Negative Number....!");
        }
        else if(a > 0)
        {
            System.out.println("The Number is a Positive Number.....!");
        }
        else
        {
            System.out.println("The Number is a Zero I.e. '0'...!");
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number to Checked as 'Positive' or 'Negative' or 'Zero'...?");
        float x = scanner.nextFloat();

        System.out.println("The Entered Number is : "+ x);
        scanner.close();

        C8_Positive_Negative_or_Zero PNZ = new C8_Positive_Negative_or_Zero();
        PNZ.PositeNegativeorZero(x);
    }

}
