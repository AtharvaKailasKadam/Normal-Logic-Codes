import java.util.Arrays;
import java.util.Scanner;

public class Remove_Duplicates_From_Array
{
    public void RemoveDuplicates(int[] Array)
    {

        int[] UniqueArray = new int[Array.length];
        int size = 0;
        for(int i = 0; i < Array.length; i++)
        {
            boolean isDuplicate = false;
            for(int j = 0; j < size; j++)
            {
                if(Array[i] == UniqueArray[j])
                {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate)
            {
                UniqueArray[size] = Array[i];
                size++;
            }
        }
        System.out.println(("The Array with Duplicates is : "+Arrays.toString(Array)));
        System.out.println(("The Array Without Duplicates is : "+Arrays.toString(Arrays.copyOf(UniqueArray, size))));
    }

    public static void main(String args[])
    {
        System.out.println("Remove Duplicates from the Array,...!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of the Array : ");
        int size = scanner.nextInt();

        System.out.println("Enter the Elements in the Array : ");
        int[] Array = new int[size];
        for(int i = 0; i < size; i++)
        {
            Array[i] = scanner.nextInt();
        }
        scanner.close();

        Remove_Duplicates_From_Array RDA = new Remove_Duplicates_From_Array();
        RDA.RemoveDuplicates(Array);

    }
}
