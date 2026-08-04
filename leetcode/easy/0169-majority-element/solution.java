class Solution {
    public static int majorityElement(int[] nums) {
         
            int n = nums.length;
    int count =0;
    int element = 0;
    for(int i=0;i<n;i++){
        if(count == 0){
            element = nums[i];
            count =1;

        }else if(element == nums[i]){
            count++;
        }else{
            count--;
        }
    }
       
       
      int count1 =0;
      for(int i=0;i<n;i++){
        if(element == nums[i]){
            count1++;
        }
      }
      if(count1 > n/2){
        return element;
      }

      return -1;
    }
        public static void main(String args[]){
            int nums[]= {2,2,2,1,1,2,2,2};
          
        }
    
}