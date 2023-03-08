package InterviewQuestionsJava;

public class EquivalentStrings {
    public static void main(String[] args) {

        String word1="aaaa";
        String word2="bccb";
        System.out.println(EquivStrings(word1,word2));

    }

    public static boolean EquivStrings(String word1,String word2)
    {
        int len=word1.length();
        int[] freq=new int[26];

        for(int i=0;i<len;i++)
        {
            freq[word1.charAt(i)-'a']++;
            freq[word2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(Math.abs(freq[i])>3)
            {
                return false;
            }
        }

        return true;


    }


}
