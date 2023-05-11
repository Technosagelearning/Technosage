package InterviewQuestionsJava;

import java.util.Arrays;

public class distinctDifferenceArray {
    public static void main(String[] args)
    {
        int[] nums={3,2,3,4,2};
        System.out.println(Arrays.toString(distinctDifferenceArray(nums)));

    }

    public static int[] distinctDifferenceArray(int[] nums) {

        int n = nums.length;
        int[] diff = new int[nums.length];
        for (int i = 0; i < n; i++) {
            int countPrefix = countDistinctElements(nums, 0, i);
            int countSuffix = countDistinctElements(nums, i + 1, nums.length - 1);
            diff[i] = countPrefix - countSuffix;
        }

        return diff;
    }

    private static int countDistinctElements(int[] nums, int start, int end) {
        boolean[] visited = new boolean[100000];
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (!visited[nums[i]]) {
                visited[nums[i]] = true;
                count++;
            }
        }
        return count;
    }
}

