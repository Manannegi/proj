package sort;
import java.util.*;
public class Bubble { 
		    void bubbleSort(int arr[]) 
		    { 
		        int n = arr.length; 
		        for (int i = 0; i < n-1; i++) 
		            for (int j = 0; j < n-i-1; j++) 
		                if (arr[j] > arr[j+1]) 
		                {
		                    int temp = arr[j]; 
		                    arr[j] = arr[j+1]; 
		                    arr[j+1] = temp; 
		                } 
		    } 
		  
		    
		    void printArray(int arr[]) 
		    { 
		        int n = arr.length; 
		        for (int i=0; i<n; ++i) 
		            System.out.print(arr[i] + " "); 
		        System.out.println(); 
		    } 
		  
		     
		    public static void main(String args[]) 
		    { 
		        Bubble ob = new Bubble(); 
		        Scanner sc=new Scanner(System.in);
		        
		        int j=sc.nextInt();
		        int arr[] = new int[j]; 
		        for(int i = 0; i < j; i++)
		        {
		            arr[i] = sc.nextInt();
		        }
		        ob.bubbleSort(arr); 
		        System.out.println("Sorted array"); 
		        ob.printArray(arr); 
		    } 
		} 



