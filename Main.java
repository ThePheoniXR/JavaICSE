import java.util.*;
public class Main {
  public static void main(String[] args) {
  	Scanner sc=new Scanner(System.in);
    char name;
    int i = 0;
    while (i < 26) {
      System.out.println(i);
      i++;
      System.out.println("Enter Name: ");
      name = sc.next().charAt(0);
    }  
  }
}
