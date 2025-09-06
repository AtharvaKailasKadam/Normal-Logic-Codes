import java.util.HashMap;
import java.util.Scanner;

public class A9_1_Frequency_of_Elements
{
    public void FrequencyOfElements(int[] arr)
    {
        HashMap<Integer, Integer> freqmap = new HashMap<>();

        for(int num : arr)
        {
            if(freqmap.containsKey(num))
            {
                freqmap.put(num, freqmap.get(num) + 1);
            }
            else
            {
                freqmap.put(num, 1);
            }
        }
        for(int key : freqmap.keySet())
        {
            System.out.println(key + " Occurs " +freqmap.get(key)+ " Times ");
        }

    }

    public static void main(String args[])
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

        A9_1_Frequency_of_Elements FOE = new A9_1_Frequency_of_Elements();
        FOE.FrequencyOfElements(array);
    }
}