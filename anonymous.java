



/*class A
{
	public void display()
	{
		System.out.println("display method");
	}
}*/


//anonymous func using interface
interface interfaceA
{
	void display();
}
public class anonymous 
{
	public static void main(String[] args)
	{
		/*A a1=new A() 
		interfaceA a1=new interfaceA()
		{
			public void display()
			{
				System.out.println("not a display method");
			}
		};*/
		interfaceA a1=()->System.out.println("one line execution");
		
		a1.display();
	}

}
