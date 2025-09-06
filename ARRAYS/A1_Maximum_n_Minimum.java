import java.util.Scanner;
public class A1_Maximum_n_Minimum
{
    public void Maximum_n_Minimum(int [] array)
    {
        int Max = array[0];
        int Min = array[0];

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] > Max)
            {
                Max = array[i];
            }
            if(array[i] < Min)
            {
                Min = array[i];
            }
        }
        System.out.println("The Maximum Number in the Array is : "+ Max);
        System.out.println("The Minimum Number in the Array is : "+ Min);
    }


    public static void main(String[] args)
    {
        System.out.println("Maximum n Minimum of an Array!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the Array : ");
        int size = scanner.nextInt();
        System.out.println("Enter the Elements in the Array : ");
        int[] array = new int[size];

        for(int i = 0; i < size; i++)
        {
            array[i] = scanner.nextInt();
        }

        scanner.close();

        A1_Maximum_n_Minimum obj = new A1_Maximum_n_Minimum();
        obj.Maximum_n_Minimum(array);

    }
}
