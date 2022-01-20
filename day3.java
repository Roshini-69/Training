
public class day3 
{
	public static void main(String[] args)
	{
		int arr[]=new int[8];
		arr[0]=1;
		arr[1]=11;
		arr[2]=19;
		for (int i=2;i<8;i++)
		{
			arr[i]=2*i;
			System.out.println(arr[i]);			
		}
		
		
		int arr1[]= {10,20,30,40,50};
		for (int i=0;i<5;i++)
		{
			System.out.println(arr1[i]);
		}
//enhanced for loop
		for(int i:arr1)
		{
			System.out.println(i);
		}
		
		day3 a1=new day3();
		day3 a2=new day3();
		day3 a3=new day3();
		day3 a4=new day3();
		day3 arr_objects[]= {a1,a2,a3,a4};
		for (int i=0;i<4;i++)
		{
			System.out.println(arr_objects[i]);
		}
//2d array
		
		System.out.println("2d");
		int arrx[]= {1,2,3,4};
		int arry[]= {5,6,7,8};
		int arrz[]= {0,9,10,12};
		int arrall[][]= {arrx,arry,arrz};
		for (int i=0;i<3;i++) 
		{
			for(int j=0;j<4;j++) 
			{
				System.out.print(arrall[i][j] + " ");
				
			}
		    System.out.println();
		}
		
		
//2d array of variable length
		int a[][]= {{1,2,3},{4,5,6,7},{8,9}};
		for (int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[i].length;j++) 
			{
				System.out.print(a[i][j] + " ");
				
			}
		    System.out.println();
		}
//sum of 2d arrays
		System.out.println("sum of 2d arrays");
		int p[][]= {{1,2},{7,5}};
		int q[][]= {{4,1},{3,6}};
		for (int i=0;i<p.length;i++)
		{
			for(int j=0;j<p[i].length;j++)
			{
				System.out.print(p[i][j]+q[i][j] + " ");
			}
			System.out.println();
		}
// copying an array to other		
		int c[]= {8,9,7,6};
		int c1[]=new int[4];
		int c2[]=new int[4];
		System.arraycopy(c, 2, c2, 1, 2);
		for (int i=0;i<c.length;i++)
		{
			c1[i]=c[i];
			System.out.println(c1[i]);
		}
		for (int k:c2)
		{
			System.out.println(k);
		}
		
		
	}

}
