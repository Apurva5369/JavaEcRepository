package TaskJAvaPrgm;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		int fact=1;
		System.out.println("Enter a number for factorial");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		for(int i=1;i<=a;i++)
		{
		fact =fact*i;
		}

		System.out.println("Factorial is "+fact);
	}

}
