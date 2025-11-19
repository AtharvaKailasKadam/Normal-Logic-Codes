import java.util.Arrays;
import java.util.Scanner;

// Equilibrium Index of an Array
// Equilibrium Index is an index i such that the sum of elements on the left
// is equal to the sum of elements on the right.
// Example: [-7, 1, 5, 2, -4, 3, 0]  → Equilibrium index = 3

public class A23_Equilibrium_Index_Of_An_Array
{
    public void EquilibriumIndex(int[] Array, int Len)
    {
        System.out.println("The Elements in the Array are : " + Arrays.toString(Array));

        int totalSum = 0;

        // Step 1: Calculate total sum of the array
        for (int num : Array)
        {
            totalSum += num;
        }

        int leftSum = 0;

        // Step 2: Check each index for equilibrium
        for (int i = 0; i < Len; i++)
        {
            totalSum -= Array[i]; // Now totalSum is the Right Sum

            if (leftSum == totalSum)
            {
                System.out.println("Equilibrium Index Found at Index " + i + " : " + Array[i]);
            }

            leftSum += Array[i];
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Equilibrium Index in Array....!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the Array : ");
        int size = scanner.nextInt();

        System.out.println("Enter the Values in the Array : ");
        int[] Array = new int[size];

        for (int i = 0; i < size; i++)
        {
            Array[i] = scanner.nextInt();
        }

        scanner.close();

        A23_Equilibrium_Index_Of_An_Array EIA = new A23_Equilibrium_Index_Of_An_Array();
        EIA.EquilibriumIndex(Array, size);
    }
}
// End of Code