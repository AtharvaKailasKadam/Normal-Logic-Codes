import java.util.Scanner;

public class Frequency_of_Substring_in_Sting
{
    public void Frequency(String str1, String str2)
    {
        System.out.println("To Check The Frequency of the Sub-String.");
        int count = 0;
        String sustr = str2;


        char ch2 = str2.charAt(0 + 1);
        for(int i = 0; i <= str1.length(); i++)
        {
            for(int j = 0; j < str2.length(); j++ )
            {
                if(str1.charAt(i) == str2.charAt(j))
                {
                    if(str1.charAt(i+1) == str2.charAt(j+1))
                    {
                        count++;
                    }
                }
            }
        }

        System.out.println("The Count is "+ count);
    }

    public static void main(String args[])
    {
        System.out.println("Frequency of Sub-String.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Super-String..!");
        String string1 = scanner.nextLine();

        System.out.println("Enter the Sub-String...!");
        String string2 = scanner.nextLine();

        scanner.close();

        Frequency_of_Substring_in_Sting FOS = new Frequency_of_Substring_in_Sting();
        FOS.Frequency(string1, string2);
    }
}
