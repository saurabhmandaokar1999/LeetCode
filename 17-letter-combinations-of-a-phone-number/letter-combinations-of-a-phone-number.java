class Solution {
    static String [] key = {" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"}; 
    public List<String> letterCombinations(String digits) {
        int[] dig = new int[digits.length()];
        int i =0;
        for(char c : digits.toCharArray()){
            dig[i++] = c -'0';

        } 
        List<String> ans = new ArrayList<>();
        if (digits.isEmpty()) return ans;
        helper(dig,new StringBuilder(),0,ans);
        return ans;


    }
    public void helper(int[] dig,StringBuilder temp,int count,List<String> ans){
        if(count == dig.length){
            ans.add(temp.toString());
            return;
        }
        for(char c : key[dig[count]].toCharArray()){
            temp.append(c);
            helper(dig,temp,count+1,ans);
            temp.deleteCharAt(temp.length()-1);
        }
    }
} 