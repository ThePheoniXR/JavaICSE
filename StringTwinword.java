import java.util.*;//
class StringTwinword//to display all twin-letter words in a paragraph, good, seed, balloon
{
    public static void main() {
        Scanner x=new Scanner (System.in);
        String s,w = "";             
        int i, len; 
        char c1,c2;
        System.out.println("Enter a Sentence");
        s=x.nextLine();
        s = s.toLowerCase();
        s=s +".,";  //or  "  "   
        len=s.length();
        boolean twin=false;
        for(i=0;i<len-1;i++)
     {
            c1=s.charAt(i);
            c2=s.charAt(i+1);
            if(c1==c2 )
                twin=true;
            if(Character.isLetterOrDigit(c1))
                w=w+c1;
            else
            {
                if(twin)
                System.out.println(w);
                
                w="";
                twin=false;
            }//end of else
        }//end of for
    }//end of main
}//end of class


