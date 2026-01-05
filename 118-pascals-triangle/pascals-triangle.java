class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>(Arrays.asList(1)));
        if(numRows < 2) return ans;
        ans.add(new ArrayList<>(Arrays.asList(1, 1)));
        makePascal(numRows-2, ans);
        return ans;
    } 
    public void makePascal(int n , List<List<Integer>> ans){
        if(n == 0)  return;
        int len = ans.size();
        List<Integer> temp = ans.get(len-1);
        List<Integer> curr = new ArrayList<>();
        curr.add(1);
        for(int i = 1 ; i < len ; i++){
            curr.add(temp.get(i)+temp.get(i-1));
        }
        curr.add(1);
        ans.add(curr);
        makePascal(n-1,ans);
    }
}