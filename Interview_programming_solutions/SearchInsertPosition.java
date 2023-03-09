package InterviewQuestionsJava;

public class SearchInsertPosition
{

    public static void main(String[] args)
    {
        int[] nums={1,2,5,6};
        int target=3;
        System.out.println(searchInsert(nums,target));

    }

    public static int searchInsert(int[] nums, int target)
    {
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
           else if(nums[mid]<target)
            {
                start=mid+1;
            }
           else
            {
                end=mid-1;
            }
        }
        return start;
    }
}
