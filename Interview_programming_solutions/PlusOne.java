package InterviewQuestionsJava;

public class PlusOne {
    public static void main(String[] args) {
        int[] num = {9};
        System.out.println(plusOne(num));
    }


    public static int[] plusOne(int[] digits) {


        int n = digits.length;
        int[] newNumber = new int[n ];
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
               newNumber = new int[n ];
                newNumber[0] = 1;
            }

        }
        return newNumber;

    }
}
