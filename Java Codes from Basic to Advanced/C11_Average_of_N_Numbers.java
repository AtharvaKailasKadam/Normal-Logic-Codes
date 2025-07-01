// The Program Contains the Hardcore Values of the Numbers i.e. 'N' Numbers.
// The Program then Calculates the Average of the Numbers and Prints it on the Output Screen.
public class C11_Average_of_N_Numbers
{
    public void Average(int a, int b, int c, int d, int e)
    {
        float result;
        result = ( a + b + c + d + e)/5;
        System.out.println("The Average of 'N' Numbers are : "+ result);
    }

    public static void main(String args[])
    {
        C11_Average_of_N_Numbers AnN = new C11_Average_of_N_Numbers();
        AnN.Average(11, 22, 33,44, 55);
    }
}
