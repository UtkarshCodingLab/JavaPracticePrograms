package ClassesAndObject;

import java.util.Scanner;
public class Game {
    Scanner sc = new Scanner(System.in);
    private int rn;
    private int n;
    public Game()
    {
        rn = (int)(Math.random()*100);
        System.out.println(rn);
    }
    public void takeUserInput()
    {
        System.out.println("Enter Number: ");
        n = sc.nextInt();
    }
    public void isCorrectNumber()
    {
        if(rn==n)
        {
            System.out.println("Good Guess");
        }
        else
        {
            System.out.println("Wrong Guess");
        }
    }


    public static void main(String[] args) {

        Game g = new Game();
        g.takeUserInput();
        g.isCorrectNumber();


    }
}
