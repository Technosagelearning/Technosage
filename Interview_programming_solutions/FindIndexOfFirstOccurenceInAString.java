package InterviewQuestionsJava;

public class FindIndexOfFirstOccurenceInAString
{
    public static void main(String[] args)
    {
        String haystack="sadbutsad";
        String needle="dog";
        System.out.println(strStr(haystack,needle));
    }

    public static int strStr(String haystack, String needle)
    {

        return haystack.indexOf(needle);

    }
}

