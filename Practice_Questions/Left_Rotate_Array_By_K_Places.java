package Practice_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Left_Rotate_Array_By_K_Places
{
    public int LeftRotateByKPlaces (int[] Arr, int k)
    {
        for(int i = 0; i < k; i++)
        {
            int temp = Arr[0];

            for(int j = 1; j < Arr.length; j++)
            {
                Arr[j-1] = Arr[j];
            }
            Arr[Arr.length - 1] = temp;
        }
        System.out.println("The Array Elements after Rotating to left by " +k+ " places are : " +Arrays.toString(Arr));
        return 0;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the Array : ");
        int size = scanner.nextInt();

        System.out.println("Enter the Elements in the Array :");
        int[] Arr = new int[size];
        for(int i = 0; i < size; i++)
        {
            System.out.print("Element Number : " +i+ ": ");
            Arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the number of places to Rotate the Array : ");
        int k = scanner.nextInt();

        scanner.close();

        Left_Rotate_Array_By_K_Places LRAPK = new Left_Rotate_Array_By_K_Places();
        LRAPK.LeftRotateByKPlaces(Arr, k);
    }
}
