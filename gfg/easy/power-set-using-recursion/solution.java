class Solution {
	public ArrayList<String> powerSet(String s) {
		
		ArrayList<String> result = new ArrayList<>();
		solve(0, "",s,result);
		return result;
	}
	
	public static void solve(int i,String current,String s,ArrayList<String> result){
	    
	    if(i == s.length() ){
	        result.add(current);
	        return;
	    }
	    
	    solve(i+1,current+s.charAt(i),s,result);
	    solve(i+1,current,s,result);
	    
	}
}
