import java.util.*;//Accept a sentence and display
class StrDispVow
//  vowel
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
            if(c=='A' || c=='a' || c=='e' || c=='E' ||c=='I' 
                || c=='i' || c=='O' || c=='o' ||c=='U' || c=='u'   )
                System.out.println(c);

        }//end of for
    }//end of main
}//end of class


