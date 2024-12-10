package pg111;

//Coach comes on: Monday and Thursday
//0 for Sunday
//1 for Monday
//2 for Tuesday
//3 for Wednesday
//4 for Thursday
//5 for Friday
//6 for Saturday
//Input the day number and print the day name. 
//And also print whether the special coach will come that day or not. 
import java.util.*;
class prg6c

{
    public static void main()
    {
     Scanner sc = new Scanner(System.in);
     int day;
     System.out.println("Enter the Number between 0 - 6, 0: Sunday, 6: Saturday");
     day=sc.nextInt();
     if (day == 0)
         System.out.println("0. Sunday - the Special Coach won't come");
    else if (day == 1)
        System.out.println("1. Monday - The Special Coach will come");
    else if (day == 2)
        System.out.println("2. Tuesday - the Special Coach won't come");
    else if (day == 3)
        System.out.println("3. Wednesday - the Special Coach won't come");
    else if (day == 4)
        System.out.println("4. Thursday - The Special Coach will come");
    else if (day == 5)
        System.out.println("5. Friday - the Special Coach won't come");
    else if (day == 6)
        System.out.println("6. Saturday - the Special Coach won't come");
    else 
        System.out.println("Error");

       }
    }
   
