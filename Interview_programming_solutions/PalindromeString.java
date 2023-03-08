package InterviewQuestionsJava;

public class PalindromeString {
    public static void main(String[] args) {
        String str="Rotor";
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        if(str.toLowerCase().equals(rev.toLowerCase()))
        {
            System.out.println("Palindrome String");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
