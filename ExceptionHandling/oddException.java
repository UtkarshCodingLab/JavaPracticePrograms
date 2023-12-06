package ExceptionHandling;
import java.util.Scanner;

public class oddException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try
        {
            if(n%2==1)
            {
                System.out.println("Odd Number");
            }
        }
        catch(Exception e)
        {
            System.out.println("Odd Number");
        }
    }
}
