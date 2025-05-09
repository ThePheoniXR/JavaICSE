import java.util.*;
class AreaCircumference
{
    public static void main()
    {
        Scanner a=new Scanner(System.in);
        double r, c, ar;
        System.out.println ("What is the Radius of the Circle?");
        r= a.nextDouble ();
        c= 2*Math.PI*r;
        ar= Math.PI*r*r;
        
        System.out.println ("Circumference =" + c);
        System.out.println ("Area = " + ar);
            }
}