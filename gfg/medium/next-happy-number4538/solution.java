class Solution {
    public int nextHappy(int n) {
        int x = n + 1;
        while (!isHappy(x)) x++;        
        return x;
    }

    private boolean isHappy(int x) {
        if (x == 1) return true;           
        if (x == 4) return false;       
        return isHappy(sumSq(x));          
    }

    private int sumSq(int x) {
        if (x == 0) return 0;             
        int d = x % 10;                    
        return d * d + sumSq(x / 10);      
}
}