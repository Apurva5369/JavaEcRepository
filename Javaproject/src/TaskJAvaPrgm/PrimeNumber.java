package TaskJAvaPrgm;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		for(int j=1;j<=15;j++)
		{
		
	System.out.println("Enter a number to show whether it is prime or not");
	Scanner sc= new Scanner(System.in);
	
	int a=sc.nextInt();
	int flag=0;
	//int c=0;
	int c=a/2;
	
	
	if(a==0||a==1)
	{
		flag=1;
	}
	
	
	for(int i=2;i<=c;i++)
	{
		if(a%i==0)
		{
			flag=1;
		}
	}

	if(flag==1)
	{
		System.out.println("Not a prime number");	
	}
	
	else
	{
		System.out.println("Is a prime number");
	}
		}
	}
}
