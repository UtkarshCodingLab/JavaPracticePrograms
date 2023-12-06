package Looping;

import java.util.Scanner;
public class fibrecursion {
    int fib(int n)
    {
        if(n==0)
        {
            return n;
        }
        else if (n==1)
        {
            return n;
        }
        else
        {
            return fib(n-2) + fib(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibrecursion fb = new fibrecursion();
        for(int i=0;i<n;i++) {
            System.out.println(fb.fib(i));
        }
    }
}
