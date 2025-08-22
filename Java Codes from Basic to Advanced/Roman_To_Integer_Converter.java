import java.util.HashMap;

public class Roman_To_Integer_Converter
{
    public void RomanToInteger(String s)
    {

        HashMap<Character, Integer> RomanMap = new HashMap();
        RomanMap.put('I', 1);
        RomanMap.put('V', 5);
        RomanMap.put('X', 10);
        RomanMap.put('L', 50);
        RomanMap.put('C', 100);
        RomanMap.put('D', 500);
        RomanMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if(i <= s.length())
            {
                int currentValue = RomanMap.get(s.charAt(i));

                if(currentValue > prevValue)
                {
                    total = total + currentValue - 2*prevValue;
                }
                else
                {
                    total = total + currentValue;
                }
                currentValue = prevValue;
            }
        }
        System.out.println("Roman = " + s + " + Integer = " + total);
    }

    public static void main(String[] args)
    {

        System.out.println("Roman to Integer Converter");

        String RomanNumber1 = "III";
        String RomanNumber2 = "IV";
        String RomanNumber3 = "IX";
        String RomanNumber4 = "LVIII";
        String RomanNumber5 = "MCMXCIV";

        Roman_To_Integer_Converter obj = new Roman_To_Integer_Converter();
        obj.RomanToInteger(RomanNumber1);
        obj.RomanToInteger(RomanNumber2);
        obj.RomanToInteger(RomanNumber3);
        obj.RomanToInteger(RomanNumber4);
        obj.RomanToInteger(RomanNumber5);
    }
}
