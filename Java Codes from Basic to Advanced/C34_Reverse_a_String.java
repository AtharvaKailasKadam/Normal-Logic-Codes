import java.util.Scanner;

public class C34_Reverse_a_String
{
    public void Reverse(String str)
    {
        int len = str.length();
        String rev = "";

        for(int i = len - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
            System.out.println("The Reversed String is : "+rev);
        }
        System.out.println("Done.....!");
        System.out.println("The Final Reversed String is : "+rev);

    }

    public static void main(String[] args)
    {
        System.out.println("Reverse a String Program");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String to be Reversed..!");
        String string = scanner.nextLine();
        scanner.close();

        C34_Reverse_a_String RS = new C34_Reverse_a_String();
        RS.Reverse(string);
        System.out.println("Done");

    }
}
