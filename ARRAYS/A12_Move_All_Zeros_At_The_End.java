import java.util.Arrays;
import java.util.Scanner;

public class A12_Move_All_Zeros_At_The_End
{
    public void MoveAllZerosAtTheEnd(int [] arr)
    {
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] != 0)
            {
                arr[count] = arr[i];
                count++;
            }
        }
        while(count < n)
        {
            arr[count] = 0;
            count++;
        }
        System.out.println("The Elements in the Array After Moving the Elements at the End : "+Arrays.toString(arr));
    }
    public static void main(String args[])
    {
        System.out.println("Move All Zeros At The End : ");

        System.out.println("Enter the Size of the Array : ");

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        System.out.println("Enter the Elements in the Array : ");
        int [] arr = new int [size];
        for(int i = 0; i < size; i++)
        {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        A12_Move_All_Zeros_At_The_End obj = new A12_Move_All_Zeros_At_The_End();
        obj.MoveAllZerosAtTheEnd(arr);
    }
}
