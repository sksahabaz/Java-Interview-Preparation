class Solution {
    static int nthFibonacci(int n) {
        
      
        
      
      // Base condition
            if (n <= 1) {
                return n;
            }

            // Recursive call
            return nthFibonacci(n - 1) + nthFibonacci(n - 2);

        
    }
}
