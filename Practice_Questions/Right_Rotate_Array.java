package Practice_Questions;

public class Right_Rotate_Array
{
    public int RightRotateByKPlaces(int[] Arr, int k)

    {
        int n = Arr.length;
        k  = k % n;

        reverse(Arr, 0 , n-1);
        reverse(Arr, 0, k-1);
        reverse(Arr, k, n-1);

        return 0;
    }

    public void reverse(int[] Arr, int start, int end)
    {
        while (start < end)
        {
            int temp = Arr[start];
            Arr[start] = Arr[end];
            Arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Right Rotate Array By K Places....!");

        int[] Arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("The Elements in the Array Before Right Rotation : ");
        for(int i : Arr)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        Right_Rotate_Array obj = new Right_Rotate_Array();
        obj.RightRotateByKPlaces(Arr, k);

        System.out.println("The Elements in the Array After Right Rotation : ");
        for(int i : Arr)
        {
            System.out.print(i + " ");
        }
    }
}
