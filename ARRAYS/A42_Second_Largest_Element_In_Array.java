import java.util.Scanner;
public class A42_Second_Largest_Element_In_Array
{
    int SecondLargestElement (int[] Arr)
    {
        int Largest = 0;
        int SecondLargest = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] > Largest)
            {
                SecondLargest = Largest;
                Largest = Arr[i];
            }
            else if(Arr[i] > SecondLargest && Arr[i] != Largest)
            {
                SecondLargest = Arr[i];
            }
        }
        return SecondLargest;
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

        A42_Second_Largest_Element_In_Array SLEA = new A42_Second_Largest_Element_In_Array();
        int result = SLEA.SecondLargestElement(Arr);
        System.out.println("The Second Largest Element in the Array is : "+result);
    }
}
