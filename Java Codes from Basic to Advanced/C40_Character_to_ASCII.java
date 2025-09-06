import java.util.Scanner;

public class C40_Character_to_ASCII
{
    public void CharacterToASCII(String str)
    {
        String checked = "";
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ' ' || checked.indexOf(str.charAt(i)) != -1)
            {
                continue;
            }
            char ch = str.charAt(i);
            int ASCII = (int) ch;
            System.out.println("The ASCII Value of the Character "+ch +" is : "+ASCII);
            checked = checked + ch;
        }
    }
// Without Repeating the Same Character.
// Without Repeating the Space.

    public static void main(String args[])
    {
        System.out.println("String Character to ASCII Code!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Value of the String : ");
        String string = scanner.nextLine();
        scanner.close();

        C40_Character_to_ASCII CTC = new C40_Character_to_ASCII();
        CTC.CharacterToASCII(string);
    }
}
