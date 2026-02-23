package Practice_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_Sort
{
    void MergeSort (int[] Arr, int low, int high)
    {
        ms(Arr, low, high);
        System.out.println("The Elements of the Array after Sorting Through Merge Sort are as Follows : " +Arrays.toString(Arr));
    }
    void merge(int[] Arr, int low, int mid, int high)
    {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= high)
        {
            if(Arr[i] <= Arr[j])
            {
                temp[k] = Arr[i];
                i++;
                k++;
            }
            else
            {
                temp[k] = Arr[j];
                j++;
                k++;
            }
        }
        while(i <= mid)
        {
            temp[k] = Arr[i];
            i++;
            k++;
        }
        while(j <= high)
        {
            temp[k] = Arr[j];
            j++;
            k++;
        }
        for(int i1 = 0; i1 < k; i1++)
        {
            Arr[low + i1] = temp[i1];
        }
        while(i <= mid)
        {
            temp[k] = Arr[i];
            i++;
            k++;
        }
    }
    void ms(int[] Arr, int low, int high)
    {
        if(low < high)
        {
            int mid = (low + high) / 2;
            ms(Arr, low, mid);
            ms(Arr, mid + 1, high);
            merge(Arr, low, mid, high);
        }
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

        Merge_Sort MS = new Merge_Sort();
        MS.MergeSort(Arr, 0, size - 1);
    }
}