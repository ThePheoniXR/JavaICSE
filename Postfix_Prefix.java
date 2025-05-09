//Using Increment and Decrement Operator (Postfix & Prefix)
public class Postfix_Prefix
{
    public static void main(String arg[])
    {
        double p, r, q;
        //Code 1
        p=30;
        r=p++;
        System.out.println("r="+r);//r=30
        System.out.println("p="+p);//p=31
        //Code 2
        p=40;
        r=++p;
        System.out.println("r="+r);//r=41
        System.out.println("p="+p);//p=41
        //Code 3
        p=10;
        r=p++ + p;
        System.out.println("r="+r);//r=21
        System.out.println("p="+p);//p=11
        //Code 4
        p=10;
        r=++p + p;
        System.out.println("r="+r);//r=22
        System.out.println("p="+p);//p=11
        //Code 5
        p=120; q=110;
        r=p-- + q--;
        System.out.println("r="+r);//r=230
        System.out.println("p="+p);//p=109
        System.out.println("q="+q);//q=119
        //Code 6
        p=120; q=110;
        r=--p + --q;
        System.out.println("r="+r);//r=228
        System.out.println("p="+p);//p=119
        System.out.println("q="+q);//q=109
        //Code 7
        p=25;
        p=p++ + ++p;//25+27=52
        System.out.println("p="+p);//p=52
        //Code 8
        p=5;
        p+=p++;//p=p + p++;
        System.out.println("p="+p);//p=10
        //Code 9
        p=92; r=29;
        p-=++r + r++;
        //p-= ++r + r++
        //p-=30 + 30
        //p-=60
        //p=p - 60
        //p=92-60
        System.out.println("p="+p);//p=32
        System.out.println("r="+r);//p=31
    }
    
}
