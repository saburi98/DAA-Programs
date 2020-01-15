/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonnaci;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class Fibonnaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int a=0, b=1,c=0;
        System.out.println("enter the number");
        int n=sc.nextInt();
        
        System.out.println(a);
        System.out.println(b);
for(int i=0;i<n;i++) {
    c=a+b;
a=b;
b=c;

        System.out.println(c);
    }
    } 
}
