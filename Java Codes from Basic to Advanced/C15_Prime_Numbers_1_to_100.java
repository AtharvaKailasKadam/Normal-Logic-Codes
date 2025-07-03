class C15_Prime_Numbers_1_to_100
{
    public
    void Prime()
    {
        for(int i = 1; i <= 100; i++)
        {
            if((i % 2 != 0) && (i % 2 != 0) && (i % 3 != 0) && (i % 4 != 0) && (i % 5 != 0) && (i % 6 != 0) && (i % 7 != 0) && (i % 8 != 0) && (i % 9 != 0))
            {
                System.out.println("The Prime Number is : " + i);
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Prime Numbers Between 1 to 100 are as Follows : ");
        C15_Prime_Numbers_1_to_100 PN = new C15_Prime_Numbers_1_to_100();
        PN.Prime();
    }
}
// The Problem with the above logic is that ' it does not print the Prime Numbers that are below 10 '`