class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        int n = arr.length;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=1;i<=n;i++){
            map.put(i,0);
        }
        
        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
        }
        
        ArrayList<Integer> al = new ArrayList<>();
        
        for( int value: map.values()){
            al.add(value);
        }
        
        return al;
    }
}
