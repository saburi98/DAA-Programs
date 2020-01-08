/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the number of Elements to be sorted");
        int num = sc.nextInt();
        int A[] = new int [num];
        System.out.println("Enter the Elements");
        for(int i=0;i<num;i++)
        {
          A[i] = sc.nextInt();
        }
        System.out.print("After inserting:");
        for(int i = 0; i < num; i++)
        {
            System.out.println(A[i]+"");
        }
    }
    
}
