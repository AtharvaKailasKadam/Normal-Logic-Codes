package Practice_Questions;

import java.util.Scanner;
public class Sort_0_1_2
{
    public void Sort012 (int[] Arr, int size)
    {
        int Count0 = 0;
        int Count1 = 0;
        int Count2 = 0;

        for(int i = 0; i < size; i++)
        {
            if(Arr[i] == 0)
            {
                Count0 = Count0 + 1;
            }
            else if (Arr[i] == 1)
            {
                Count1 = Count1 + 1;
            }
            else if (Arr[i] == 2)
            {
                Count2 = Count2 + 1;
            }
            else
            {
                System.out.println("Not Valid Element in the Array...!");
            }
        }
        for(int i = 0; i < Count0; i++)
        {
            Arr[i] = 0;
        }
        for(int i = Count0; i < Count0 + Count1; i++)
        {
            Arr[i] = 1;
        }
        for(int i = Count1; i < Count0 + Count1 + Count2; i++)
        {
            Arr[i] = 2;
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Sorting 0's, 1's and 2's in an Array...!");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the Array : ");
        int size = sc.nextInt();

        int[] Arr = new int[size];
        for(int i = 0; i < size; i++)
        {
            Arr[i] = sc.nextInt();
        }
        sc.close();

        Sort_0_1_2 srt012 = new Sort_0_1_2();
        srt012.Sort012(Arr, size);
    }
}
