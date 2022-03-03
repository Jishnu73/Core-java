package practice;
import java.util.Scanner;
public class CountDuplicate1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size");
		int n=scan.nextInt();
		int a[]=new int[n];
        System.out.println("Enter array ");
		for (int i=0;i<n ;i++ )
		{
			a[i]=scan.nextInt();
		}
		int count=0;
		for (int i=0;i<a.length ;i++ )
		{
			for(int j=i+1;j<a.length;j++)
			{
		
			if (a[i]==a[j])
			{
				count++;
			}
			}
		}
		System.out.println("The number of duplicates is"+count);

	}

}
