import java.util.Scanner;

public class C33_Convert_lowerCase_and_upperCase
{
    public void Convert(String str)
    {
        String UpCse = str.toUpperCase();
        String LoCse = str.toLowerCase();
        int LenCse = str.length();

        System.out.println("The Original String is : "+str);
        System.out.println("The String after Converting into UpperCase : "+UpCse);
        System.out.println("The String after Converting into LowerCase : "+LoCse);
        System.out.println("The Length of the Given String is : "+LenCse);
    }

    public static void main(String[] args)
    {
        System.out.println("Convert into UpperCase and LowerCase");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String to Convert : ");
        String string = scanner.nextLine();

        scanner.close();

        C33_Convert_lowerCase_and_upperCase CON = new C33_Convert_lowerCase_and_upperCase();
        CON.Convert(string);
    }
}
