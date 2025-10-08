class IndexOf
{   
    public static void main()
    {
        String d ="Aybcdyeyuhken";
	//	   0123456789012
    int g=d.indexOf('y');  // 1
    System.out.println(g);
    g=d.indexOf('y', g+1); // 5
    System.out.println(g);   
    g=d.indexOf('y', g+1); // 7
    System.out.println(g);
    g=d.indexOf('y', g+1);  // -1
    System.out.println(g);
    System.out.println("lastIndexOf");
    g=d.lastIndexOf('y');  // 7
    System.out.println(g);
    g=d.lastIndexOf('y', g-1); // 5
    System.out.println(g);   
    g=d.lastIndexOf('y', g-1); // 1
    System.out.println(g);
    g=d.lastIndexOf('y', g-1);  // -1
    System.out.println(g);
    }
}
