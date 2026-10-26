class Solution {
    public boolean checkPermutation(int[] a, int[] b) {
    
    Arrays.sort(a);
    Arrays.sort(b);
    
    int i=0,j =0;
    
    while(i<a.length && j<b.length){
        if(a[i] != b[j]){
            return false;
        }
        i++;
        j++;
    }
    return true;
        
    }
}