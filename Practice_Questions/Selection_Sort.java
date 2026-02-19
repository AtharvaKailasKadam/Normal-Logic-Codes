package Practice_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Selection_Sort
{
    int SelectionSort (int[] Arr)
    {
        for(int i = 0; i < Arr.length - 1; i++)
        {
            int minTerm = Arr[i];
            for(int j = i; j < Arr.length; j++)
            {
                if(Arr[j] < minTerm)
                {
                    minTerm = Arr[j];
                    int temp = Arr[i];
                    Arr[i] = minTerm;
                    Arr[j] = temp;
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
        for(int i = 0; i < 0; i++)
        {
            System.out.print("Enter the Elements in the Array");
            Arr[i] = scanner.nextInt();
        }

        scanner.close();

        Selection_Sort SS = new Selection_Sort();
        SS.SelectionSort(Arr);
    }
}
