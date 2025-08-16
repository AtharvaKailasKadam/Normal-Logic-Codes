import java.util.Arrays;
import java.util.Scanner;

public class C25_Linear_Search_in_Array
{
    public void Liner_Search(int[] arr, int key)
    {
        System.out.println("The Elements in the Array are :"+Arrays.toString(arr));
        boolean flag = false ;
        int index = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == key)
            {
                flag = true;
                index = i;
                break;
            }
            else
            {
                flag = false;
            }
        }

        if(flag == true)
        {
            System.out.println("Key Element found on the Index : "+index);
        }
        else
        {
            System.out.println("Key Element not Found...!");
        }
    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the Array : ");
        int size = scanner.nextInt();

        System.out.println(("Enter the Elements in the Array : "));
        int[] Array = new int[size];

        for(int i = 0; i < size; i++)
        {
            Array[i] = scanner.nextInt();
        }

        System.out.println("Enter the 'Element' to be Searched : ");
        int keyElement = scanner.nextInt();

        scanner.close();

        C25_Linear_Search_in_Array LSA = new C25_Linear_Search_in_Array();
        LSA.Liner_Search(Array, keyElement);
    }
}

// Time Complexity :--
// O(n) in Worst case
// O(1) in Best case when the element is found at first position
// Space Complexity = O(1) as we are not using any extra space
