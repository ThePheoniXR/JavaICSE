import java.util.*;//Display frequency letter 'a' from a sentence.
class String2Frqa
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        String s;
        int i, len, k=0;
        char c;
        System.out.println("Enter a sentence");
        s=sc.nextLine();
        len=s.length();

        for(i=0;i<len;i++)
        {
            c=s.charAt(i);
            if (c=='a'|| c=='A')
                k++;     
        }//end of for loop
            System.out.println(k);            
    }//end of main
}//end of class
