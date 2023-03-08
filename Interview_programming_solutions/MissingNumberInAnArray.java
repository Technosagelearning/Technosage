package InterviewQuestionsJava;
public class MissingNumberInAnArray {
    public static void main(String[] args) {
       int arr[]={1,2,4,5,7,6,8};
       int n=arr.length+1;
       int TotalSum=n*(n+1)/2;
       int sum=0;
       for(int i=0;i<arr.length;i++)
       {
           sum=sum+arr[i];
       }

       int missingnum=TotalSum-sum;
       System.out.println(missingnum);
    }
}
