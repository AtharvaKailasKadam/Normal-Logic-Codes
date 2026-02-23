package Practice_Questions;

import java.util.Scanner;
import java.util.Arrays;

public class Bubble_Sort1
{
    int BubbleSort (int[] Arr)
    {
        for(int i = 0; i < Arr.length - 1; i++)
        {
            for(int j = 0; j < Arr.length - 1 - i; j++)
            {
                if(Arr[j] > Arr[j + 1])
                {
                    int temp = Arr[j];
                    Arr[j] = Arr[j + 1];
                    Arr[j + 1] = temp;
                }
            }
        }
        System.out.println("The Array Elements After Sorting are as Follow : "+Arrays.toString(Arr));
        return 0;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the Array : ");
        int size = scanner.nextInt();

        int[] Arr = new int[size];
        for(int i = 0; i < size; i++)
        {
            System.out.print("Enter the Elements in the Arr ["+i+"] : ");
            Arr[i] = scanner.nextInt();
        }

        scanner.close();

        Bubble_Sort1 BS = new Bubble_Sort1();
        BS.BubbleSort(Arr);
    }
}