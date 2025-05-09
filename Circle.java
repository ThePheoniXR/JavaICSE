//Write a Program to find the Area and Circumference of a Circle
// Use Math.PI
public class Circle
{
    public static void main(String arg[])
    {
        double a, r, c;
        r=5;//Radius
        c=2*Math.PI*r; //Circumference
        a=Math.PI*r*r; //Area
        System.out.println("Circumference = "+c+"cm");
        System.out.println("Area of the Circle = "+a+"cm sq");
    }
}