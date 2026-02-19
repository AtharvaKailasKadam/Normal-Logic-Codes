package HASHING;

import java.util.Scanner;

public class Int_Hashing_Code_1
{
    int Hashing (int[] Arr )
    {
        int HashTable[] = new int[13];
        for(int i = 0; i < Arr.length; i++){
            HashTable[Arr[i]] += 1;
        }

        for(int i = 0; i < HashTable.length; i++)
        {
            System.out.println("The Number of Elements " + i + " is : " + HashTable[i]);
        }
        return 0;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Hash Table : ");
        int size = sc.nextInt();

        int[] Arr = new int[size];
        for(int i = 0; i < size; i++)
        {
            System.out.println("Enter the Element to be Inserted in the Hash Table : ");
            Arr[i] = sc.nextInt();
        }
        sc.close();

        Int_Hashing_Code_1 HC1 = new Int_Hashing_Code_1();
        HC1.Hashing(Arr);
    }
}
