import java.util.Scanner;
public class A13_Missing_Numbers_In_Array
{
    public void MissingNumbers(int[] arr)
    {
        int len = arr.length;

        int max = arr[0];
        for(int i = 1; i < len; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        boolean[] present = new boolean[max + 1];
        for(int i = 0; i < len ; i++)
        {
            if(arr[i] > 0 && arr[i] <= max)
            {
                present[arr[i]] = true;
            }
        }

        System.out.println("The Missing Numbers In The Array Are: ");
        for(int i = 1; i <= max; i++)
        {
            if(!present[i])
            {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nThe Array with all Numbers From 1 to " + max + " Is: ");
        for(int i = 1; i <= max; i++)
        {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Missing Values In The Array...!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        A13_Missing_Numbers_In_Array MNIA = new A13_Missing_Numbers_In_Array();
        MNIA.MissingNumbers(arr);
    }
}
