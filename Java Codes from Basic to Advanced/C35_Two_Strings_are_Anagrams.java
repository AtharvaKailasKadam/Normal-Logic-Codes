import java.util.Scanner;

public class C35_Two_Strings_are_Anagrams
{
    public boolean Anagram(String str1, String str2)
    {
        String string1 = str1.toLowerCase();
        String string2 = str1.toLowerCase();
        int len = str1.length();

        boolean flag;

        if(str1.length() != str2.length())
        {
            System.out.println("The Two Strings i.e. "+ str1 + " and " + str2 + " are not ANAGRAMS...!");
            return false;
        }
        else
        {
            for(int i = 0; i < len; i++ )
            {
                flag = false;
                for(int j = 0; j < len; j++)
                {
                    if(string1.charAt(i) == string2.charAt(j))
                    {
                        flag = true;
                        break;
                    }
                }
                if(flag == false)
                {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println("Program to Check Anagrams");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the First String : ");
        String str1 = scanner.nextLine();

        System.out.println("Enter the Second String : ");
        String str2 = scanner.nextLine();

        scanner.close();

        C35_Two_Strings_are_Anagrams A = new C35_Two_Strings_are_Anagrams();
        boolean b = A.Anagram(str1, str2);
        System.out.println("----------------------------");

        if(b)
            System.out.println("The Two Strings i.e. "+ str1 + " and " + str2 + " are ANAGRAMS...!");
        else
            System.out.println("The Two Strings i.e. "+ str1 + " and " + str2 + " are not ANAGRAMS...!");

        System.out.println("----------------------------");
        System.out.println("End of the Program");
        System.out.println("----------------------------");
    }
}
