package InterviewQuestionsJava;

public class Adddigits
{
    public static void main(String[] args)
    {
        int num=3854;
        System.out.println(addDigits(num));

    }

    public static int addDigits(int num)
    {
        if(num==0)
        {
            return 0;
        }

        return (num%9==0)?9:num%9;
    }


}
