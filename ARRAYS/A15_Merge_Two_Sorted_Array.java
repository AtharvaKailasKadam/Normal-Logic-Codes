import java.util.Arrays;
import java.util.Scanner;

public class A15_Merge_Two_Sorted_Array
{
    public void MergeTwoSortedArray (int[] Arr1, int[] Arr2)
    {
        int len1 = Arr1.length;
        int len2 = Arr2.length;
        int TotalLength = len1 + len2;
        int i = 0;
        int j = 0;
        int k = 0;

        int[] MergedArray = new int[TotalLength];

        while(i < len1 && j < len2)
        {
            if(Arr1[i] <= Arr2[j])
            {
                MergedArray[k] = Arr1[i];
                i++;
                k++;
            }
            else
            {
                MergedArray[k] = Arr2[j];
                j++;
                k++;
            }
        }

        // To Put the Remaining Values.
        while(i < len1)
        {
            MergedArray[k] = Arr1[i];
            i++;
            k++;
        }
        while(j < len2)
        {
            MergedArray[k] = Arr2[j];
            j++;
            k++;
        }

        System.out.println("The Merged Sorted Array is : " +Arrays.toString(MergedArray));

    }
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Merge Two Sorted Arrays...!");

        System.out.println("Enter the Size of First Array : ");
        int n1 = scanner.nextInt();

        int[] Array1 = new int[n1];
        System.out.println("Enter the Values in the Array(in Sorted Format) : ");
        for(int i = 0; i < n1; i++)
        {
            Array1[i] = scanner.nextInt();
        }

        System.out.println("Enter the Size of Second Array :");
        int n2 = scanner.nextInt();

        int[] Array2 = new int[n2];
        System.out.println("Enter the Values in the Array(in Sorted Format)");
        for(int i = 0; i < n2; i++)
        {
            Array2[i] = scanner.nextInt();
        }

        scanner.close();

        A15_Merge_Two_Sorted_Array MTSA = new A15_Merge_Two_Sorted_Array();
        MTSA.MergeTwoSortedArray(Array1, Array2);

    }
}