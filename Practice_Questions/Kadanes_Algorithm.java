package Practice_Questions;

import java.util.Scanner;

public class Kadanes_Algorithm
{
    public void KadanesAlgorithm(int[] Arr, int size)
    {
        int MaxSum = Integer.MIN_VALUE;
        int CurrentSum = 0;
        int Start = 0;
        int End = 0;

        for(int i = 0; i < size; i++)
        {
            if(CurrentSum == 0)
            {
                Start = i;
            }
            CurrentSum = CurrentSum + Arr[i];

            if(CurrentSum > MaxSum)
            {
                MaxSum = CurrentSum;
                End = i;
            }
            if(CurrentSum < 0)
            {
                CurrentSum = 0;
            }
        }
        System.out.println("Maximum Sum: " + MaxSum);
        System.out.println("Start Index: " + Start);
        System.out.println("End Index: " + End);
    }

    public static void main(String[] args)
    {
        System.out.println("Kadane's Algorithm for Maximum Subarray..!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the Array: ");
        int size = scanner.nextInt();

        System.out.println("Enter the Elements in the Array: ");
        int[] Array = new int[size];

        for(int i = 0; i < size; i++)
        {
            Array[i] = scanner.nextInt();
        }
        scanner.close();

        Kadanes_Algorithm kdnalg = new Kadanes_Algorithm();
        kdnalg.KadanesAlgorithm(Array, size);
    }
}
