//............polymorphism........
class animals 
{
	public void sound()
	{
		System.out.println("ANIMALS SOUNDS CRAZY");
	}
}
class cat extends animals
{
	public void sound()
	{
		System.out.println("cat meows");
	}
}
class dog extends animals
{
	public void sound()
	{
		System.out.println("dog barks");
	}
}
public class animal
{
	public static void main (String args[])
	{
		animals a1=new animals();
		animals a2=new cat();
		animals a3=new dog();
		a1.sound();
		a2.sound();
		a3.sound();
	}
}