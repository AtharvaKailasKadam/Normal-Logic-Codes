import java.util.Scanner;

public class C31_String_is_a_Palindrome
{
    public void Palindrome(String str)
    {
        String s1 = str;
        str = str.toLowerCase();
        int len = str.length();
        String rev = "";

        for(int i = len - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev))
        {
            System.out.println("The Given String i.e. "+ s1 + " is a Palindrome String");
        }
        else
        {
            System.out.println("The Given String i.e. "+ s1 + " is Not a Palindrome String");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Palindrome Check Program");

        System.out.println("Enter the String to be Checked..!");
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        scanner.close();

        C31_String_is_a_Palindrome SIP = new C31_String_is_a_Palindrome();
        SIP.Palindrome(string);

    }
}
