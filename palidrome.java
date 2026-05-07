package palindrome;

public class palidrome {
	public static void main (String args[])
	{
		int n=1234;
		int rev=0;
		int last;
		int  temp=n;
		
	while(n>0)
		{
		last=n%10;
		rev=rev*10+last;
		n=n/10;
		}
	if(temp==rev)
	{
	System.out.println("palindromednumber");
	}
	else
	{
		System.out.println("NOT palindromednumber");
	}
	}
	}
