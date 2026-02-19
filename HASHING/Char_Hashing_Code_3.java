package HASHING;
// For Character Hashing, we will be using the ASCII values of the characters to determine their position in the hash table.
// Only uppercase characters are considered.
import java.util.Scanner;
public class Char_Hashing_Code_3
{
    int HashingCharA (char[] Arr)
    {
        int HashTable[] = new int[26];

        for(int i = 0; i < Arr.length; i++)
        {
            HashTable[Arr[i] - 'A'] += 1;
        }

        for(int i = 0; i < HashTable.length; i++)
        {
            System.out.println("The Number of Elements " + (char)(i + 'A') + " is : " + HashTable[i]);
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
            Arr[i] = sc.next().charAt(0);
        }

        sc.close();

        Char_Hashing_Code_3 CHC3 = new Char_Hashing_Code_3();
        CHC3.HashingCharA(Arr);
    }
}
