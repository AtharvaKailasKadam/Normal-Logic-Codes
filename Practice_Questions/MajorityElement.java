package Practice_Questions;

import java.util.Scanner;

public class MajorityElement
{
    public void Majorityelement(int Array[], int size)
    {
        int Element = Array[0];
        int Count = 1;

        for(int i = 1; i < size; i++)
        {
            if(Array[i] == Element)
            {
                Count++;
            }
            else
            {
                Count--;
            }

            if(Count == 0)
            {
                Element = Array[i];
                Count = 1;
            }
        }

        int Count1 = 0;
        for(int i = 0; i < size; i++)
        {
            if(Array[i] == Element)
            {
                Count1++;
            }
        }

        if(Count1 > (size / 2))
        {
            System.out.println("Majority Element is : " + Element);
        }
        else
        {
            System.out.println("No Majority Element");
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] Array = new int[size];

        for(int i = 0; i < size; i++)
        {
            Array[i] = scanner.nextInt();
        }

        MajorityElement obj = new MajorityElement();
        obj.Majorityelement(Array, size);

        scanner.close();
    }
}