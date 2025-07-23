import java.util.Scanner;

public class C17_Sum_of_Digits_in_Number
{
    public void Sum_of_Digit(int a)
    {
        System.out.println("The Number passed as the Input is : "+a);
        int sum = 0;
        while(a != 0)
        {
            int digit;
            digit = a % 10;
            sum = sum + digit;
            a = a / 10;
        }
        System.out.println("The Sum of the Digits of the Number is : "+sum);
    }

    public static void main(String[] args)
    {
        int num;
        System.out.println("Enter the Number to Find the Sum of Digits : ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        scanner.close();

        C17_Sum_of_Digits_in_Number SoD = new C17_Sum_of_Digits_in_Number();
        SoD.Sum_of_Digit(num);


    }
}
