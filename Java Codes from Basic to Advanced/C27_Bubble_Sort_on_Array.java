import java.util.Arrays;
import java.util.Scanner;

public class C27_Bubble_Sort_on_Array
{
    public void Bubble_Sort(int[] arr, int n)
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("The Sorted Array is : "+Arrays.toString(arr));
    }

    public static void main(String[] args)
    {
        System.out.println("Bubble Sort Program");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the Array : ");
        int size = scanner.nextInt();

        System.out.println("Enter the Elements in the Array : ");
        int[] Array =  new int[size];

        for(int i = 0; i < size; i++)
        {
            Array[i] = scanner.nextInt();
        }

        scanner.close();

        C27_Bubble_Sort_on_Array BSA = new C27_Bubble_Sort_on_Array();
        BSA.Bubble_Sort(Array, size);
    }
}

// Time Complextiy :--
// O(n^2) in Worst case
// O(n) in Best case when the array is already sorted
// Space Complexity = O(1) as we are not using any extra space