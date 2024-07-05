public class SortedRotated {
     
        public boolean check(int[] nums) {
            int c=0;
            int same=0;
            for(int i=0;i<nums.length-1;i++){
                 if(nums[i+1]<nums[i]) c++;
            }
            if(nums[0]<nums[nums.length-1]) c++;
            
            if(c>1) return false;
            return true;
           
        }
    
}
