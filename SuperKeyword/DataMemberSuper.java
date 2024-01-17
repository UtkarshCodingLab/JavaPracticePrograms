package SuperKeyword;

// Java code to show use of super
// keyword with variables

// Base class vehicle
class Vehicle {
    private int maxSpeed = 120;
    void display()
    {
        // print maxSpeed of base class (vehicle)
        System.out.println("Maximum Speed of Parent Vehicle: "
                + maxSpeed);
    }

}

// sub class Car extending vehicle
class Car extends Vehicle {
    int maxSpeed=180;
    void display()
    {
        // print maxSpeed of base class (vehicle)
        System.out.println("Maximum Speed of Child Vehicle: "
                + maxSpeed);
        System.out.println(super.display());
    }
}

// Driver Program
class DataMemberSuper {
    public static void main(String[] args)
    {
        Car small = new Car();
        small.display();
    }
}
