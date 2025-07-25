import java.util.Scanner;

public class C19_Number_of_Digits
{
    public void Number_of_Digits(int Num)
    {

        System.out.println("The Number to be Checked is : "+ Num);
        int digit;
        int count = 0;
        while (Num != 0)
        {
            digit = Num % 10;
            count = count + 1;
            Num = Num / 10;
        }
        System.out.println("The Number of Digits in "+Num+" is " +count);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number to be Checked : ");
        int a = scanner.nextInt();
        scanner.close();

        C19_Number_of_Digits NoD = new C19_Number_of_Digits();
        NoD.Number_of_Digits(a);

    }
}
