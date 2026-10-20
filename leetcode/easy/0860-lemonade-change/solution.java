class Solution {
    public boolean lemonadeChange(int[] bills) {
        
    int five =0,ten = 0;
    
   for(int i=0;i<bills.length;i++){
    if(bills[i] == 5){
        five--;
    }else if(bills[i] == 10 && five !=0){
        five--;
        ten++;
    }else if(bills[i] == 20){
             if( five == 0 && ten ==0){
                return false;
             }else{
                ten--;
                five--;
                
             }
    }
   }
      return true;
    }
}