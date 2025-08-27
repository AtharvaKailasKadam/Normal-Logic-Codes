import java.util.Scanner;

public class C32_Count_Vowels_Consonants_Digits_and_Space_in_String
{
    public void Count(String str)
    {
        String Str = str;
        int len = str.length();
        str = str.toLowerCase();
        int vCount = 0, cCount = 0, dCount = 0, spCount = 0;
        char values;

        for(int i = 0; i < len; i++)
        {
            values = str.charAt(i);

            if(values == 'a' || values == 'e' || values == 'i' || values == 'o' || values == 'u')
            {
                vCount++;
            }
            else if (values >= 'a' && values <= 'z')
            {
                cCount++;
            }
            else if(values >= '0' && values <= '9')
            {
                dCount++;
            }
            else if(values == ' ')
            {
                spCount++;
            }
            else
            {
                break;
            }
        }

        System.out.println("The Total Number of VOWELS are : "+vCount);
        System.out.println("The Total Number of CONSONANTS are : "+cCount);
        System.out.println("The Total Number of DIGITS are : "+dCount);
        System.out.println("The Total Number of SPACES are : "+spCount);

        System.out.println("Done");
    }

    public static void main(String[] args)
    {
        System.out.println("Count Program");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String to be Checked...!");
        String string = scanner.nextLine();

        scanner.close();

        C32_Count_Vowels_Consonants_Digits_and_Space_in_String obj = new C32_Count_Vowels_Consonants_Digits_and_Space_in_String();
        obj.Count(string);

    }
}