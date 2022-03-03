import java.util.*;
class SortArray 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array ");
		for (int i=0;i<n ;i++ )
		{
         a[i]=scan.nextInt();
		}
		int small=0;
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=i+1;j<a.length ;j++ )
			{
			if (a[i]>a[j])
			{
				small=a[i];
				a[i]=a[j];
				a[j]=small;
			}
			}
		}
		for(int element:a)
		{
          System.out.print(element+" ");
		}
	}
}
