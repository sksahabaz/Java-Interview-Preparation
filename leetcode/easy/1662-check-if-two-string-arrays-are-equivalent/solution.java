class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

    String s = "";

   for(int i=0;i<word1.length;i++){
   
    s+= word1[i];

   }
    
   String t = "" ;
  for(int i=0;i<word2.length;i++){
    t+=word2[i];
  }
  
  return s.equals(t);






    }
}


// what i am thinking is i need to concatend the word1 and word2 
// then after that i need to check whether they are equal or not
//if equal then i need to return true if not then i return false;