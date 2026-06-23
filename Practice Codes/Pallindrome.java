class Solution
{
    public int zigZagArrays(int n, int l, int r)
    {
        int MOD = 1000000007;
        int m = r - l + 1;

        long dpUp[][] = new long[n + 1][m];
        long dpDown[][] = new long[n + 1][m];

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(i < j)
                {
                    dpUp[2][j]++;
                }
                else if(i > j)
                {
                    dpDown[2][j]++;
                }
            }
        }

        for(int len = 3; len <= n; len++)
        {
            long prefix[] = new long[m];
            long suffix[] = new long[m];

            prefix[0] = dpDown[len - 1][0];

            for(int i = 1; i < m; i++)
            {
                prefix[i] = (prefix[i - 1] + dpDown[len - 1][i]) % MOD;
            }

            suffix[m - 1] = dpUp[len - 1][m - 1];

            for(int i = m - 2; i >= 0; i--)
            {
                suffix[i] = (suffix[i + 1] + dpUp[len - 1][i]) % MOD;
            }

            for(int i = 0; i < m; i++)
            {
                if(i - 1 >= 0)
                {
                    dpUp[len][i] = prefix[i - 1];
                }
                else
                {
                    dpUp[len][i] = 0;
                }

                if(i + 1 < m)
                {
                    dpDown[len][i] = suffix[i + 1];
                }
                else
                {
                    dpDown[len][i] = 0;
                }
            }
        }

        long ans = 0;

        if(n == 1)
        {
            return m;
        }

        for(int i = 0; i < m; i++)
        {
            ans = (ans + dpUp[n][i] + dpDown[n][i]) % MOD;
        }

        return (int)ans;
    }
}