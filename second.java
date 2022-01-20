
public class second 
{
	int height;
	int age;
	second(int a,int b)
	{
		height=a;
		age=b;
		System.out.println("running");
	}
	String name;
	//overriding
	second(int a,int b,String c)
	{
		height=a;
		age=b;
		name=c;
		System.out.println("running too");                                                                                                                                                           
	}
	
	/*user defined
	public static void func1(int a)
	{
		if(a%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
	}*/
	void display()
	{
		System.out.println(name+" "+height+" "+age);
	}
}
class third
{
	int v=3;
	int w=2;
	

	
	public static void main(String[]args)
	{
		//user defined :  func1(21);
		//create object
		second obj1=new second(5,21,"sai");
		second obj2=new second(6,22,"ram");
		second obj3=new second(6,21);
		third obj4=new third();
		System.out.println(obj4.v+obj4.w);
		
		//calling function
		obj1.display();
		obj2.display();
		obj3.display();
	}
	
	/*default
	
	second()
	{
		System.out.println("default constructor");
	}*/


}