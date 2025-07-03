import java.util.Scanner;

public class C16_Check_Number_is_Prime
{
    public void Prime(int a)
    {

        if((a % 2 != 0) && (a % 2 != 0) && (a % 3 != 0) && (a % 4 != 0) && (a % 5 != 0) && (a % 6 != 0) && (a % 7 != 0) && (a % 8 != 0) && (a % 9 != 0))
        {
            System.out.println("The Number "+ a + " is a Prime Number");
        }
        else
        {
            System.out.println("The Number "+ a + " is NOT a Prime Number");
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number to be Checked : ");
        int x = scanner.nextInt();
        scanner.close();

        C16_Check_Number_is_Prime CNP = new C16_Check_Number_is_Prime();
        CNP.Prime(x);
    }
}
