import java.util.Arrays;
import java.util.Scanner;

public class A2_Reverse_an_Array
{
    public void ReverseAnArray(int[] array1)
    {
        System.out.println("The Original array is : "+Arrays.toString(array1));
        for(int i = 0; i < array1.length / 2; i++)
        {
            int temp = array1[i];
            array1[i] = array1[array1.length - 1 - i];
            array1[array1.length - 1 - i] = temp;
        }
        System.out.println("The Array after Reversing : " +Arrays.toString(array1));
    }

    public static void main(String[] args)
    {
        System.out.println("Reverse the Array");

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

        A2_Reverse_an_Array RAN = new A2_Reverse_an_Array();
        RAN.ReverseAnArray(array);
    }
}
