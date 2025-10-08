class Comparetoignorecase
{   
    public static void main()
    {
        String a ="AbcdEfg";
        String b ="AbcdEfg";
        String c ="Abc";
        String e ="AbCdEfg";
          //       0123456789012
    int d=a.compareTo(b);
    System.out.println(d);
    d=a.compareTo(c);
    System.out.println(d);
    d=a.compareTo(e);
    System.out.println(d);
    }
}
