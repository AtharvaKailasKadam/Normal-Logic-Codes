import java.util.Scanner;

class C21_Max_and_Min_in_Array
{
    public void Array(int a[])
    {
        int Max = a[0];
        int Min = a[0];
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] > Max)
            {
                Max = a[i];
            }
            if(a[i] < Min)
            {
                Min = a[i];
            }
        }
        System.out.println("The Maximum Number in the Array is : "+ Max);
        System.out.println("The Minimum Number in the Array is : "+ Min);
    }

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Size of the Array : ");
        int size = scanner.nextInt();

        int[] arr = new int[size];


        System.out.println("Enter the Numbers(Elements) of the Array : ");
        for(int i = 0; i < size; i++)
        {
        arr[i] = scanner.nextInt();
        }

        scanner.close();

        C21_Max_and_Min_in_Array obj = new C21_Max_and_Min_in_Array();
        obj.Array(arr);
    }
}

// Not able to take or accept values of array from the USER.