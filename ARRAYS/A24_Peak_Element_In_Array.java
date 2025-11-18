import java.util.Arrays;
import java.util.Scanner;

// Peak Element in an Array
// Peak element is an element that is greater than or equal to its neighbors.
// For corner elements, we need to consider only one neighbor.

public class A24_Peak_Element_In_Array
{
    public void PeakElementInArray(int[] Array, int Len)
    {
        System.out.println("The Elements in the Array are : "+Arrays.toString(Array));

        for(int i = 0; i < Len; i++)
        {
            if((i == 0 || Array[i] >= Array[i - 1] && Array[i] >= Array[i + 1]) ||
            (i == Len - 1 || Array[i] >= Array[i + 1] && Array[i] >= Array[i - 1]) )
            {
                System.out.println("Peak Element Found at Index " +i+ " : " +Array[i]);
        }
    }
    }
    public static void main(String[] args)
    {
        System.out.println("Peak Element in Array....!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the Array : ");
        int size = scanner.nextInt();
        System.out.println("Enter the Values in the Array : ");
        int[] Array = new int[size];
        for(int i = 0; i < size; i++)
        {
            Array[i] = scanner.nextInt();
        }

        scanner.close();

        A24_Peak_Element_In_Array PEIA = new A24_Peak_Element_In_Array();
        PEIA.PeakElementInArray(Array, size);
    }
}
