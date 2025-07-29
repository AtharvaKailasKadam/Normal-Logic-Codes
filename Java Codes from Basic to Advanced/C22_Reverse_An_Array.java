import java.util.Arrays;
import java.util.Scanner;

public class C22_Reverse_An_Array
{
    public void Reverse_Array(int arr[])
    {
        int[] NumArr = arr.clone();
        System.out.println("The Original Array is : " + Arrays.toString(arr));

        for(int i = 0; i < NumArr.length / 2; i++)
        {
            int temp;
            temp = NumArr[i];
            NumArr[i] = NumArr[NumArr.length-1-i];
            NumArr[NumArr.length-1-i] = temp;
        }
        System.out.println("The Reversed Array is : " + Arrays.toString(NumArr));
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of the Array : ");
        int size = scanner.nextInt();

        System.out.println("Enter the Elements in the Array : ");
        int[] num = new int[size];
        for(int i = 0; i < size; i++)
        {
            num[i] = scanner.nextInt();
        }
        scanner.close();

        C22_Reverse_An_Array RaN = new C22_Reverse_An_Array();
        RaN.Reverse_Array(num);
    }
}
// This Method was New to me and thus Took Time to Implement.
// Obviously My Fault.
// But... Done and Dusted..!