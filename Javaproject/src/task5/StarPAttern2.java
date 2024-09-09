package task5;

import java.util.Scanner;


public class StarPAttern2 {

	public static void main(String[] args) 
	{
		System.out.println("Enter number of lines");
		Scanner sc=new Scanner(System.in);
		int numb=sc.nextInt();
	for(int i=1;i<=numb;i++)
	{
        for(int j=1;j<=numb;j++)
        {
        	if(i==j || i+j==(numb+1))
        	{
        		System.out.print("*");
        	}
        	
        	else
        	{
        		System.out.print(" ");
        		
        	}
        }
        
        System.out.println();
	
		
	}

	}
}


/*

 *   *
  * *
   *
  * *
 */