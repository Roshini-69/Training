public class main
{
	int a=3;
	int b=2;
	int d;
	//static method
	//doesn't need any object to run
	static void mystatic()
	{
		System.out.println("cool");
	}
	
	//public method
	public void mypublic()
	{
		System.out.println("not cool");
	}
}
class normal extends main
{
	int c=9;
	public static void main(String[]args)
	{
		mystatic();
		
		//create object
		main obj=new main();
		obj.mypublic();
		normal ob=new normal();
		
		//assigning variables 
		obj.d=5;
		System.out.println(obj.a+obj.b+ob.c+obj.d);
	}
	
}