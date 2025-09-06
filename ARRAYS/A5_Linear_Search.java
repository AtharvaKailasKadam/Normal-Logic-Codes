import java.util.Scanner;

public class A5_Linear_Search
{
    public void LinearSearch(int[] arr, int key)
    {
        boolean flag = false;
        int index = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(key == arr[i])
            {
                flag = true;
                index = i;
                break;
            }
        }
        if(flag = true)
        {
            System.out.println("Element Found...!");
            System.out.println("At Index : "+index);
        }
        else
        {
            System.out.println("Element Not Found...!");
        }
        System.out.println("Done...!");

    }
    public static void main(String args[])
    {
        System.out.println("Linear Search in Array...!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the Array");
        int size = scanner.nextInt();

        System.out.println("Enter the Elements in the Array : ");
        int[] array = new int[size];
        for(int i = 0; i < size; i++)
        {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the Element to be Searched : ");
        int key = scanner.nextInt();

        scanner.close();

        A5_Linear_Search AS = new A5_Linear_Search();
        AS.LinearSearch(array, key);

    }
}
