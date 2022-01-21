
public class array_exe 
{
	public static void main(String[] args)
	{
		//1
		int arr[]=new int[5];
		System.out.println("all elements of an array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i;
			
			System.out.println(arr[i]);
		}
		//2
		System.out.println("elements in reverse order");
		for (int i=arr.length-1;i>=0;i--)
		{
			
			System.out.println(arr[i]);
		}
		
		//3
		int arr1[]=new int[] {4,2,4,6,8,6};
		System.out.println("duplicate elements are");
		for (int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]==arr1[j])
				{
					System.out.println(arr1[j]);
				}
				
			}
		}
		
		//4
		System.out.println("sorted elements are");
		int check=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=i+1;j<arr1.length;j++)
			{
				if(arr1[i]>arr1[j])
				{
					check=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=check;
				}
				
			}
		}
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		
		//5
		int num=123456;
		int rev_num=0;
		while(num !=0)
		{
			int rem=num%10;
			rev_num=rev_num*10+rem;
			num=num/10;
		}
		System.out.println("reverse of given number is "+rev_num);
				
	}

}
