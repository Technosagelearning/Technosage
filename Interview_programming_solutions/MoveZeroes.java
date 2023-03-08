package InterviewQuestionsJava;
import java.util.Arrays;
public class MoveZeroes {
    public static void main(String[] args) {


    }

    public static void MoveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }

        }

        while (count < nums.length) {
            nums[count++] = 0;
        }

    }
}



