package ClassesAndObject;

public class employee {
    private int salary;
    private String name;
    public int getSalary()
    {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }

    public static void main(String[] args) {
        employee e = new employee();
        e.salary=10000;
        System.out.println(e.getSalary());
        e.name="Utkarsh";
        e.setName("Surya");
        System.out.println(e.getName());

    }
}
