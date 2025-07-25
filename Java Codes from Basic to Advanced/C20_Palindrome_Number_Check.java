import java.util.Scanner;

public class C20_Palindrome_Number_Check
{
    public void Palindrome_Number(int Num)
    {
        int original = Num;
        int digit = 0;
        int reverse = 0;

        while(Num != 0)
        {
            digit  = Num % 10;
            reverse = reverse * 10 + digit;
            Num = Num / 10;
        }
        if(reverse == original)
        {
            System.out.println("The Number "+ original + " is a Palindrome...!");
        }
        else
        {
            System.out.println("The Number " + original + " is Not A Palindrome...!");
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number to be Checked for Palindrome.");
        int a = scanner.nextInt();
        scanner.close();

        C20_Palindrome_Number_Check PNC = new C20_Palindrome_Number_Check();
        PNC.Palindrome_Number(a);
    }
}
