class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

    int n = nums.length;
    int [] result = new int[n-k+1];
                   
    Deque<Integer> deque  = new ArrayDeque<>();

    int resultIndex = 0;
     for(int i=0;i<n;i++){
 while(!deque.isEmpty() && deque.peekFirst() < i-k+1){
    deque.removeFirst();
 }
while(!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]){
    deque.removeLast();
}
 deque.addLast(i);
if( i>=k-1){
    result[resultIndex] =nums[deque.peekFirst()];
    resultIndex++;
}

    }    
  
   return result;



    }
}