import java.util.*;
class RemoveElements 
{
	static void removeInteger(int arr[],int start,int end)
	{
       int j=0;
	   int b[]=new int[arr.length-((end-start)+1)];
		for(int i=0;i<arr.length;i++)
		{
			if(i<start||i>end)
			{
			 b[j]=arr[i];
			 j++;
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n,initial,last;
		System.out.println("Enter the size of array");
		n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
       System.out.println("Enter the initial pos at which element needs to be removed");
		initial=scan.nextInt();
		System.out.println("Enter the last pos at which element needs to be removed");
		last=scan.nextInt();
        removeInteger(a,initial,last);
	}
}

	
