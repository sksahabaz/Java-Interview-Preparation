class Solution {
    public int scoreOfString(String s) {

     int i =0;
     int sum=0;
     for(int j=1;j<s.length();j++){
        sum+=Math.abs(s.charAt(i) - s.charAt(j));
        i++;
     }   
  return sum;

    }
}