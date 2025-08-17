import java.util.Arrays;
import java.util.Scanner;

public class C30_Merge_Two_Sorted_Array
{
    public void Merge_Array(int[] arr1, int[] arr2, int size1, int size2)
    {
        int[] Array3 = new int[size1 + size2];
        int i = 0, j = 0, k = 0;


        while(i < size1 && j < size2)
        {
            if(arr1[i] <= arr2[j])
            {
                Array3[k] = arr1[i];
                i++;
                k++;
            }
            else
            {
                Array3[k] = arr2[j];
                j++;
                k++;
            }
        }
        while(i < size1)
        {
            Array3[k] = arr1[i];
            i++;
            k++;
        }
        while(j < size2)
        {
            Array3[k] = arr2[j];
            j++;
            k++;
        }

        System.out.println("The Merged Sorted Array is : "+Arrays.toString(Array3));
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of teh First Array : ");
        int Size1 = scanner.nextInt();

        System.out.println("Enter the Elements in the First Array : ");
        int[] Array1 = new int[Size1];
        for(int i = 0; i < Size1; i++)
        {
            Array1[i] = scanner.nextInt();
        }


        System.out.println("Enter the Size of the Second Array : ");
        int Size2 = scanner.nextInt();

        int[] Array2 = new int[Size2];
        for(int i = 0; i < Size2; i++)
        {
            Array2[i] = scanner.nextInt();
        }

        System.out.println("The Elements in the First Array are : "+Arrays.toString(Array1));
        System.out.println("The Elements in the Second Array are : "+Arrays.toString(Array2));

        scanner.close();

        C30_Merge_Two_Sorted_Array MTS = new C30_Merge_Two_Sorted_Array();
        MTS.Merge_Array(Array1, Array2, Size1, Size2);
    }
}

// Time Complexity :--
// O(n + m) where n is the size of the first array and m is the size of the second array
// Space Complexity = O(n + m) as we are using an extra array to store the merged result
// Note: The input arrays should be sorted for this merge function to work correctly.
// If the input arrays are not sorted, you may need to sort them first before merging.