class Solution {
    public ArrayList<Integer> fibonacciNumbers(int n) {
    
    //   step:1 base case
    if(n==1){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        return list;
    }
    
    if(n==2){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        return list;
    }
    
    ArrayList<Integer> list = fibonacciNumbers(n-1);
    
    int size = list.size();
    
    list.add(list.get(size-1) + list.get(size-2));
    
    return list;
    
    
    }
}