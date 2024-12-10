package pg91;

// (choice == 1) Input time in hours & minutes and convert it to total min [1hr = 60 min]
// (choice == 2) Input temperature in Celsius and convert it to Fahrenheit [C/5 = (F-32)/9]
// (choice == 3) Input Length in Feet and convert it into cm. [1 Feet = 30.48 cm]

import java.util.*;
class prg12
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice: ");
        int ch = sc.nextInt();
        if (ch == 1)
        {
            int hr, min, tm;
            System.out.println("Enter hour, min: ");
            hr = sc.nextInt();
            min = sc.nextInt();
            tm = hr*60+min;
            System.out.println("Total Min= " + tm);
        }
        else
        if (ch == 2)
        {
            double C, F;
            System.out.println("Enter Celsius Value: ");
            C = sc.nextDouble();
            F = (C*9.0/5.0 + 32);
            System.out.println("Corresponding Fahrenheit Temp: " + F);
        }
        else
        if (ch == 3)
        {
            int Ft;
            double cm;
            System.out.println("Enter how many feet: ");
            Ft = sc.nextInt();
            cm = Ft*30.48;
            System.out.println(Ft + "Feet = " + cm + "centimeter");
        }
        else
        System.out.println("Wrong Choice");
    }
}