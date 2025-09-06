import java.util.Arrays;
import java.util.Scanner;

public class A8_Even_and_Odd_Numbers
{
    public void EvenAndOdd(int[] arr)
    {
        int count1 = 0;
        int count2 = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                count1++;
            }
            else if(arr[i] % 2 != 0)
            {
                count2++;
            }
            else
            {
                System.out.println("Element Not in INT Format..!");
            }
        }
        System.out.println("The Elements in the Array are : "+Arrays.toString(arr));
        System.out.println("Total Number of Even Numbers are : " +count1);
        System.out.println("Total Number of Odd Numbers are : "+count2);
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

        A8_Even_and_Odd_Numbers EAO = new A8_Even_and_Odd_Numbers();
        EAO.EvenAndOdd(array);
    }
}
