package palindrome;

public class stringpalidrome {
 public static void main (String args[])
 {
	 String str ="HELLO";
	 String rev="      ";
     for(int i=str.length()-1;i>=0;i--)
      rev+=str.charAt(i);
{
	if(str.equals(rev))
	{
		System.out.println("its a plaindrome");
		}
	else
	{
		System.out.println("not a palindrome");
		}
	
}
 }
}
