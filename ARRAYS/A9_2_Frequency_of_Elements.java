import java.util.Scanner;

public class A9_2_Frequency_of_Elements
{
    public void FrequencyOfElements(int[] arr)
    {
        boolean[] visited = new boolean[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            int count = 1;
            if(visited[i])
            {
                continue;
            }
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    count = count + 1;
                    visited[j] = true;
                }
            }
            System.out.println("The Element " +arr[i]+ " has Occured " +count+ " Times");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Frequency of the Elements in the Array : ");

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

        A9_2_Frequency_of_Elements FOE = new A9_2_Frequency_of_Elements();
        FOE.FrequencyOfElements(array);
    }
}
