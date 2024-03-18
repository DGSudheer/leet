public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        // int i=0,ptr=0;
        // for(i=0;i<nums.length;i++){
        //     if(nums[i]!=val){
        //         nums[ptr]=nums[i];
        //         ptr++;
        //     }
        // }
        // return ptr;

        // method 2
        int start=0, end=nums.length, temp=0;
        while(start<end){
            if(nums[start]==val){
                temp=nums[start];
                nums[start]=nums[end-1];
                nums[end-1]=temp;
                end--;
            }
            else{
                start++;
            }
        }
        return start;
    }
}
