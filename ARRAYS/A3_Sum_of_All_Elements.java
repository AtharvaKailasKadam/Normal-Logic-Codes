import java.util.Arrays;
import java.util.Scanner;

public class A3_Sum_of_All_Elements
{
    public void SumOfElements(int[] arr)
    {
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println("The Elements in the Array are : "+Arrays.toString(arr));
        System.out.println("The Sum of all the Elements in the Array is : " + sum);
    }

    public static void main(String args[])
    {
        System.out.println("Sum of Elements in the Array..!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the Array : ");
        int size = scanner.nextInt();

        System.out.println("Enter the Elements in the Array : ");
        int[] array = new int[size];
        for(int i = 0; i < size; i++)
        {
            array[i] = scanner.nextInt();
        }

        scanner.close();

        A3_Sum_of_All_Elements SOE = new A3_Sum_of_All_Elements();
        SOE.SumOfElements(array);
    }
}
