import java.util.Arrays;
import java.util.Scanner;

public class A17_Union_of_Array {

    public void UnionArray(int[] Array1, int[] Array2, int Len1, int Len2)
    {
        int[] Array3 = new int[Len1 + Len2];
        int i = 0, j = 0, k = 0;

        while (i < Len1 && j < Len2)
        {
            if(Array1[i] <= Array2[j])
            {
                Array3[k] = Array1[i];
                i++;
                k++;
            }
            else
            {
                Array3[k] = Array2[j];
                j++;
                k++;
            }
        }
        while (i < Len1)
        {
            Array3[k] = Array1[i];
            i++;
            k++;
        }
        while(j < Len2)
        {
            Array3[k] = Array2[j];
            j++;
            k++;
        }

        // Now as we Know we have Sorted Array in Array3, we can Remove Duplicates.
        for(int x = 0; x < k; x++)
        {
            if(x == 0 || Array3[x] != Array3[x - 1])
            {
                System.out.print(Array3[x] + " ");
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Union of Arrays....!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the First Array : ");
        int n1 = scanner.nextInt();
        System.out.println("Enter the Values in the String : ");
        int[] Array1 = new int[n1];
        for(int i = 0; i < n1; i++)
        {
            Array1[i] = scanner.nextInt();
        }

        System.out.println("Enter the Size of the Second Array : ");
        int n2 = scanner.nextInt();
        System.out.println("Enter teh Values in the String");
        int[] Array2 = new int[n2];
        for(int i = 0; i < n2; i++)
        {
            Array2[i] = scanner.nextInt();
        }

        scanner.close();

        A17_Union_of_Array UOA = new A17_Union_of_Array();
        UOA.UnionArray(Array1, Array2, n1, n2);

    }
}
// This logic is only for the Values in the Sorted format.
