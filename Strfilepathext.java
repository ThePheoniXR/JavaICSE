/*Write a program to assign a full path 
* and file name as given below. Using library functions, 
* extract and output the file path, file name 
* and file extension separately as shown. 
* Input - C:\Users\admin\Pictures\flower.jpg 
* Output -  Path: C:\Users\admin\Pictures\ 
            File name: flower 
            Extension: jpg*/
import java.util.*;
class Strfilepathext
 { public static void main()
 {      Scanner x = new Scanner(System.in);
        String s, fe, fn, p;
        int i, j;
        System.out.println("Enter full path and file name");
        s=x.nextLine();
        i = s.indexOf('.');
        j = s.lastIndexOf('\\');
        fe = s.substring(i+1);
        fn = s.substring(j+1, i);
        p = s.substring(0,j);
        System.out.println("Path: "+p);
        System.out.println("File name: "+fn);
        System.out.println("Extension: "+fe);
    }/*end of main*/  }//end of class
