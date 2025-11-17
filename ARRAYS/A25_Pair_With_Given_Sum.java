public class A25_Pair_With_Given_Sum
{
    public void PairWithGivenSum(int[] Array, int Len, int TargetSum)
    {
        boolean isPair = false;
        for(int i = 0; i < Len - 1; i++)
        {
            for(int j = i + 1; j < Len; j++)
            {
                if(Array[i] + Array[j] == TargetSum)
                {
                    System.out.println("Pair Found : " +Array[i]+ ", " +Array[j]);
                    isPair = true;
                }
            }
        }
        if(!isPair)
        {
            System.out.println("No Pair Found with the Target Sum : " +TargetSum);
        }

    }

    public static void main(String[] args)
    {
        System.out.println("Pair With Given Sum in Array....!");

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter the Size of the Array : ");
        int size = scanner.nextInt();
        System.out.println("Enter the Values in the Array : ");
        int[] Array = new int[size];
        for(int i = 0; i < size; i++)
        {
            Array[i] = scanner.nextInt();
        }

        System.out.println("Enter the Target Sum : ");
        int targetSum = scanner.nextInt();

        scanner.close();

        System.out.println("The Elements in the Array are : " +java.util.Arrays.toString(Array));

        A25_Pair_With_Given_Sum PWGS = new A25_Pair_With_Given_Sum();
        PWGS.PairWithGivenSum(Array, size, targetSum);
    }
}
