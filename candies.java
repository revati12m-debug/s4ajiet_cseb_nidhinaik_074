package palindrome;
import java.util.Scanner;
public class candies {
	public static void main (String args[])
	{
		int jar=10;
		int k=5;
		
		Scanner sc=new Scanner(System.in);
		
				
		int n=sc.nextInt();
		
		if(n>jar || jar-n<k)
		{
			System.out.println("INVALID INPUT");
		}
		else
		{
			jar=jar-n;
		}
		System.out.println("Number of candies sold="+n);
	    System.out.println("Number of candies available="+jar);
	}

}
