import java.util.Scanner;

public class Duplicate_Values_in_String
{
    public void DuplicateValuesInString(String str)
    {
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++)
        {
            char ch1 = str.charAt(i);
            for(int j = i +1; j < str.length(); j++)
            {
                char ch2 = str.charAt(j);
                if(ch1 == ch2)
                {
                    char Duplicate = ch1;
                    System.out.println("The Duplicate Values are : "+ch1);
                    int count = 0;
                    count ++;
                    System.out.println("For : "+ count + " times.");
                }
            }
        }

    }

    public static void main(String args[])
    {
        System.out.println("Duplicate Values in the String");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Value of String to Check the Duplicate Values : ");
        String string = scanner.nextLine();
        scanner.close();

        Duplicate_Values_in_String DVS = new Duplicate_Values_in_String();
        DVS.DuplicateValuesInString(string);
    }
}
