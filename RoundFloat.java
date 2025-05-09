import java.util.*;
public class RoundFloat
{
static void main()
{
Scanner sc=new Scanner(System.in);
float f,n;
int h;
System.out.println("Enter a floating point number:");
f=sc.nextFloat();
h=(int)((f*100)+0.5);
n=(float)h/100;
System.out.println("Rounded off to two places of decimal:"+n);
}
}
