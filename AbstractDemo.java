
abstract class Human
{
	public abstract void eat(); //abstract function
	public abstract void read();
	public void walk()          // non abstract function
	{
		System.out.println("Walkzzz");
	}
}
class man extends Human  // normal class- abstract functions not allowed
{
	public void eat()
	{
		System.out.println("Eat healthy ");
	}
	public void read()
	{
		System.out.println("Read novel");
	}
	public final void sing()
	{
		System.out.println("sing for bts");
	}
}

public class AbstractDemo {
	public static void main(String[] args) 
	{
		// Human h=new Human() ---- object cannot be created from abstract class--doesn't work
        Human h=new man(); // object from references of abstract class---works
	    man h1=new man();
        h1.eat();
	    h1.walk();
	    h1.read();
	    h1.sing();
	
	}

}
