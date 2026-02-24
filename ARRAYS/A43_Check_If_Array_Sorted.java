import java.util.Scanner;
public class A43_Check_If_Array_Sorted
{
    public boolean CheckIfArraySorted (int[] Arr)
    {
        boolean isSorted = true;
        for(int i = 0; i < Arr.length - 1; i++)
        {
            if(Arr[i] <= Arr[i + 1])
            {
                isSorted = true;
            }
            else
            {
                isSorted = false;
                break;
            }
        }
        return isSorted;
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

        A43_Check_If_Array_Sorted CIAAS = new A43_Check_If_Array_Sorted();
        boolean result = CIAAS.CheckIfArraySorted(Arr);
        System.out.println("Is the Array Sorted? : " + result);
    }
}

