public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i=0,ptr=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[ptr]=nums[i];
                ptr++;
            }
        }
        return ptr;
    }
}
