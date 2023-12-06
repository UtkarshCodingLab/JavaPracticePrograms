package SuperKeyword;

// Java code to show use of super
// keyword with variables

// Base class vehicle
class Vehicle {
    int maxSpeed = 120;
    void display()
    {
        // print maxSpeed of base class (vehicle)
        System.out.println("Maximum Speed: "
                + maxSpeed);
    }

}

// sub class Car extending vehicle
class Car extends Vehicle {
    int maxSpeed=180;
    void display()
    {
        // print maxSpeed of base class (vehicle)
        System.out.println("Maximum Speed: "
                + maxSpeed);
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
