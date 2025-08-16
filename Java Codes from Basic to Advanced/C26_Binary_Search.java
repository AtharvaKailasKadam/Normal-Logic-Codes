import java.util.Arrays;
import java.util.Scanner;

public class C26_Binary_Search
{
    public void Binary_Search(int arr[], int n, int target)
    {
        int low = 0;
        int high = n-1;
        boolean Found = false;
        System.out.println("The Elements in the Array are : "+Arrays.toString(arr));
        for(int i = 0; i < n; i++)
        {
            int mid = (low + high) / 2;
            if(arr[mid] == target)
            {
                Found = true;
                System.out.println("Key Element Found at Index : " +mid);
                break;
            }
            else if (arr[mid] < target)
            {
                low = mid + 1;
            }
            else if (arr[mid] > target)
            {
                high = mid - 1;
            }
            else
            {
                Found = false;
                System.out.println("Key Element Not Found....!");
            }
        }
        if(Found == false)
        {
            System.out.println("Key Element Not Found in the Array...!");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Binary Search Program");
        System.out.println("Enter the Size of the Array : ");

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        System.out.println("Enter the Elements in the Array iin Sorted Format : ");
        int[] Array = new int[size];

        for(int i = 0; i < size; i++)
        {
            Array[i] = scanner.nextInt();
        }

        System.out.println("Enter the Element to be Searched : ");
        int keyElement = scanner.nextInt();

        scanner.close();

        C26_Binary_Search BS = new C26_Binary_Search();
        BS.Binary_Search(Array, size, keyElement);

    }
}

// Time Complexity :--
// O(log n) in Worst case
// O(1) in Best case when the element is found at mid position
// Space Complexity = O(1) as we are not using any extra space
// Note: The array must be sorted for binary search to work correctly.