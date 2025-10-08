import java.util.*;//Display all letter 'a' from a sentence.
class Stringdispa
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
            c=s.charAt(i);
            if (c=='a'|| c=='A')
                System.out.println(c);    
        }//end of for loop
    }//end of main
}//end of class
