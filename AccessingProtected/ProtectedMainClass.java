package AccessingProtected;
import AccessModifierExamples.*;
class F extends ProtectedUsage
{
    protected void GrandfatherGrandsonSon()
    {
        System.out.println("Grandfather's Grandson's Son");
    }
    void display()
    {
        this.GrandfatherGrandfather();
    }
}
class G extends F
{
    protected void GrandfatherGrandsonGrandson()
    {
        System.out.println("Grandfather's Grandson's Grandson");
    }
    void superdisplay()
    {
        super.GrandFather();
    }
}
class H extends G
{
    void superA()
    {
        super.GrandfatherGrandfather();
    }
}
public class ProtectedMainClass {
    public static void main(String[] args) {
        G f = new G();
        f.superdisplay();

    }
}
