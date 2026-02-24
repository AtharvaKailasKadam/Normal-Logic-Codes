import java.util.Scanner;

public class A41_Second_Smallest_Element_In_Array
{
    public int SecondSmallestElement (int[] Arr)
    {
        int Smallest = Integer.MAX_VALUE;
        int SecondSmallest = Integer.MAX_VALUE;

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] < Smallest)
            {
                SecondSmallest = Smallest;
                Smallest = Arr[i];
            }
            else if(Arr[i] < SecondSmallest && Arr[i] != Smallest)
            {
                SecondSmallest = Arr[i];
            }
        }
        return SecondSmallest;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the Array : ");
        int size = scanner.nextInt();

        int[] Arr = new int[size];
        for(int i = 0; i < size; i++)
        {
            System.out.print("Enter the Elements in the Array ["+i+"] : ");
            Arr[i] = scanner.nextInt();
        }

        scanner.close();

        A41_Second_Smallest_Element_In_Array SSEA = new A41_Second_Smallest_Element_In_Array();
        int result = SSEA.SecondSmallestElement(Arr);
        System.out.println("The Second Smallest Element in the Array is : "+result);
    }
}
