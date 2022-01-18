
public class practice {

	public static void main(String[] args) 
	{
		int a=9;
		int b=10;
		int c=11;
		//1
		//relational
		System.out.println("operators");		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(b!=3);
		System.out.println(a>=b);
		System.out.println(a<=c);
		System.out.println(c!=9);
		
		//logical
		System.out.println((a>b)&&((b>c)));
		System.out.println((a>b)||((b>c)));
		System.out.println(!(a>b));
		
		//assignment
		System.out.println(a+=b);		
		System.out.println(a-=b);		
		System.out.println(a*=b);		
		System.out.println(a/=b);
		
		//2
		// to check prime number 
		int p=23;
		boolean check=false;
		for (int i=2;i<=p/2;i++)
		{
			if (p%i==0)
			{
				check=true;
				break;
			}
		}
			
			if(check)
			{
				System.out.println(p+" is not prime");
			}
			else
			{
				System.out.println(p+" is prime");
			}
			
			//3
			// to check leap year
			int year=2022;
			if ((year%4==0)&&(year%100 != 0))
			{
				System.out.println(year+" is leap year");
			}
			else if (year % 400 ==0)
			{
				System.out.println(year+" is leap year");			
			}
			else
			{
				System.out.println(year+" is not a leap year");
				
			}
			//4
			//sum of first 10
			int n=10;
			int sum=0;
			for (int i=1;i<n+1;i++)
			{
				sum=sum+i;
			}
			System.out.println("sum ="+sum);	
			
			//5
			//switch case for calculator
			int opn=2;
			int num1=7;
			int num2=9;
			switch(opn)
			{
			case 0:
				System.out.println(num1+num2);
				break;
			case 1:
				System.out.println(num1-num2);
				break;
			case 2:
				System.out.println(num1*num2);
				break;
			case 3:
				System.out.println(num1/num2);
				break;
			
			default:
				System.out.println("numbers not assigned");
			}
				
	}

}
