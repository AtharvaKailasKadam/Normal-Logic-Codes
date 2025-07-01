import java.util.Scanner;

public class C12_Table_of_Nth_Number
{
    public void Table(int a)
    {
        System.out.println("The Table of "+ a + " is ");
        for(int i = 1; i <= 10; i++)
        {
            // Formatting the Output to Look-Like a Table of the Number.
            System.out.println(a + "*" + i + "=" + a*i);
        }
        System.out.println("The Table is Displayed Successfully...!");
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of which You want the Table of : ");
        int x = scanner.nextInt();
        scanner.close();

        C12_Table_of_Nth_Number ToN = new C12_Table_of_Nth_Number();
        ToN.Table(x);

    }

}