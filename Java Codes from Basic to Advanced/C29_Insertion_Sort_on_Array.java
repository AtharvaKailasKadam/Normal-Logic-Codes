import java.util.Arrays;
import java.util.Scanner;

public class C29_Insertion_Sort_on_Array
{
    public void Insertion_Sort(int[] arr, int size)
    {
        for(int i = 1; i < size; i++)
        {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println("The Sorted Array is : " + Arrays.toString(arr));
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the Array : ");
        int size = scanner.nextInt();

        System.out.println("Enter the Elements in the Array : ");
        int[] Array = new int[size];

        for(int i = 0; i < size; i++ )
        {
            Array[i] = scanner.nextInt();
        }

        scanner.close();

        System.out.println("The Elements in the Array are : "+Arrays.toString(Array));

        C29_Insertion_Sort_on_Array ISA = new C29_Insertion_Sort_on_Array();
        ISA.Insertion_Sort(Array, size);
    }
}


// Time Complexity :--
// O(n^2) in Worst case
// O(n) in Best case when the array is already sorted
// Space Complexity = O(1) as we are not using any extra space