package Practice_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion_Sort
{
    void InsertionSort (int [] Arr)
    {
        for(int i = 1; i < Arr.length; i++)
        {
            int j = i;
            while( j > 0 && Arr[j] < Arr[j - 1])
            {
                int temp = Arr[j];
                Arr[j] = Arr[j - 1];
                Arr[j - 1] = temp;
                j--;
            }
        }
        System.out.println("The Elements of the Array after Sorting Through Insertion Sort are as Follows : " +Arrays.toString(Arr));
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the Array : ");
        int size = scanner.nextInt();

        int[] Arr = new int[size];
        for(int i = 0; i < size; i++)
        {
            System.out.print("Enter the Elements in the Array ["+i+"] : ");
            Arr[i] = scanner.nextInt();
        }

        scanner.close();

        Insertion_Sort IS = new Insertion_Sort();
        IS.InsertionSort(Arr);
    }
}