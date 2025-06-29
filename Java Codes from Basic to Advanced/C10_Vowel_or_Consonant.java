import java.util.Scanner;

public class C10_Vowel_or_Consonant
{
    public void VowelorConsonant(char a)
    {
        if(a == 'a' || a == 'A')
        {
            System.out.println("The Entered Letter is a Vowel i.e. : "+  a);
        }
        else if(a == 'i' || a == 'I')
        {
            System.out.println("The Entered Letter is a Vowel i.e. : "+ a);
        }
        else if(a == 'e' || a == 'E')
        {
            System.out.println("The Entered Letter is a Vowel i.e. : "+ a);
        }
        else if(a == 'o' || a == 'O')
        {
            System.out.println("The Entered Letter is a Vowel  i.e. : "+ a);
        }
        else if(a == 'u' || a == 'U')
        {
            System.out.println("The Entered Letter is a Vowel  i.e. : "+ a);
        }
        else
        {
            System.out.println("The Entered Letter is a Consonant i.e. : "+ a);
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Letter to be Checked : ");
        char x = scanner.next().charAt(0);
        scanner.close();

        System.out.println("The Entered Letter is : "+ x);

        C10_Vowel_or_Consonant VoC = new C10_Vowel_or_Consonant();
        VoC.VowelorConsonant(x);

    }
}