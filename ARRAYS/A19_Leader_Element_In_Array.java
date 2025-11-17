import java.util.Scanner;

public class A19_Leader_Element_In_Array
{
    public void LeaderElementInArray(int[] Array, int Len)
    {
        

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

        A19_Leader_Element_In_Array LEIA = new A19_Leader_Element_In_Array();
        LEIA.LeaderElementInArray(Array, n);
    }
}