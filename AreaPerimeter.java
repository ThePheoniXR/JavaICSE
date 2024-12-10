import java.util.*;
class AreaPerimeter
{
    public static void main()
    {
        Scanner a=new Scanner(System.in);
        double l, b, ar, p;
        System.out.println ("type length");
        l= a.nextDouble ();
        System.out.println ("please give the value for breadth");
        b= a.nextDouble ();
        ar= l*b;
        p= 2*(l+b);
        System.out.println ("Area = " + ar);
        System.out.println ("Perimeter = " + p);
    }
}