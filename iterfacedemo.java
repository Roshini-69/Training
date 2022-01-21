/*
interface interf1
{
	public void speed();
	public void acceleration();
	
}
interface interf2 extends interf1
{
	public void time();
}
interface interf3
{
	public void model();
}
class car
{
	public void brand()
	{
		System.out.println("coollll");
	}
}

class vehicle extends car implements interf2,interf3
{
	public void speed()
	{
		System.out.println(" drrrrrr ");
	}
	public void acceleration()
	{
		System.out.println("zrrrr");
	}
	public void time()
	{
		System.out.println("tik tik");
	}
	public void model()
	{
		System.out.println("lol");
	}
}
class interfacedemo
{
	public static void main(String[] args)
	{
		vehicle obj=new vehicle();
		obj.speed();
		obj.acceleration();
		obj.time();
		obj.model();
		obj.brand();
	}
}*/


interface polygon
{
	public void area();
}
interface circle extends polygon
{
	public double circle_area(double r);
}
interface rectangle extends polygon
{
	public double rect_area(double l,double b);
}
class triangle
{
	public double tri_area(double b,double h)
	{
		return(0.5*b*h);
	}
}
class calculate extends triangle implements polygon
{
	public void area()
	{
		System.out.println("calculate required area");
	}
	public double circle_area(double r)
	{
		return(3.14*r*r);
	}
	public double rect_area(double l,double b)
	{
		return(l*b);
	}
}
class interfacedemo
{
	public static void main(String[]args)
	{
		calculate a =new calculate();
		a.area();
		System.out.println("area of circle is "+a.circle_area(4.0));
		System.out.println("area of triangle is "+a.tri_area(3, 6));
		System.out.println("area of rectangle is "+ a.rect_area(2, 4));
		
	}
}
