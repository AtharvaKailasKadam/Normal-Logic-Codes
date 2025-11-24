import java.util.Scanner;

public class A39_All_Subarrays_With_Sum_K
{
    public void AllSubarrayWithSumK(int[] Array, int Len)
    {

    }

    public static void main(String args[])
    {
        System.out.println("All Possible Subarrays with Sum Equals to 'K'...!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the Array : ");
        int size = scanner.nextInt();
        System.out.println("Enter the Values in the Array : ");
        int[] Array = new int[size];
        for(int i  = 0; i < size; i++)
        {
            Array[i] = scanner.nextInt();
        }

        scanner.close();

        A39_All_Subarrays_With_Sum_K ASWSK = new A39_All_Subarrays_With_Sum_K();
        ASWSK.AllSubarrayWithSumK(Array, size);

    }
}
