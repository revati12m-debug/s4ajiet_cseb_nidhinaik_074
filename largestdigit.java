package palindrome;

public class largestdigit 
{
	public static void main (String args[])
	{
		int num=45689;
		int max=0;
		
		while(num>0) 
		{
		 int 	digit=num%10;
			if(digit>max) {
			max=digit;
	     }
		num=num/10;
      }
	 System.out.println("The largest number is="+max);
}
}