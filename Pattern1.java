package practice;

public class Pattern1 {

	public static void main(String[] args) {
		for(int i=0;i<7;i++)
		{
		
			for(int k=1;k<=2*i;k++)
			{
				System.out.print("*");
			}
		   for(int j=1;j<(2*(7-i+1)-1);j++)
            {
			   if(j<=7-i)
				{
	         System.out.print("$");
				}
				else
				{
                  System.out.print("*");
				}
			}
		
		for(int j=1;j<(2*(7-i+1)-1);j++)
            {
			   if(j>7-i)
				{
	         System.out.print("$");
				}
				else
				{
                  System.out.print("*");
				}
          
		}
		for(int k=1;k<=2*i;k++)
			{
				System.out.print("*");
			}
		   
           
			
             System.out.println();
		}
		
	}

}
