
import java.util.Scanner;

public class C2_Name_of_User
{
    public void NameofUser()
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter The Name of The User: ");
            String name = scanner.nextLine();
            System.out.println("The Name of the User is: " + name);
            scanner.close();
        }
    // Main method to run the program
    public static void main(String[] args)
    {
        C2_Name_of_User NU = new C2_Name_of_User();
        NU.NameofUser();
    }
}

