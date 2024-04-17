public class Rotate_array {
    public static void rotateRight(int[] nums , int k)
    {
        k=k%nums.length;
        reverse(nums , 0 , nums.length-1);
        reverse(nums , 0 , k-1);
        reverse(nums , k , nums.length-1);
    }
    private static void reverse(int[] nums , int start , int end )
    {
        while (start<end) {
            int h=nums[start];
            nums[start]=nums[end];
            nums[end]=h;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int k=2;
        rotateRight(nums, k);
        for(int num : nums)
        {
            System.out.println(num+" ");
        }
    }
    
}
