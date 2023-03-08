package InterviewQuestionsJava;

public class PowerOfTwo
{
    public static void main(String[] args)
    {
        int n=1;
        System.out.println(IsPowerOfTwo(n));

    }

    public static boolean IsPowerOfTwo(int n)
    {
        if(n==0)
        {
            return false;
        }

        while(n!=1)
        {
            if(n%2!=0)
            {
                return false;
            }
            else
            {
                n=n/2;
            }
        }
    return true;
    }
}
