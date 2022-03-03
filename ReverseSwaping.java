package trainingapi;
import java.util.*;
public class ReverseSwaping {

public static void main(String[] args) {

				Scanner scan=new Scanner(System.in);
				System.out.println("Enter the array size in even number");
				int n=scan.nextInt();
				int a[]=new int[n];
				System.out.println("Enter the array ");
				for (int i=0;i<n ;i++ )
				{
		         a[i]=scan.nextInt();
				}
				scan.close();
				int first=0;
				int j=a.length-1;
				for (int i=0;i<a.length/2 ;i++ )
				{
				     	first=a[i];
						a[i]=a[j];
						a[j]=first;
			             j--;
				}
				for(int element:a)
				{
		          System.out.print(element+" ");
				}
			}



	}


