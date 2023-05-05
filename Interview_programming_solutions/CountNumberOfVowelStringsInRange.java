package InterviewQuestionsJava;

public class CountNumberOfVowelStringsInRange
{
    public static void main(String[] args)
    {
        String words[]={"hey","aeo","mu","ooo","artro"};
        int left=1;
        int right=4;
        System.out.println(VowelStrings(words,left,right));


    }



    public static int VowelStrings(String[] words, int left, int right)
    {

        int count=0;
        for(int i=left;i<=right;i++)
        {
            int s=words[i].charAt(0);
            int e=words[i].charAt(words[i].length()-1);

            if(s =='a' || s=='e' || s=='i' || s=='o' || s=='u')
            {
                if(e=='a' || e=='e' || e=='i' || e=='o' || e=='u')
                {
                    count++;
                }
            }

        }
        return count;

}


}
