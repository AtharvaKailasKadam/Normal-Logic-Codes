package HASHING;

// For Character Hashing, we will be using the ASCII values of the characters to determine their position in the hash table.
// Only lowercase characters are considered.

import java.util.Scanner;
public class Char_Hashing_Code_2
{
    int HashingChar (char[] Arr)
    {
        int HashTable[] = new int[26];

        for(int i = 0; i < Arr.length; i++)
        {
            HashTable[Arr[i] - 'a'] += 1;
        }

        for(int i = 0; i < HashTable.length; i++)
        {
            System.out.println("The Number of Elements " + (char)(i + 'a') + " is : " + HashTable[i]);
        }
        return 0;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Character Array : ");
        int size = sc.nextInt();

        char[] Arr = new char[size];
        for(int i = 0; i < size; i++)
        {
            System.out.println("Enter the Element to be Inserted in the Hash Table : ");
            Arr[i] = sc.next().charAt(0);
        }
        sc.close();

        Char_Hashing_Code_2 CHC2 = new Char_Hashing_Code_2();
        CHC2.HashingChar(Arr);
    }
}