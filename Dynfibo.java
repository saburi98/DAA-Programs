/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynfibo;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class Dynfibo {
static int fib(int n)
{
    int stk[]=new int[n+2];
    stk[0]=0;
    stk[1]=1;
    for (int i=2;i<=n;i++){
        stk[i]=stk[i-1]+stk[i-2];
    }
for(int j=0;j<n;j++){
        System.out.println(stk[j]);
}
    System.out.println("the final store value of fibonacci series is:");
    return stk[n];
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println("generated fibbonaci seies is");
        System.out.println(fib(n));
    }
    
}
