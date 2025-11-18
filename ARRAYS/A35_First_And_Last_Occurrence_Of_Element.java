import java.util.Arrays;
import java.util.Scanner;

public class A35_First_And_Last_Occurrence_Of_Element
{
    public void FirstAndLastOccurrence(int[] Array, int Len, int Key)
    {
        int FirstOccur = -1;
        int LastOccur = -1;

        for(int i = 0; i < Len; i++)
        {
            if(Array[i] == Key)
            {
                if(FirstOccur == -1)
                {
                    FirstOccur = i;
                }
                LastOccur = i;
            }
        }

        System.out.println("The Array is : " +Arrays.toString(Array));
        if(FirstOccur != -1)
        {
            System.out.println("The First Occurrence of the Element " +Key+ " is at Index : " +FirstOccur);
            System.out.println("The Last Occurrence of the Element " +Key+ " is at Index : " +LastOccur);
        }
        else
        {
            System.out.println("The Element " +Key+ " is not Present in the Array.");
        }
    }

    public static void main(String args[])
    {
        System.out.println("First and Last Occurrence of the Element....!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the Array : ");
        int size = scanner.nextInt();
        System.out.println("Enter the Values in the Array : ");
        int[] Array = new int[size];
        for(int i = 0; i < size; i++)
        {
            Array[i] = scanner.nextInt();
        }

        System.out.println("Enter the Key Element to be Searched on the Basis of Occurrences : ");
        int key = scanner.nextInt();

        scanner.close();

        A35_First_And_Last_Occurrence_Of_Element FALCE = new A35_First_And_Last_Occurrence_Of_Element();
        FALCE.FirstAndLastOccurrence(Array, size, key);
    }
}
