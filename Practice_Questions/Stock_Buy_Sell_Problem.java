package Practice_Questions;

import java.util.Scanner;
public class Stock_Buy_Sell_Problem
{
    public void StockBuySell(int[] Arr, int size)
    {
        int Buy = 0;
        int Sell = 0;
        int Profit = 0;

        for(int i = 0; i < size; i++)
        {
            int ProfitPrice = Arr[i] - Arr[Buy];
            if(ProfitPrice > Profit)
            {
                Profit = ProfitPrice;
                Sell = i;
            }
            if(Arr[i] < Arr[Buy])
            {
                Buy = i;
            }
        }
        System.out.println("Maximum Profit: " + Profit);
        System.out.println("Buy Index: " + Buy);
        System.out.println("Sell Index: " + Sell);
    }

    public static void main(String[] args)
    {
        System.out.println("Stock Buy Sell Problem..!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the Array: ");
        int size = scanner.nextInt();

        System.out.println("Enter the Elements in the Array: ");
        int[] Array = new int[size];

        for(int i = 0; i < size; i++)
        {
            Array[i] = scanner.nextInt();
        }
        scanner.close();

        Stock_Buy_Sell_Problem sbsp = new Stock_Buy_Sell_Problem();
        sbsp.StockBuySell(Array, size);
    }
}
// This Program is to be Revised...!