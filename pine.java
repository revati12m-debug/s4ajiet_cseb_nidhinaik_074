package batch4;
import java.util.ArrayList;

class pine
{
    public static void main (String args[])
{
    ArrayList<Integer> a = new ArrayList<>();
      	 
      	a.add(1);
      	a.add(1);
      	a.add(1);
      	a.add(1);
      	a.add(2);
      	a.add(3);
      	a.add(4);
      	a.add(4);
      	a.add(4);
	
    for(int i=0;i<a.size()-1;)
    {
        if(a.get(i)==a.get(i+1))
        {
            a.remove(i+1);
        }
        else
        {
            i++;
        }
        }
        System.out.println(a);
}
}
    

    

