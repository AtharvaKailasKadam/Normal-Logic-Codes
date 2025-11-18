import java.util.Arrays;
import java.util.Scanner;

public class A28_Median_Of_Unsorted_Array
{
    public void MedianOfUnsortedArray(int[] Array, int Len)
    {
        for(int i = 0; i < Len; i++)
        {
            for(int j = i; j < Len; j++)
            {
                if(Array[i] > Array[j])
                {
                    int temp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = temp;
                }
            }
        }
        System.out.println("Array after Sorting is : " +Arrays.toString(Array));

        double median;
        if(Len % 2 == 0)
        {
            median = (Array[(Len / 2) - 1] + Array[Len / 2]) / 2.0;
            System.out.println("Median of the Array is : " +median);
        }
        else
        {
            median = Array[Len / 2];
            System.out.println("Median of the Array is : " +median);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Median of An Unsorted Array...!");

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

        A28_Median_Of_Unsorted_Array MUA = new A28_Median_Of_Unsorted_Array();
        MUA.MedianOfUnsortedArray(Array, size);
    }
}
