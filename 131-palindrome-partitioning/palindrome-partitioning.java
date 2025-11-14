class Solution {
    public List<List<String>> partition(String s) {
      List<List<String>> ans = new ArrayList();
      int len = s.length();
      helper(0, ans, new ArrayList(), s, len);
      return ans;
    }
    public void helper(int idx,List<List<String>> ans, List<String> curr,String s, int len ){
        if(idx == len ){
            ans.add(new ArrayList(curr));
            return;
        }
        for(int i = idx ; i < len ; i++){
            if(isPali(s, idx, i)){
                curr.add(s.substring(idx,i+1));
                helper(i+1, ans, curr, s, len);
                curr.remove(curr.size()-1);
            }
        }
    }
    public boolean isPali(String s , int start , int end){
        while(start < end){
            if(s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }
}