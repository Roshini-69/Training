public class firstcode 
{
	public static void main (String[] args)
	{
		int a=10;
		int b=20;
		int c=a+b;
		int d=b/a;
		//division
		//returns in integer only
		int w=3;
		int s=a/w;
		//float to int
		float f=13.66f;
		int y=(int)f;
				
		System.out.println(f);
		System.out.println(y);
		System.out.println(s); 
		
		System.out.println(c);
		System.out.println(d);
		
		//widening
		int p=20;
		float q=p; 
		System.out.println(p);
		System.out.println(q);
		System.out.println("p as" +q);
		//unary operators
		int u=9;
		System.out.println(u++);
		System.out.println(++u);
		System.out.println(u--);//pre increment
		System.out.println(--u);//post increment
		//concat
		String s1 ="hie";
		String s2="hello";
		String s3=s1+s2;
		String s4=s1+5;
		System.out.println(s3);
		System.out.println(s4);
		System.out.println("length="+s1.length());
		System.out.println("upper="+s1.toUpperCase());
		String msg="I am in \"Bajaj\" session";
		System.out.println(msg);
		// \n,\b,\t,\f
		
		//math functions
		System.out.println("math funcs");
		int m=Math.max(a, b);
		System.out.println(a+" "+b);
		System.out.println(m);
		System.out.println(Math.sqrt(64));
	}
}
/*	static int a=10; //static variable 
	void method1()
	{
		int b=20; //local variable
		
	}
	public static void main(String[] args)
	{
		int c=30; //istance variable
	}

}
//one line comment
/* multiple
 * line
 * comment*/
