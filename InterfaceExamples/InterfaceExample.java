package InterfaceExamples;

// A simple interface
interface In1 {

    // public, static and final
    static int a = 10;

    // public and abstract
    void display();
}

// A class that implements the interface.
class InterfaceExample implements In1 {
    // Implementing the capabilities of
    // interface.
    public void display(){
        System.out.println("Geek");
    }

    // Driver Code
    public static void main(String[] args)
    {
        InterfaceExample t = new InterfaceExample();
        t.display();
        System.out.println(In1.a);
    }
}

