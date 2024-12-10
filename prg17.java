 package pg91;

// Input the weight of two boxes in variables w1 and w2.
// Store the weight of the heavier box in variable hw. Print hw. Use ternary operator.

import java.util.*;
class prg17
{
    public static void main()
    {
        int w1, w2, hw;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight of the 1st Box: ");
        w1 = sc.nextInt();
        w2 = sc.nextInt();
        hw = (w1>w2) ? w1 : w2;
        System.out.println("Weight of the Heavier box is: " + hw);
    }
}