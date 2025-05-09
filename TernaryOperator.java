public class TernaryOperator
{
    public static void main(String arg[])
    {
        int a, age=35;
        a=(age <5)?200:(age <10)?400: (age <20)?600: 800;
        System.out.println("Age = " + a);
    }
}