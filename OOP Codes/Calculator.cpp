#include <iostream>
using namespace std;
// This is a simple calculator program that performs basic arithmetic operations
// like addition, subtraction, multiplication, and division.
// It includes error handling for invalid operations such as division by zero, but without using exceptions.
// The program is designed to be simple and straightforward, focusing on the core functionality of a calculator.

// This Code is Implemented in C++ using the Concept of Classes and Objects.
// The Calculator class contains methods for each arithmetic operation.

//Class Definition

class Calculator
{
    public:

// Methods for Arithmetic Operations

    void add( int a, int b )
    {
        cout << "Adding of the Two Numbers is :"<< endl;
        float result = a + b;
    }
    void subtract( int a, int b )
    {
        if(a < b)
        {
            cout << " ERROR: The Number to be subtracted should be less then the other number." <<endl;
            return;
        }
        else if(a == b)
        {
            cout << " ERROR: The Numbers are equal. Subtraction is not possible." <<endl;
            return;
        }
        else
        {
            cout << "Subtraction of the Two Numbers is : "<< endl;
            float result = a - b;
        }
    }
    void Multiply( int a, int b)
    {
        cout << "Multiplication of the Two Numbers is : "<<endl;
        float result = a * b;
    }
    void Divide(int a, int b)
    {
        if(a==0 || b==0)
        {
            cout<<" ERROR: Division by Zero is not Allowed..."<<endl;
            return;
        }
        else
        {
            cout << "Division of the Two Numbers is : "<<endl;
            float result = a / b;
        }
    }
};

// Main Function
int main()
{
    Calculator calc; // Create an instance of the Calculator class
    int choice, a, b;

    cout << "Simple Calculator" << endl;
    cout << "1. Add" << endl;
    cout << "2. Subtract" << endl;
    cout << "3. Multiply" << endl;
    cout << "4. Divide" << endl;
    cout << "Enter your choice (1-4): ";
    cin >> choice;

    cout << "Enter two numbers: ";
    cin >> a >> b;

    switch (choice)
    {
        case 1:
            calc.add(a, b);
            break;
        case 2:
            calc.subtract(a, b);
            break;
        case 3:
            calc.Multiply(a, b);
            break;
        case 4:
            calc.Divide(a, b);
            break;
        default:
            cout << "Invalid choice!" << endl;
            break;
    }

    return 0; // Exit the program
}