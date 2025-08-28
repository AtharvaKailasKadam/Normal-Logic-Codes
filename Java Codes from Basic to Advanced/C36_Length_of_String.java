import java.util.Scanner;

public class C36_Length_of_String
{
    public void Length(String string1)
    {
        int Count = 0;

        for(char c : string1.toCharArray())
        {
            Count++;
        }
        System.out.println("--------------------------------------------------");
        System.out.println("The Length of String is : "+ Count);

        System.out.println("--------------------------------------------------");
        int len = string1.length();
        System.out.println("By Built-in Methods");
        System.out.println("The Length of String using 'length()' method is : "+ len);
    }
    public static void main(String[] args)
    {
        System.out.println("String Length");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String string = scanner.nextLine();

        scanner.close();

        C36_Length_of_String LoS = new C36_Length_of_String();
        LoS.Length(string);

        System.out.println("--------------------------------------------------");
        System.out.println("Done");
        System.out.println("--------------------------------------------------");
    }
}