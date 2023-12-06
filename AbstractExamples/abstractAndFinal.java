package AbstractExamples;

abstract class base{
    final void test()
    {
        System.out.println("Test this method");
    }
    abstract void baseMethod();
    void nonAbstract()
    {
        System.out.println("Non Abstract Method in Base Class");
    }
    static void staticMethod()
    {
        System.out.println("Static Method");
    }
    public base()
    {
        System.out.println("Base Class Constructor");
    }
}

class derived extends base{
    @Override
    void baseMethod()
    {
        System.out.println("Base Class Method Overridden");
    }
    @Override
    void nonAbstract()
    {
        System.out.println("Non Abstract Method Overriden in Derived Class");
    }
}
public class abstractAndFinal {
    public static void main(String[] args) {
        derived d = new derived();
        d.test();
        d.baseMethod();
        d.nonAbstract();
        base.staticMethod();
    }
}
