public class Largest_Substring
{

    public String LargestSubstring(String[] str)
    {
        String Prefix = str[0];
        for(int i = 0; i < str.length; i++)
        {
            while(str[i].indexOf(Prefix) != 0)
            {
                Prefix = Prefix.substring(0, Prefix.length() - 1);
            }
        }
        System.out.println("The Longest Common Prefix is : " +Prefix);
        return Prefix;
    }

    public static void main(String args[])
    {
        String string[] = {"Flower", "Flow", "Flight"};

        Largest_Substring LS = new Largest_Substring();
        LS.LargestSubstring(string);
    }
}
