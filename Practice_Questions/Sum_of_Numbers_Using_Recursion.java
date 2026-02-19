package Practice_Questions;

import java.util.Scanner;
public class Sum_of_Numbers_Using_Recursion
{
    int sum (int n)
    {
        int sum = 0;
        if( n <= 0)
        {
            return 0;
        }
        else
        {
            sum = n + sum(n - 1);
        }
        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the Number of the Terms you want to Sum : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        Sum_of_Numbers_Using_Recursion obj = new Sum_of_Numbers_Using_Recursion();
        int sum = obj.sum(n);
        System.out.println("The Sum of the Numbers is : " + sum);
    }
}
