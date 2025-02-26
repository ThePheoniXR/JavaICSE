import java.util.*;
class pgprgperfectSquare 
{
public static void main()
{
Scanner sc=new Scanner (System .in);
double a, sr;
while (true)//endless or  infinite loop 
{
 System.out.println("enter a  number");
  a=sc.nextDouble();
  if(a>0)
    {
    sr=(int)Math.sqrt(a);
    if(a == sr*sr)
        System.out.println(a+" is a perfect square ");
     else
        System.out.println(a+" is not a perfect square ");
    }
  else
    break;//to terminate the loop
}//end of while loop
}//end of main 
}//end of class
