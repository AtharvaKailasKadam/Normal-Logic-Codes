package Practice_Questions;

import java.util.Arrays;
public class Quick_Sort
{
    void QuickSort(int[] Arr, int low, int high)
    {
        if(low < high)
        {
            int pI = partitionIndex (Arr, low, high);
            QuickSort(Arr, low, pI - 1);
            QuickSort(Arr, pI + 1, high);
        }
    }

    int partitionIndex (int[] Arr, int low, int high)
    {
        int pivot = Arr[high];
        int i = low - 1;
        for(int j = low; j < high; j++)
        {
            if(Arr[j] < pivot)
            {
                i++;
                int temp = Arr[i];
                Arr[i] = Arr[j];
                Arr[j] = temp;
            }
        }
        int temp = Arr[i + 1];
        Arr[i + 1] = Arr[high];
        Arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args)
    {
        int[] Arr = {5, 2, 9, 1, 5, 6};
        Quick_Sort QS = new Quick_Sort();
        QS.QuickSort(Arr, 0, Arr.length - 1);
        System.out.println("The Elements of the Array after Sorting Through Quick Sort are as Follows : " +Arrays.toString(Arr));
    }
}
