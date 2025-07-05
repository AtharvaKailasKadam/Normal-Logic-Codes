import java.util.Scanner;

class C21_Max_and_Min_in_Array
{
    public void Array(int a[])
    {
        int Max;
        int Min;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i+1] > a[i])
            {
                Max = a[i+1];
                System.out.println("The Maximum Number in the Array is : "+ Max);
            }
            else if(a[i+1]<a[1])
            {
                Min = a[i+1];
                System.out.println("The Minimum Number in the Array is : "+ Min);
            }
        }
    }

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Size of the Array : ");
        int size = scanner.nextInt();

        System.out.println("Enter the Numbers(Elements) of the Array : ");
        for(int i = 0; i < size; i++)
        {
            i = scanner.nextInt();
        }

        scanner.close();
    }
}

// Not able to take or accept values of array from the USER.