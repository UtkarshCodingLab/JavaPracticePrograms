package AccessModifierExamples;

class A
{
    protected void GrandfatherGrandfather()
    {
        System.out.println("Grandfather's Grandfather");
    }
}
class B extends A
{
    protected void GrandFatherFather()
    {
        System.out.println("Grandfather's Father");
    }
}
class C extends B
{
    protected void GrandFather()
    {
        System.out.println("Grandfather");
    }
}
class D extends C
{
    protected void GrandFatherSon()
    {
        System.out.println("Grandfather's Son");
    }
}
public class ProtectedUsage extends D
{
    protected void GrandFatherGrandson()
    {
        System.out.println("Grandfather's Grandson");
    }
}

