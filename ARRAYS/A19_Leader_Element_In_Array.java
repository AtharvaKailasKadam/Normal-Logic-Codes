import java.util.Arrays;
import java.util.Scanner;

public class A19_Leader_Element_In_Array
{
    public void LeaderElementInArray(int[] Array, int Len)
    {
        boolean isLeader;
        for(int i = 0; i < Len; i++)
        {
            isLeader = true;
            for(int j = i + 1; j < Len; j++)
            {
                if(Array[j] > Array[i])
                {
                    isLeader = false;
                    break;
                }
            }
            if(isLeader)
            {
                System.out.print("The Leader Element in the Array is : " +Array[i] + " \n");
            }
        }

    }

    public static void main(String[] args)
    {
        System.out.println("Leader Element in Array....!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the Array : ");
        int n = scanner.nextInt();
        System.out.println("Enter the Values in the Array : ");
        int[] Array = new int[n];
        for(int i = 0; i < n; i++)
        {
            Array[i] = scanner.nextInt();
        }

        scanner.close();

        System.out.println("The Leader Elements in the Array are : " +Arrays.toString(Array));

        A19_Leader_Element_In_Array LEIA = new A19_Leader_Element_In_Array();
        LEIA.LeaderElementInArray(Array, n);
    }
}