import java.util.Arrays;
import java.util.Scanner;

public class A4_Average_of_Elements_in_Array
{
    public void AverageOfElements(int[] arr)
    {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            count = count + 1;
            sum = sum + arr[i];
        }
        float average = sum / count;
        System.out.println("The Elements in the Array are : "+Arrays.toString(arr));
        System.out.println("The Count of Elements are : "+ count);
        System.out.println("The Sum of The Elements in the Array is : "+sum);
        System.out.println("The Average of the Elements in the Array is : "+average);
    }

    public static void main(String args[])
    {
        System.out.println("Average of Elements of the Array : ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the Array :");
        int size = scanner.nextInt();

        System.out.println("Enter the Elements in the Array : ");
        int[] array = new int[size];
        for(int i = 0; i < size; i++)
        {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        A4_Average_of_Elements_in_Array AOE = new A4_Average_of_Elements_in_Array();
        AOE.AverageOfElements(array);
    }
}

