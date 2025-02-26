import java.util.*;
class d
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write a, b, c");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a>b && b>c)//a>b>c
        System.out.println("B");
        else if (a>c)//a>c>b
        System.out.println("C");
        else
        System.out.println("A");
    }
}