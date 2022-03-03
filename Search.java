import java.util.*;
class  Search
{
	public static void main(String[] args) 
	{  
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=scan.nextInt();
		int a[]=new int[n];
        System.out.println("Enter array ");
		for (int i=0;i<n ;i++ )
		{
			a[i]=scan.nextInt();
		}
		int index=-1;
		System.out.println("Enter value to be searched");
		int ele=scan.nextInt();
		for (int i=0;i<n ;i++ )
		{
			if (a[i]==ele)
			{
				index= i;
				System.out.println("The searched value fount at index :"+index);

			}
		}
	
		/*if (index>=0)
		{
			System.out.println("The searched value fount at index :"+index);
		}
		else
		{
			System.out.println("The searched value not found");
		}*/
		

	}
}
