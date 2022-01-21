


public class exe2 {
    int exe2(int arr[], int l, int r, int x)
    {
        if (r >= l) 
        {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
 
            if (arr[mid] > x)
                return exe2(arr, l, mid - 1, x);
            return exe2(arr, mid + 1, r, x);
        }
        return -1;
    }
	public static void main(String[] args) 
	{
		//1
		String s="Rosh here";
		int l=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) != ' ')
			{
				l=l+1;	
			}
		}
		System.out.println("no.of characters="+l);
		
		//2
		exe2 ob = new exe2();
        int arr[] = {11,12,13,14,15 };
        int n = arr.length;
        int find = 14;
        int result = ob.exe2(arr, 0, n - 1, find);
        if (result == -1)
            System.out.println("not found");
        else
            System.out.println("found at " + result);
			 
		
		
		//3
		System.out.print("first pattern");
		for(int i=6;i>0;i--)
		{
			for(int j=i;j<6;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//4
		System.out.println("second pattern");
		for(int i=1;i<6;i++)
		{
			for(int j=i;j<6;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
