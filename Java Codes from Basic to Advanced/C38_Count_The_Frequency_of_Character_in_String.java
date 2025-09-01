import java.util.Scanner;
public class C38_Count_The_Frequency_of_Character_in_String
{
    public void FrequencyOfCharacter(String str)
    {
        String str1 = str;
        int len = str1.length();
        str1 = str1.toLowerCase();

        int[] freq = new int[256];

        for(int i = 0; i < len; i++)
        {
            char ch = str.charAt(i);
            if(ch != ' ')
            {
                freq[ch]++;
            }
        }

        for(int i = 0; i < freq.length; i++)
        {
            if(freq[i] > 0)
            {
                System.out.println((char)i +" => "+ freq[i] );
            }
        }

    }
    public static void main(String[] args)
    {
        System.out.println("Frequency of Every Character!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String to Find Frequency of Each Character : ");
        String string1 = scanner.nextLine();

        scanner.close();

        C38_Count_The_Frequency_of_Character_in_String FOC = new C38_Count_The_Frequency_of_Character_in_String();
        FOC.FrequencyOfCharacter(string1);
    }
}
