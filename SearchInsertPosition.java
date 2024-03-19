public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int i=0, j=nums.length-1,p=0,k=0;
        while(i<=j){
            p=(i+j)/2;
            if(nums[p]==target)
                return p;
            if(target>nums[p]){
                i=p+1;
            }
            else{
                j=p-1;
            }
        }
        return i;
    }
}
