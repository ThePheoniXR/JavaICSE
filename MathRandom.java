public class MathRandom
{
    public static void main()
    {
  System.out.println("Random num btwn 0 and 1  "+ Math.random());
       int r=(int) (Math.random()*50+1);
        int s=(int) (Math.random()*(300-200) + 200);
        System.out.println("Random numbers between 1 to 50  "+r);
        System.out.println("Random num btwn 200 to 300  "+ s);
   }
}
