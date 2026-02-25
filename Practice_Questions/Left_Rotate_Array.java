package Practice_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Left_Rotate_Array
{
    public int LeftRotate (int[] Arr)
    {
        int temp = Arr[0];

        for(int i = 1; i < Arr.length; i++)
        {
            Arr[i-1] = Arr[i];
        }
        Arr[Arr.length - 1] = temp;

        System.out.println("The Array Elements after Rotating to left are : " +Arrays.toString(Arr));
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

        scanner.close();

        Left_Rotate_Array LRT = new Left_Rotate_Array();
        LRT.LeftRotate(Arr);
    }
}