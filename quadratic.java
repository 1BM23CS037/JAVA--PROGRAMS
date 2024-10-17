//ANJALI PATEL 1BM23CS037

import java.util.Scanner;
import java.lang.Math;

class quadratic
{
public static void main(String arg[])
{
int a ,b, c;
double r1 , r2;
Scanner s = new Scanner(System.in);

System.out.println("enter the first coefficient");
a= s.nextInt();

System.out.println("enter the second coefficient");
b=s.nextInt();

System.out.println("enter the third coefficient");
c= s.nextInt();

double det=b*b-4*a*c;

if(det>0)
{
r1= (-b +(Math.sqrt(det)))/(2*a);
r2= (-b -(Math.sqrt(det)))/(2*a);
System.out.println("the root1 is" +r1);
System.out.println("the root2 is" +r2);
}
else if(det==0)
{
r1 =-b/(2*a);
System.out.println("the roots are equal and its value is" +r1);
}
else
{
System.out.println("the roots are imaginary");
}
}
}