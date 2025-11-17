import java.util.Scanner;
import java.util.Arrays;

public class A20_Majority_Element_In_Array
{
    public void MajorityElementInArray(int[] Array, int Len)
    {
        boolean isMajority;
        int halfLength = Len / 2;
        for(int i = 0; i < Len; i++)
        {
            int count = 1;
            isMajority = true;
            for(int j = i + 1; j < Len; j++)
            {
                if(Array[i] == Array[j])
                {
                    count++;
                    if(count > halfLength)
                    {
                        System.out.println("Majority Element is : " +Array[i]);
                        isMajority = false;
                        break;
                    }
                }
            }
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Majority Element in Array....!");

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

        System.out.println("The Elements in the Array are : " +Arrays.toString(Array));

        A20_Majority_Element_In_Array MEIA = new A20_Majority_Element_In_Array();
        MEIA.MajorityElementInArray(Array, n);
    }
}
