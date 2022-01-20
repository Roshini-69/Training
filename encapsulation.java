class demo
{
	private int eid;
	private String ename;
	public int getEid() 
	{
		return eid;
	}
	public void setEid(int eid)
	{
		this.eid = eid;
	}
	public String getEname()
	{
		return ename;
	}
	public void setEname(String ename)
	{
		this.ename = ename;
	} 
}
public class encapsulation 
{
	public static void main(String[] args)
	{
		demo d=new demo();
		d.setEid(1);
		d.setEname("sai");
		System.out.println(d.getEid());
		System.out.println(d.getEname());
		
		//wrapper method
		
		int w=10; //primitive
		Integer w1=new Integer(10);//boxing--wrapping
		Integer val =w;  //auto boxing
		int v=w1.intValue(); //unboxing
		int u=w1; //auto unboxing
		
		// string to integer
		String s="2345";
		int s_int = Integer.parseInt(s);
		System.out.println(s_int);
		
		//integer to string
		int xo=2;
		String ox=Integer.toString(xo);
		System.out.println(ox);
		
	}
	
	

}
