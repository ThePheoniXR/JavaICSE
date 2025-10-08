import java.util.*;//
class StringConsecChar//to display all consecutive letters in a string, good, seed, balloon
{// know , abba , cd 
    public static void main() {
        Scanner x=new Scanner (System.in);
        String s;
        int i, len;
        char c1, c2;
        System.out.println("Enter a sentence");
        s=x.nextLine();
        len=s.length();
        System.out.println("Length =" + len);
        for(i=0;i<len-1;i++)
        {
            c1=s.charAt(i);
            c2=s.charAt(i+1);
            if(c1+1==c2 )
                System.out.println("Consecutive Letters: " + c1 + " and " + c2);
        }//end of for
    }//end of main
}//end of class


