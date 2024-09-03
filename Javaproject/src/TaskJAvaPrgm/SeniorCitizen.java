package TaskJAvaPrgm;

import java.util.Scanner;

public class SeniorCitizen {

	public static void main(String[] args) 
	{
		System.out.println("Enter the Age of Citizen");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Is a Senior Citizen");
		}
		else
		{
			System.out.println("Not a Senior Citizen");
		}
	}

}
