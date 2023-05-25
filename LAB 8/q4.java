/*Write a program in java using inheritance to show how to call the base class parameterized constructors from the derived class using super. */
class BaseClass 
{
    int baseVar;
    BaseClass(int baseVar) 
    {
        int baseVar1 = baseVar;
        System.out.println("Base class constructor called with parameter " + baseVar1);
    }
}

class DerivedClass extends BaseClass 
{
    int derivedVar;
    DerivedClass(int baseVar, int derivedVar) 
    {
        super(baseVar);
        int derivedVar1 = derivedVar;
        System.out.println("Derived class constructor called with parameters " + baseVar + " and " + derivedVar1);
    }
}

public class q4
{
    public static void main(String[] args) 
    {
        DerivedClass obj = new DerivedClass(30, 40);
    }
}
