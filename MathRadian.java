//import java.lang.Math;
public class MathRadian
{
    public static void main(String arg[])
    {
        double r, rf, d, df; 
        d=60;
        r= Math.PI / 180 * d;
        rf = Math.toRadians(d);
        df = Math.toDegrees(rf);
        System.out.println("Degree = " + d );
        System.out.println("Radian = " + r);
        System.out.println("Degree using function  = " + df );
        System.out.println("Radian using function  = " + rf);
        
   }
}
