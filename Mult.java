class  Mult
{
    public static void multiply( int  a,   int  b )  
{
  int prod = a * b;
  System.out.println( prod ) ;
 }
public static void multiply( double  a,   int  b )  
{
  double prod = a * b;
  System.out.println( prod ) ;
 }
 public static void multiply( int  b, double  a   )  
{
  double prod = a * b;
  System.out.println( prod ) ;
 }
public static void multiply( int  a,   int  b,   int  c )
{
  int prod = a * b * c;
  System.out.println( prod ) ;
 }
public static void main()
{
Mult.multiply( 2 , 3 ) ;
Mult.multiply( 2 , 3 , 4 ) ;
}
}
