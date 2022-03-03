package practice;
import java.util.*;
public class MergeArrays {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=scan.nextInt();
		int a[]=new int[n];
		int b[]= new int[n];
        System.out.println("Enter A array ");
		for (int i=0;i<n ;i++ )
		{
			a[i]=scan.nextInt();
		}
		System.out.println("Enter B array ");
		for (int i=0;i<n ;i++ )
		{
			b[i]=scan.nextInt();
		}
		int k=0;
		int c[]=new int[a.length+b.length];
		
		for (int i=0;i<n ;i++ )
		{
			c[k++]=a[i];
	    }
		for (int i=0;i<n ;i++ )
		{
			c[k++]=b[i];
	    }
		System.out.print("merged array is : ");
         for (int i=0;i<c.length;i++ )
		{
			System.out.print(c[i]+" ");
	    }
		System.out.println();
		

	}

}
