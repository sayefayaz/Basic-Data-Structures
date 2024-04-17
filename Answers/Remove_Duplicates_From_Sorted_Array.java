public class Remove_Duplicates_From_Sorted_Array {
    public static int RemoveDuplicates(int[] nums)
    {
        if (nums.length==0) {
            return 0;
        }
        int index=0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]!=nums[index]) {
                index++;
                nums[index]=nums[i];
            }
        }
        return index+1;

    }
    public static void main(String[] args) {
        int[ ] nums={1,1,2,2,3,4,5,5};
        int newlength=RemoveDuplicates(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]+" ");
        }
    }

}
