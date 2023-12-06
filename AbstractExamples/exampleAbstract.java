package AbstractExamples;

class Example{
    void Run()
    {
        System.out.println("Run");
    }
}
class Testing extends Example{
    void RunProgram()
    {
        System.out.println("Program is Running");
    }
}
public class exampleAbstract {
    public static void main(String[] args) {
        new Testing().RunProgram();
    }
}
