package InterviewQuestionsJava;

public class ReverseAnInteger

{
    public static void main(String[] args)
    {
        System.out.println(reverse(1000000045));
    }
    static int reverse(int x)
    {
        int rev=0;
        while(x!=0)
        {
            int digit=x%10;
            rev= (rev*10)+digit;
            x=x/10;
        }


        return rev;
        }
    }




