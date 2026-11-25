class Solution {
    public static ArrayList<Integer> increasingNumbers(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        if (n == 1) {                         
            for (int d = 0; d <= 9; d++) res.add(d);
            return res;
        }
        if (n > 9) return res;               
        solve(0, 0, n, res);
        return res;
    }

    static void solve(int num, int last, int left, ArrayList<Integer> res) {
        if (left == 0) {                    
            res.add(num);
            return;
        }
        for (int d = last + 1; d <= 9; d++) { 
            solve(num * 10 + d, d, left - 1, res);
        }
    }
}