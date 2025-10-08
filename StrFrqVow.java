import java.util.*;//
class StrFrqVow//to find and display frequency vowels in a sentence
{
    public static void main() {
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
            if(c=='a'|| c=='A'|| c=='e'|| c=='E'|| c=='i'|| c=='I'||
                c=='o'|| c=='O'|| c=='u'|| c=='U' )
                        k++;
        }//end of for
        System.out.println(k);
    }//end of main
}//end of class


