import java.util.Scanner;
public class A14_Duplicate_Elements_In_Array
{
    public void DuplicateElements(int[] arr)
    {
        boolean foundDuplicate = false;
        int len = arr.length;
        int count = 1;

        for(int i = 0; i < len; i++)
        {
            for(int j = i + 1; j < len; j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                    System.out.println("Duplicate Element Found: " + arr[i] + " | Count: " + count);
                    foundDuplicate = true;
                }
            }
        }
        if(!foundDuplicate)
        {
            System.out.println("No Duplicate Elements Found in the Array.");
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Duplicate Values in The Array....!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the Array :");
        int n = scanner.nextInt();

        System.out.println("Enter the Elements in the Array :");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        A14_Duplicate_Elements_In_Array DEIA = new A14_Duplicate_Elements_In_Array();
        DEIA.DuplicateElements(arr);

    }
}
