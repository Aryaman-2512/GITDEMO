package introduction;

import java.util.Scanner;

public class Array {
	
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	
	int arr[] = new int[n];
	
	for(int i =0;  i<n ;i++)
	{
		int p = sc.nextInt();
		arr[i]= p;
	}
	
	for(int i =0 ;i<n;i++){
		System.out.println("The Elements of array are:");
		System.out.println(arr[i]);
	}
}
 
}
