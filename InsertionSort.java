/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    
    public void sort( int A[] )
    {
        int N = A.length;
        int i, j, temp;
        for (i = 1; i< N; i++) 
        {
            j = i;
            temp = A[i];    
            while (j > 0 && temp < A[j-1])
            {
                A[j] = A[j-1];
                j = j-1;
            }
            A[j] = temp;            
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the capacity of the array");
        int num = sc.nextInt();
        int A[] = new int [num];
        System.out.println("Enter the Elements");
        for(int i=0;i<num;i++)
        {
          A[i] = sc.nextInt();
        }
        InsertionSort is = new InsertionSort();
        is.sort(A);
        System.out.println("After Insertion Sort:");
        for(int i = 0; i < num; i++)
            System.out.println(A[i]+"");
        System.out.println();
    }
    
}

