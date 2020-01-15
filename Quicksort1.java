/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort1;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Quicksort1 {
    
    int partition(int arr[], int p, int r) 
    { 
        int pivot = arr[r];  
        int i = (p-1); // index of smaller element 
        for (int j=p; j<r; j++) 
        { 
            // If current element is smaller than the pivot 
            if (arr[j] < pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[r]; 
        arr[r] = temp; 
  
        return i+1; 
    } 
    
    void sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    }
    
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Quicksort1 os = new Quicksort1(); 
        System.out.println("Enter the capacity of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for(int k=0;k<n;k++)
        {
            arr[k]=sc.nextInt();
        }
         os.sort(arr, 0, n-1);
        System.out.println("sorted array"); 
        printArray(arr);
    }
    
}
