package pg91;
//(S<=10) T = R*R + K*K*K;
//(S<=20 && >10) T = R*R*R + K*K;
//(otherwise) T = (R+K)*(R+K);
//Conditional calculation of T using R, K, S;
import java.util.*;
class prg15
{
    public static void main()
    {
        int S, R, K, T;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of S: ");
        S=sc.nextInt();
        System.out.println("Enter the value of R: ");
        R=sc.nextInt();
        System.out.println("Enter the value of K: ");
        K=sc.nextInt();
        if (S<=10)
            T = R*R + K*K*K;
            else if (S<=20 && S>10)
            T = R*R*R + K*K;
            else
            T = (R+K)*(R+K);
            System.out.println("The calculated result of T = " + T);
    }
}