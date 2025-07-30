import java.util.Arrays;
import java.util.Scanner;

public class C23_Sum_of_Elements_in_Array
{
    public void Sum_of_Array_Elements(int arr[])
    {
        int sum = 0;

        for(int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println("The Sum of All the Elements from the Array is : "+sum);
    }

    public static void main(String args[])
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of the Array : ");
        int size = scanner.nextInt();

        int[] NumArr = new int[size];
        System.out.println("Enter the Elements in the Array");
        for(int i = 0; i < size; i++)
        {
            NumArr[i] = scanner.nextInt();
        }
        System.out.println("The Elements in the Array are : " +Arrays.toString(NumArr));
        scanner.close();

        C23_Sum_of_Elements_in_Array SEA = new C23_Sum_of_Elements_in_Array();
        SEA.Sum_of_Array_Elements(NumArr);
    }
}

