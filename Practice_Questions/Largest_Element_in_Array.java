package Practice_Questions;
import java.util.Scanner;

public class Largest_Element_in_Array
{
    int LargestElement(int[] Arr)
    {
        int Largest = 0;
        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] > Largest)
            {
                Largest = Arr[i];
            }
        }
        System.out.println("The Largest Element in the Array is : " + Largest);
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array : ");
        int size = sc.nextInt();

        int Arr[] = new int[size];
        for(int i = 0; i < size; i++)
        {
            System.out.println("Enter the Element to be Inserted in the Array : ");
            Arr[i] = sc.nextInt();
        }

        sc.close();

        Largest_Element_in_Array LEA = new Largest_Element_in_Array();
        int Largest = LEA.LargestElement(Arr);
    }
}