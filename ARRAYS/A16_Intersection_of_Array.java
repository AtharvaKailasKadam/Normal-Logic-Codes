import java.util.Arrays;
import java.util.Scanner;

public class A16_Intersection_of_Array
{
    public void ArrayIntersection(int[] Array1, int[] Array2, int Len1, int Len2)
    {
        int Len3 = 0;
        // Learnt Something New.
        int[] Array3 = new int[Math.min(Len1, Len2)];

        for(int i = 0; i < Len1; i++)
        {
            for(int j = 0; j < Len2; j++)
            {
                if(Array1[i] == Array2[j])
                {
                    Array3[Len3] = Array1[i];
                    Len3++;
                    break;
                }
            }
        }
        // Way to Trim the Array.
        int[] result = Arrays.copyOf(Array3, Len3);
        System.out.println("The Intersection of the Two Arrays is : "+Arrays.toString(result));
    }

    public static void main(String args[])
    {
        System.out.println("Intersection Values of two Arrays...!");


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of First Array : ");
        int n1 = scanner.nextInt();
        System.out.println("Enter the Values of the First Array : ");
        int[] Array1 = new int[n1];
        for(int i = 0; i < n1; i++)
        {
            Array1[i] = scanner.nextInt();
        }

        System.out.println("Enter the Size of the Second Array : ");
        int n2 = scanner.nextInt();
        System.out.println("Enter the Values in the Second Array : ");
        int[] Array2 = new int[n2];
        for(int i = 0; i < n2; i++)
        {
            Array2[i] = scanner.nextInt();
        }

        scanner.close();

        A16_Intersection_of_Array IOA = new A16_Intersection_of_Array();
        IOA.ArrayIntersection(Array1, Array2, n1, n2);

    }
}