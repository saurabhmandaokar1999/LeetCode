class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> ans = new ArrayList<>();
        helper(0,"",0,0,num,target,ans);
        return ans;
    }
    public void helper(int index, String resString, long resSoFar, long prevNum, String num, int target,List<String> ans){
        if(index==num.length()){
            if(resSoFar==target){
                ans.add(resString);
            }
            return;
        }

        for(int i =index;i<num.length();i++){

            if(i>index && num.charAt(index)=='0') break;
            
            long temp = Long.parseLong(num.substring(index, i + 1));
            
            if(index==0){
                helper(i+1,resString+temp,temp,temp,num,target,ans);
            }else{
            
                helper(i+1,resString+"+"+temp,resSoFar+temp,temp,num,target,ans);
            
                helper(i+1,resString+"-"+temp,resSoFar-temp,-temp,num,target,ans);
            
                helper(i+1,resString+"*"+temp,(resSoFar-prevNum+(prevNum*temp)),temp*prevNum,num,target,ans);
            }

        }
    }
}