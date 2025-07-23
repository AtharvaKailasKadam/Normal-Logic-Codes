import java.util.Scanner;

public class C18_Reverse_the_Number
{
    public void Reverse_Number(int num)
    {
        System.out.println("The Entered Number to Reverse is : "+num);

        int reverse = 0;
        int digit = 0;
        while(num != 0)
        {
            digit = num %  10;
            reverse = reverse *10 + digit;
            num = num / 10;
        }
        System.out.println("The Reversed Number is : "+reverse);
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the Number to be Reversed : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();

        C18_Reverse_the_Number RtN = new C18_Reverse_the_Number();
        RtN.Reverse_Number(a);

    }
}
