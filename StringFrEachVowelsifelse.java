import java.util.*;//
class StringFrEachVowelsifelse//to display frequency of each vowels from a sentence
{
    public static void main() {
        Scanner x=new Scanner (System.in);
        String s;
        int i, len, fa=0, fe=0, fi=0, fu=0, fo=0;
        char c;
        System.out.println("Enter a sentence");
        s=x.nextLine();
        len=s.length();
        for(i=0;i<len;i++)
        {
            c=s.charAt(i);
            if(c=='a'|| c=='A')
                fa++;
            else if (c=='e'|| c=='E')
                fe++;
            else if (c=='i'|| c=='I')
                fi++;
            else if (c=='o'|| c=='O')
                fo++;
            else if (c=='u'|| c=='U')
                fu++;
        }//end of for
        System.out.println("A: " + fa + "\nE: " + fe + "\nI: "
                            + fi + "\nO: " + fo + "\nU: " + fu);
    }//end of main
}//end of class

