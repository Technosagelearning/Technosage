package InterviewQuestionsJava;

public class PalindromeNumber {
    public static void main(String[] args) {

        System.out.println(isPalindrome(10));


    }

   static boolean isPalindrome(int x)
   {
       int temp=x;
       int rev=0;

       while(x>0)
       {
           int digit=x%10;
           rev=(rev*10)+digit;
           x=x/10;
       }
       if(rev==temp)
       {
           return true;
       }
return false;

   }

}
