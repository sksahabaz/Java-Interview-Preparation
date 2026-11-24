class Solution {
    public int countFriendsPairings(int n) {
     
     if(n <= 2){
         return n;
     }
     int single = countFriendsPairings(n-1);
     int paired = (n-1) * countFriendsPairings(n-2);
     
     return single + paired;
     
        
    }
}
