Basic Java Programs: 

Area Of Circle Java Program
public class Circle.
{
public static void main(String[] args)
{
int r;
double pi = 3.14, area;
Scanner s = new Scanner(System. in);
System. out. print("Enter radius of circle:");



Area Of Triangle
Let us find the area using the area of triangle formula:

Area of triangle = (1/2) × b × h

A = 1/2 × 10 × 5

A = 1/2 × 50

Therefore, the area of the triangle (A) = 25 in2



Area Of Rectangle Program

Area Of Isosceles Triangle

class AreaOfIsoscelesTriangle 
{
   public static void main(String args[]) 
    {   
       
         Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the length of same sided");
         
         double a= s.nextDouble();
         
         System.out.println("Enter the side2 of the Triangle");
         
         double b= s.nextDouble();
 
         double  area=(b/4)*Math.sqrt((4*a*a)-(b*b));
      
         System.out.println("Area of Isosceles Triangle is: " + area);
   }
}


Area Of Parallelogram
public class parallelogram{
public static void main(String args[])
{
int base=4;
int height=18;
int area_parallelogram=base*height;
System.out.println("Area of the parallelogram="+area_parallelogram);
}



Area Of Rhombus
public class AreaOfRhombus {
 
    public static void main(String[] args)
    {
        double d1, d2;
        // Diagonal 1
        d1 = 2;
        // Diagonal 2
        d2 = 3;
        if (d1 <= 0 || d2 <= 0)
            System.out.println("Length should be positive");
        else
            System.out.println("Area of rhombus = "
                               + (d1 * d2) / 2);
    }
}



Area Of Equilateral Triangle

public class tops.
{
public static void main (String args[])
{ float a = 5f ;
double area = ( 1.73 * a*a) / 4 ;
System.out.println("Area of Equilateral Triangle is:"+area);
}}


Perimeter Of Circle

import java.util.Scanner;
public class Perimeter.
{
int r, l, b, s1, s2, s3;
double pi = 3.14,perimeter;
Scanner s = new Scanner(System. in);
void circle()
{


Perimeter Of Equilateral Triangle

import java.util.Scanner;
class PerimeterOfEquilateralTriangle 
{
   public static void main(String args[]) 
    {   
       
         Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the side of the Triangle:");
         
	 double a= s.nextDouble();
 
         double  perimeter=3*a;
      
         System.out.println("perimeter of Triangle is: " + perimeter);      
   }
}


Perimeter Of Parallelogram

Java Program Calculate Perimeter Of Parallelogram | 3 Ways
in Java Programs December 10, 2022 Comments Offon Java Program Calculate Perimeter Of Parallelogram | 3 Ways

Java program to calculate the Perimeter of a parallelogram – In this specific article, we will detail in on the multiple methods to calculate the perimeter of a parallelogram in Java Programming.

Suitable examples and sample outputs are provided for the easy comprehension of the whole scheme of things. The compiler has also been added so that you can execute it yourself.

The methods used in this piece are as follows:

Using Scanner Class
Using Command Line Arguments
Using Static Function
A parallelogram, as we all know, is a two-dimensional quadrilateral figure used in the world of geometry.

A parallelogram, as the name itself suggests, has its opposite sides equal and parallel. The opposite angles are also equal in nature.

A special case where all the angles subtended by a parallelogram are 90 degrees is regarded as a rectangle.

Parallelogram


As you can see, this is a Parallelogram with the longer side of 8cm and the shorter side of 6cm. Since the opposite sides of a parallelogram are equal, the perimeter can be calculated with this formula:

P = 2(a + b)

Hence, the perimeter of this parallelogram is:

P = 2(8 + 6) = 28cm.

TThus, the various methods to calculate the perimeter of a parallelogram in Java Programming is as follows:

Using Scanner Class
import java.util.Scanner;
class PerimeterOfParallelogram
{
   public static void main(String args[]) 
    {   
       
         Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the height of the Parallelogram:");
         
         double h= s.nextDouble();
	 
	 System.out.println("Enter the breadth of the Parallelogram:");
         
	 double b= s.nextDouble();
          
         double  perimeter=2*(h+b);
     
	 System.out.println("perimeter of Parallelogram is: " + perimeter);      
   }
}



Perimeter Of Rectangle

public class Main.
{
public static void main (String args[])
{ float a ,b, c, d, perimeter;
a=c= 5;
b=d=4;
perimeter = 2*(a+b);
System.out.println("Perimeter of Rectangle is: "+perimeter);



