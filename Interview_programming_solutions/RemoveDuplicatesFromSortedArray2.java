package InterviewQuestionsJava;

public class RemoveDuplicatesFromSortedArray2 {

   public static void main(String[] args)
   {
      int nums[]={0,0,1,1,1,1,2,3,3};
      System.out.println(removeDuplicates(nums));


   }

   public static int removeDuplicates(int[] nums)
   {
      int i=0;
      for(int n:nums)
      {
         if(i<2 || n!=nums[i-2])
         {
            nums[i++]=n;
         }
      }
      return i;

      }





   }



