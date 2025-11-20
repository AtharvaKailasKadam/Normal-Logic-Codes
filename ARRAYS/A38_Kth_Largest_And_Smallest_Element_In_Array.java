import java.util.Arrays;
import java.util.Scanner;

public class A38_Kth_Largest_And_Smallest_Element_In_Array
{
    public void KthLargestAndSmallesElement(int[] Array, int Len, int Key)

    //This Problem is Solved by Sorting the Values/Elements in the Array.
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

        int Kth_Largest = Len - Key;
        int Kth_Smallest = Key  - 1;
        System.out.println("The '" + Key +"' K-th Largest Element is : " +Array[Kth_Largest]);
        System.out.println("The '" + Key +"' K-th Smallest Element is : " +Array[Kth_Smallest]);

    }
    public static void main(String[] args)
    {
        System.out.println("K-th Largest and Smallest Elemnt in the Array....!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the Array : ");
        int size = scanner.nextInt();
        System.out.println("Enter the Values in the String : ");
        int[] Array = new int[size];
        for(int i = 0; i < size; i++)
        {
            Array[i] = scanner.nextInt();
        }

        System.out.println("Enter the Value of 'K' to Find the K-th Largest and Smallest Element in the Array : ");
        int K = scanner.nextInt();

        scanner.close();

        System.out.println("The Array Elements are : "+Arrays.toString(Array));

        A38_Kth_Largest_And_Smallest_Element_In_Array KLASE = new A38_Kth_Largest_And_Smallest_Element_In_Array();
        KLASE.KthLargestAndSmallesElement(Array, size, K);
    }
}
// Done