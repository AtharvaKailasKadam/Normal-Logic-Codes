public class A29_Longest_Consecutive_SubSequence
{
    public int longestConsecutive(int[] nums)
    {
        java.util.Set<Integer> numSet = new java.util.HashSet<>();
        for (int num : nums)
        {
            numSet.add(num);
        }

        int longestStreak = 0;

        for (int num : numSet)
        {
            if (!numSet.contains(num - 1))
            {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1))
                {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args)
    {
        System.out.println("Longest Consecutive Subsequence...!");

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter the Size of the Array : ");
        int size = scanner.nextInt();
        System.out.println("Enter the Values in the Array : ");
        int[] Array = new int[size];
        for (int i = 0; i < size; i++)
        {
            Array[i] = scanner.nextInt();
        }

        scanner.close();

        A29_Longest_Consecutive_SubSequence LCS = new A29_Longest_Consecutive_SubSequence();
        int result = LCS.longestConsecutive(Array);
        System.out.println("The Length of the Longest Consecutive Subsequence is : " + result);
    }
}