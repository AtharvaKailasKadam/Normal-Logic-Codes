public class C41_Class_Fields_and_Methods
{
    String name;
    int age;
    char gender;

    // These are Methods.
    void setData(String n, int a, char g)
    {
        name = n;
        age = a;
        gender = g;
    }

    void displayData()
    {
        System.out.println("----------------------------");
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Gender = " + gender);
    }

    public static void main(String[] args)
    {
        C41_Class_Fields_and_Methods obj = new C41_Class_Fields_and_Methods();
        obj.setData("Atharva", 20, 'M');
        obj.displayData();

        obj.setData("Nishant", 23, 'F');
        obj.displayData();
        System.out.println("----------------------------");
        System.out.println("End of the Program");
        System.out.println("----------------------------");
    }
}

// It Contains Hardcore Values.
// We can also take Input from the User using Scanner Class.
// But it is not a good practice to take Input from the User in this way.
// It is better to take Input from the User in the 'Main()' method.