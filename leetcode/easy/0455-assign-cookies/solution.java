class Solution {
    public int findContentChildren(int[] g, int[] s) {
         
    int l=0,r=0;

       Arrays.sort(g);
       Arrays.sort(s);  
      while(l<g.length && r<s.length){
        if(s[r] >= g[l]){
            l++;
            r++;
        }else{
            r++;
        }
      }
   return l;

    }
}