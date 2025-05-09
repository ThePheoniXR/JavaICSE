        public class ceilfloor
{    public static void main()
    {   
        System.out.println("Power 2 raised to 5 is "+Math.pow(2,5));
        System.out.println("Power 125 raised to 1.0/3 is "+Math.pow(125,1.0/3));
        System.out.println("Power 25 raised to 0.5 is "+Math.pow(25,0.5));
        System.out.println("Power -4 raised to 0.5 is "+Math.pow(-4,0.5));
        System.out.println("Square 2 is " +Math.sqrt(2));
        System.out.println("Cube 3 is " +Math.cbrt(3));       
        System.out.println("Ceil 1.1 is "+Math.ceil(1.1));
        System.out.println("Floor 1.9 is "+Math.floor(1.9));
        System.out.println("Rounding 1.1 is "+Math.round(1.1));
        System.out.println("Rounding 1.9 is "+Math.round(1.5));
        System.out.println("0.50000001 is "+ Math.round(0.5000001));
        System.out.println("Any decimal Value greater than point 0.5, it will round off to the Higher Integer Value else if the value is less than 0.5, it will round off to lowest Integer Number. If the decimal number is exactly 0.5, it will round off to closest even Integer");
        System.out.println("Absolute Value of 5-2" +Math.abs(5-2));
        System.out.println("Absolute Value of 2-5" +Math.abs(2-5));
        System.out.println("Which is higher? 2 or 5. Ans=" +Math.max(2,5));
        System.out.println("Which is smaller? 2 or 5. Ans=" + Math.min(2,5));
        System.out.println("Random Number = "+Math.random()); 
        System.out.println("between 1 to 50="+Math.random()*50*1);
        System.out.println("between 250 to 600"+Math.random()*(600-250)+250);

             }
}
