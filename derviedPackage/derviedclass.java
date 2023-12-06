package derviedPackage;
import basePackage.*;

class dclass extends baseclass {
    protected String name;
    protected void setName(String name)
    {
        this.name=name;
    }
    protected String getName()
    {
        return name;
    }

    }
    public class derviedclass extends dclass
    {
        public static void main(String[] args) {
            derviedclass ds  = new derviedclass();
//            ds.setId(100);
//            System.out.println(ds.getId());
            ds.setName("Utkarsh");
            System.out.println(ds.getName());
    }
}
