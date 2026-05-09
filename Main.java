package batch4;

class Bottle {

	 String brand;
	 String color;
	 int volume;
	 
	 int currentVolume=0;
	 boolean isOpen=false;
	 boolean isClose=true;
	 boolean isFull=false;
	 boolean isEmpty=true;
	 
	 Bottle(String brand,String color,int volume)
	 {
		 this.brand=brand;
		 this.color=color;
		 this.volume=volume;
		 
	 }
	 public void openCap()
	 {
		 System.out.println("Opening cap");
		 this.isClose=true;
		 this.isOpen=false;
		 
	 }
	  public void closeCap()
	 {
		 System.out.println("closing cap");
		 this.isClose=true;
		 this.isOpen=false;
		 
	 }
	 public void drink(int consumed)
	 {
		 System.out.println("Drinking"+consumed+"ml of water");
		 this.currentVolume-=consumed;
		 if( this.currentVolume<=0);
		 this.isEmpty=true;
		 if( this.currentVolume!=this.volume);
		 this.isFull=false;
		 
	 }
	 public void fillWater(int volume)
	 {
		 System.out.println("Filling"+volume+"ml of water");
		 this.currentVolume+=volume;
		 if( this.currentVolume==this.volume)
		 {
		 this.isFull=true;
		 }
		 
		 if(volume>0)
		 {
		 this.isEmpty=false;
		 }
	  
}
public void display()
{
	System.out.printf("%s,%s,%d,%d,%b",this.brand,this.color,this.volume,this.currentVolume,this.isFull,this.isEmpty,this.isOpen,this.isClose);
}
}

public class Main {
public static void main(String args[])
{
	Bottle Milton=new Bottle("Milton","Black",750);
	Milton.display();
	Milton.openCap();
	Milton.display();
	Milton.fillWater(100);
	Milton.display();
	Milton.drink(50);
	Milton.fillWater(700);
	Milton.display();
	Milton.drink(750);
	Milton.display();
	Milton.closeCap();
	Milton.display();
	
	
}
	
	
}

