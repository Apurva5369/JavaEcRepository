package task5;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args)
	{
		System.out.println("Print the number of rows you want");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int k=1;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				k++;
			}
			System.out.println();
		}

	}

}
