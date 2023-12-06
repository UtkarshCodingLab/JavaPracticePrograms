package ClassesAndObject;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Student {
    private int id;
    private String name;
    public void setID(int id)
    {
        this.id=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getID()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.setID(100);
        s.setName("Utkarsh");
        System.out.println(s.getID());
        System.out.println(s.getName());
    }
}