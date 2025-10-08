import java.util.*;//Display each character from a sentence.
class Strchr
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        String s;
        int i, len;
        char c;
        System.out.println("Enter a sentence");
        s=sc.nextLine();
        len=s.length();
        
        for(i=0;i<len;i++)
        {
            c=s.charAt(i);//
            System.out.println(c);
        }//end of for
    }//end of main
}//end of class