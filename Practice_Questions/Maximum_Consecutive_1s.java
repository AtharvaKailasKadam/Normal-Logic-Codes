package Practice_Questions;

import java.util.Scanner;

public class Maximum_Consecutive_1s
{
    public int MaximumConsecutive1s(int[] Arr)
    {
        int maxCount = 0;
        int count =0;

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == 1)
            {
                count++;
            }
            else
            {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the Array : ");
        int size = scanner.nextInt();

        int[] Arr = new int[size];
        for(int i = 0; i < size; i++)
        {
            Arr[i] = scanner.nextInt();
        }

        scanner.close();
        Maximum_Consecutive_1s MC1s = new Maximum_Consecutive_1s();
        MC1s.MaximumConsecutive1s(Arr);


    }
}
