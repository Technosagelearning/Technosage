package InterviewQuestionsJava;

public class FindTheDifference
{
    public static void main(String[] args)
    {
        String s="";
        String t="y";
        System.out.println(findthediff(s,t));


    }

    public static char findthediff(String s, String t)
    {
        int total=0;
        for(int i=0;i<t.length();i++)
        {
            total=total+t.charAt(i);

        }

        for(int i=0;i<s.length();i++)
        {
            total=total-s.charAt(i);
        }

        return (char)total;

    }
}
