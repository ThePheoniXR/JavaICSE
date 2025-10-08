class Escape
{   
    public static void main()
    {
        String s1="ABC\nDEF";
        String s2="ABC\tDEF";
        String s3="ABC\fDEF";
        String s4="ABC\u0037DEF";
        System.out.println("s1= "+s1+" len = "+s1.length());
        System.out.println("s2= "+s2+" len = "+s2.length());
        System.out.println("s3= "+s3+" len = "+s3.length());
        System.out.println("s4= "+s4+" len = "+s4.length());
    }
}
