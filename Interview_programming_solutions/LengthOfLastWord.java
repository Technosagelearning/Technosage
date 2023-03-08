package InterviewQuestionsJava;

public class LengthOfLastWord
{
    public static void main(String[] args)
    {
        String str="Hello world leet.  ";
        System.out.println(LengthOfLastWord(str));

    }

    static int LengthOfLastWord(String s)
    {
        String[] s1=s.split("\\s");
        return s1[s1.length-1].length();

       // String str=s.trim();
       // int count=0;
        /*for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)!=' ')
            {
                count++;
            }
            else
            {
                break;
            }
        }*/
    }
}
