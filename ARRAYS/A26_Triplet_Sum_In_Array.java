import java.util.Arrays;
import java.util.Scanner;

public class A26_Triplet_Sum_In_Array
{
    public void TripletSumInArray(int[] Array, int Len, int TargetSum)
    {
        boolean isTriplet = false;
        for(int i = 0; i < Len - 2; i++)
        {
            for(int j = i + 1; j < Len - 1; j++)
            {
                for(int k = j + 1; k < Len; k++)
                {
                    if(Array[i] + Array[j] + Array[k] == TargetSum)
                    {
                        System.out.println("Triplet Found : " +Array[i]+ ", " +Array[j]+ ", " +Array[k]);
                        isTriplet = true;
                    }
                }
            }
        }
        if(!isTriplet)
        {
            System.out.println("No Triplet Found with the Target Sum : " +TargetSum);
        }

    }

    public static void main(String[] args)
    {
        System.out.println("Triplet Sum In Array....!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the Array : ");
        int size = scanner.nextInt();
        System.out.println("Enter the Values in the Array : ");
        int[] Array = new int[size];
        for(int i = 0; i < size; i++)
        {
            Array[i] = scanner.nextInt();
        }

        System.out.println("Enter the Target Sum : ");
        int targetSum = scanner.nextInt();

        scanner.close();

        System.out.println("The Elements in the Array are : " +Arrays.toString(Array));

        A26_Triplet_Sum_In_Array TSIA = new A26_Triplet_Sum_In_Array();
        TSIA.TripletSumInArray(Array, size, targetSum);
    }
}
