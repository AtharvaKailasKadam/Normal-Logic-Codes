import java.util.Scanner;

class C5_Product_and_Quotient_of_Two_Numbers
{
    public void Product(float Num1, float Num2)
    {
        float product = Num1 * Num2;
        System.out.println("The Product of " + Num1 + " and " + Num2 + " is " + product);
    }

    public void Quotient(float Num1, float Num2)
    {
        if(Num1<Num2)
        {
            System.out.println("ERROR...! The First Number is Smaller than the Second Number");
            System.out.println("First Number should be Greater");
            System.out.println("Enter Valid Data");
        }
        else if(Num2 == 0 || Num1 == 0)
        {
            System.out.println("ERROR...! Division by Zero is not allowed");
            System.out.println("Enter Valid Data");
        }
        else
        {
            float quotient = Num1 / Num2;
            System.out.println("The Quotient of " + Num1 + " and " + Num2 + " is " + quotient);
        }
    }
public static void main(String[] args)
    {

        // Taking Input from the user in the 'Main()' method.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 1st Number : ");
        float Num1 = scanner.nextFloat();

        System.out.println("Enter the 2nd Number : ");
        float Num2 = scanner.nextFloat();

        System.out.println("The Two Numbers are " + Num1 + " and " + Num2);
        System.out.println("");
        scanner.close();

        C5_Product_and_Quotient_of_Two_Numbers PQ = new C5_Product_and_Quotient_of_Two_Numbers();
        PQ.Product(Num1, Num2);
        PQ.Quotient(Num1, Num2);
    }
}
