import java.util.Scanner;


class call
{
	
	void show()
	{
	
	System.out.print("YESSSSS");
	
	}
	
	
	
}


class C extends call
{
	
	void name()
	{
	
	super.show();
	
	System.out.print("NOOOOOO");
	
	}
	
	
	
}



class once
{
	public static void main(String args[])
	
	{
		
     C g=new C();
	 g.name();
		
	
	}
	
	
	
	

	
}