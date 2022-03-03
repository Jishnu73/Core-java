package practice;
import java.util.*;
public class Remove {
	static int[] removeInteger(int arr[],int index)
	{
      if(arr==null||index<0||index>arr.length)
		{
		  return arr;
		}
		int c[]=new int[arr.length-1];
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i==index)
			{
				continue;
			}
			c[k++]=arr[i];
		}
		return c;
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n,pos,ele;
		System.out.println("Enter the size of array");
		n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
        System.out.println("Enter the pos at which element needs to be removed");
		pos=scan.nextInt();
		int result[]=removeInteger(a,pos);
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]+" ");
		}
		

	}

}
