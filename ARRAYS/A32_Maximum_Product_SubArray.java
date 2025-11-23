import java.util.Scanner;

public class A32_Maximum_Product_SubArray
{
    public void MaximumProductSubarray(int[] Array, int Len)
    {
        int globalmaxProduct = Array[0];
        int currMax = Array[0];
        int currMin = Array[0];

        for(int i = 1; i < Len; i++)
        {
            if(Array[i] < 0)
            {
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }
            currMax = Math.max(Array[i], currMax * Array[i]);
            currMin = Math.min(Array[i], currMin * Array[i]);
            globalmaxProduct = Math.max(globalmaxProduct, currMax);
        }
        System.out.println("The Maximum Product Subarray is : " + globalmaxProduct);
    }

    public static void main(String[] args)
    {
        System.out.println("Maximum Product Subarray...!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the Array : ");
        int size = scanner.nextInt();
        System.out.println("Enter the Values in the Array : ");
        int[] Array = new int[size];
        for(int i = 0; i < size; i++)
        {
            Array[i] = scanner.nextInt();
        }

        scanner.close();

        A32_Maximum_Product_SubArray MPSA = new A32_Maximum_Product_SubArray();
        MPSA.MaximumProductSubarray(Array, size);
    }
}
