import java.util.*;//Write a program to assign a email id 
class Stremail//Using library functions, 
{//extract and output as shown. 
 public static void main()
    {//                                 Input abcdef@gmail.com 
     //                                 Output  Id: abcdef
        Scanner x=new Scanner (System.in);//Domain: gmail 
        String s, id, dm, ex ;             //Extension: com
        int i, j;              
        System.out.println("Enter full path and file name");
        s=x.nextLine();
        j = s.indexOf('.');
        i = s.indexOf('@');
        id  = s.substring(0,i);
        dm = s.substring(i+1, j);
        ex = s.substring(j+1);
        System.out.println("Id: "+id);
        System.out.println("Domain: "+dm);
        System.out.println("Extension: "+ex);
    }/*end of main*/  }//end of class
