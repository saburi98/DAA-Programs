/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recurfibbo;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Recurfibbo {
static int fib(int n){
    if(n==0)
        return 0;
        if(n==1)
            return 1;
        else
        return fib(n-1) + fib( n-2);    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("The fibonnacci series is:");
        for (int i=0;i<n;i++)
            System.out.println(""+fib(i));
    }
    
}
