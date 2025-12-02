public class A40_Maximum_Circular_Subarray_Sum
{
    public int maxSubarraySumCircular(int[] nums)
    {
        int totalSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int currentMax = 0;
        int minSum = Integer.MAX_VALUE;
        int currentMin = 0;

        for (int num : nums)
        {
            totalSum += num;

            currentMax = Math.max(num, currentMax + num);
            maxSum = Math.max(maxSum, currentMax);

            currentMin = Math.min(num, currentMin + num);
            minSum = Math.min(minSum, currentMin);
        }

        if (maxSum < 0)
        {
            return maxSum;
        }

        return Math.max(maxSum, totalSum - minSum);
    }
}