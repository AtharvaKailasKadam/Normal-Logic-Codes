import java.util.Scanner;
public class A11_Rotate_Array_By_k_Positions {
    public void RotateArrayByKPosition(int[] arr, int k)
    {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        System.out.println("Array after rotating by " + k + " positions : ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public void reverse(int[] arr, int start, int end)
    {
        while(start < end)
        {
            int temp = arr[start];
            arr[start] =  arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Rotate the Array by k Positions : ");

        System.out.println("Enter the Size of the Array : ");

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the Elements in the Array : ");
        for(int i = 0; i < size; i++)
        {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter the Value of 'k' : ");
        int k = scanner.nextInt();

        scanner.close();
        A11_Rotate_Array_By_k_Positions obj = new A11_Rotate_Array_By_k_Positions();
        obj.RotateArrayByKPosition(arr, k);
    }
}
