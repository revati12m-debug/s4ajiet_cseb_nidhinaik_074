package palindrome;
import java.util.Scanner;
public class monkey {
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
	
	int n=sc.nextInt();
	int k=sc.nextInt();
	int j=sc.nextInt();
	int m=sc.nextInt();
	int p=sc.nextInt();
	
	int bananamonkeys=0;
	int peanutmonkeys=0;
	 
	bananamonkeys=m/k;
	if(m%k>0)
		{
		bananamonkeys=bananamonkeys+1;
		}
	peanutmonkeys=p/j;
	if(p%j>0)
		{
		peanutmonkeys=peanutmonkeys+1;
		}
	
	int jumpDown=bananamonkeys+peanutmonkeys;
	 
	int left = n-jumpDown;
 
	System.out.println("Number of monkeys left on the tree"+left);
}
}
