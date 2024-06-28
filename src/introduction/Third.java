package introduction;

import java.util.Scanner;

 class Addition{
	public int add(int x, int y) {
		
		int a = x;
		int b =y;
		return a+b;
		
	}
	
}

public class Third {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int x = sc.nextInt();
		System.out.println("Enter second number");
		int y = sc.nextInt();
		
		Addition ad = new Addition();
		int ans  = ad.add(x,y);
		
		System.out.println("the addition is ");
		System.out.println(ans);
	}
	
	
}
