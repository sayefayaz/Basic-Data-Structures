public class Find_The_Missing_Number{
    public static int  fingMissingNumber(int[] nums) {
      
        int n=nums.length;
        boolean[] found=new boolean[n+1];
        for(int num:nums)
        {
            if (num<n) {
                found[num]=true;
            }
        }
        for(int i=0 ; i<found.length ; i++)
        {
            if (!found[i]) {
                return i;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int[] nums={5,2,0,3,1};
        int missingNumber=fingMissingNumber(nums);
        System.out.println(missingNumber);
    }

}

