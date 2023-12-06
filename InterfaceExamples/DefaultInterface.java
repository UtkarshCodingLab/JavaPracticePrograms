package DefaultInterfaces;

interface API {
    // Default method
    default void show()
    {

        // Print statement
        System.out.println("Default API");
    }
}

// Interface 2
// Extending the above interface
interface Interface1 extends API {
}

// Interface 3
// Extending the above interface
interface Interface2 extends API {
}

// Main class
// Implementation class code
class DefaultInterface implements Interface1, Interface2 {
    // Main driver method
    @Override
    public void show()
    {
        System.out.println("Default Overridden");
    }
    public static void main(String args[])
    {
        // Creating object of this class
        // in main() method
        DefaultInterface d = new DefaultInterface();

        // Now calling the function defined in interface 1
        // from whom Interface 2and 3 are deriving
        d.show();
    }
}
