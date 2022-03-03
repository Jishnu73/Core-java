package practice;
import java.util.*;
public class SumOfOddEven {

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
		int sumOdd=0,sumEven=0;
		for (int i=1;i<a.length ;i++ )
		{
			if (i%2==0)
			{
				sumEven+=a[i];
			}
			else 
			{
				sumOdd+=a[i];
			}
				
		}
		System.out.println("Sum of odd index numbers is :"+sumOdd);
		System.out.println("Sum of even index numbers is :"+sumEven);


	}

}
