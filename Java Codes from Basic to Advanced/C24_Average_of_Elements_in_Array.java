import java.util.Arrays;
import java.util.Scanner;

public class C24_Average_of_Elements_in_Array
{
    public void Average_of_Elements(int[] arr)
    {
        float sum = 0;
        float average = 0;
        System.out.println("The Array Elements are : "+Arrays.toString(arr));


        for(int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
        }
        average = sum / arr.length;

        System.out.println("The Average of the Elements are : "+average);
    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of the Array : ");
        int size = scanner.nextInt();

        int[] Array = new int[size];
        System.out.println("Enter the Elements in teh Array : ");

        for(int i = 0; i < size; i++)
        {
            Array[i] = scanner.nextInt();
        }
        scanner.close();

        C24_Average_of_Elements_in_Array AoE = new C24_Average_of_Elements_in_Array();
        AoE.Average_of_Elements(Array);
    }
}