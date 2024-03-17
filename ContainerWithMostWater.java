public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int a = 0, t=0;
        for (int i=0, j=height.length-1; i<j;){
            //int l = Math.min(height[i],height[j]);
            //int b = j-i;
            t = Math.min(height[i],height[j]) * (j-i);
            a = Math.max(t,a);
            if(height[i]>height[j]) 
                j--;
            // else if(height[i]<height[j]) 
            //     i++;
            else{
                i++;// j--;
            }
        }
        // for (int i=0; i<height.length-1; i++){
        //     for (int j=i+1; j<height.length; j++){
        //         if(height[i]<height[j]){
        //             int t = height[i]*(j-i);
        //             if(t > a){
        //                 a = t;
        //             }
        //         }
        //         else{
        //             int t = height[j]*(j-i);
        //             if(t > a){
        //                 a = t;
        //             }
        //         }
        //     }
        // }
        return a;
    }
}
