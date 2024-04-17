public class Merge_Sorted_Array {
    public static int[] MergeSortedArray(int[] num1 , int[] num2 )
    {
        int[] mergedArray=new int[num1.length+num2.length];
        int i=0 , j=0 , k=0;
        while (i<num1.length && j<num2.length) {
            if (num1[i]<num2[i]) {
                mergedArray[k]=num1[i];
                i++;
            }
            else{
                mergedArray[k]=num2[j];
                j++;

            }
            k++;
        }
        while (i<num1.length) {
            mergedArray[k]=num1[i];
            i++;
            k++;
        }
        while (j<num2.length) {
            mergedArray[k]=num2[j];
            j++;
            k++;
        }
        return mergedArray;
    }
    public static void main(String[] args) {
        int[] num1={1,2,3};
        int[] num2={2,5,6};
        int[] mergedArray=MergeSortedArray(num1, num2);
        for (int num : mergedArray) {
            System.out.println(num+" ");
        }

    }

    
}
