package trainingapi;
import java.util.*;
public class Rectangle extends Shape {
private double length;
private double breadth;
private double area;
private double perimeter;
Scanner scan=new Scanner(System.in);
public void input()
{
	System.out.println("Enter length :");
	length=scan.nextDouble();
	System.out.println("Enter breadth :");
	breadth=scan.nextDouble();
}
public void Calculate()
{
	area=length*breadth;
	System.out.println("Area of Rectangle is : "+area);
	perimeter=2*(length+breadth);
	System.out.println("Perimeter of Rectangle is :"+perimeter);
}

}
