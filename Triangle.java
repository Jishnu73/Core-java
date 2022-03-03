package trainingapi;
import java.util.*;
public class Triangle extends Shape{
	private double base;
	private double height;
	private double area;
	Scanner scan=new Scanner(System.in);
public void input()
{
	System.out.println("Enter base length :");
	base=scan.nextDouble();
	System.out.println("Enter height :");
	height=scan.nextDouble();
}
public void Calculate()
{
	area=(base*height)/2;
	System.out.println("Area of Triangle is :"+area);
	
}
}
