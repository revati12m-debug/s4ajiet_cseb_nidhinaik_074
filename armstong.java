package palindrome;

public class armstong
{
	public static void main(String args[])
	{
		int n=407;
		int armstrong=n;
		int sum=0;
		
		while(n>0)
		{
			int digit =n%10;
			sum+=(digit*digit*digit);
			n=n/10;
		}
		if (sum == armstrong)
			{
			System.out.println("its an armstrong");
			}
		else
		    {
			System.out.println("Not an armstrong");
		    }
	}
}

