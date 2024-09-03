package TaskJAvaPrgm;

import java.util.Scanner;

public class Swap2numbers {

	public static void main(String[] args) 
	{
		System.out.println("Enter First Number");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("First number is"+x);
		
		System.out.println("Enter Second Number");
		int y=sc.nextInt();
		System.out.println("Second number is"+y);
		
		int z;
		
		z=x;
		x=y;
		y=z;
		
		System.out.println("Numbers after Swapping");
		System.out.println("First number is"+x);
		System.out.println("Second number is"+y);
		
		

	}

}
