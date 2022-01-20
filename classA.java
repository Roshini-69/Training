//........multi level inheritance.....
public class classA
{
	void fun1()
	{
		System.out.println("fun 1 ");
	}
}
class classB extends classA
{
	public void fun2()
	{
		System.out.println("fun 2 ");
	}
}
class classC extends classB
{
	void fun3()
	{
		System.out.println("fun 3 ");
	}
	public static void main(String [] args)
	{
		classC c1 = new classC();
        c1.fun1();
        c1.fun2();
        c1.fun3();
    }
}
