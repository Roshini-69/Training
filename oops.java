//...............SINGLE LEVEL
/*
public class oops
{
	int salary;

}
class Subclass extends oops
{
	int bonus=10000;
	public static void main(String [] args)
	{
		Subclass i=new Subclass();
		System.out.println("salary is "+i.salary);
		System.out.println("bonus is "+i.bonus);
		
	}
}
*/
// ...............MULTI LEVEL
public class oops
{
	int salary=20000;
	

}
class Subclass extends oops
{
	int bonus=10000;
	
}
class finalClass extends Subclass
{
	int tax=5000;
	public static void main(String [] args)
	{
		finalClass i=new finalClass();
		
		System.out.println("salary is "+i.salary);
		System.out.println("bonus is "+(i.bonus+i.salary));
		System.out.println("final salary is "+(i.bonus+i.salary-i.tax));
	}
}





