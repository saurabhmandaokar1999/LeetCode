class Solution {
    public boolean checkValidString(String s) {
       //for this if we ues reccursion we will have tiem complexiety
       //of n^3 and space of n 
       //if we use dp we have n^2 for both time and space complexiety
       //SO to optimize for this question we use range of total parenthesis 
       //min will never go below -1
       int min=0;
       int max=0;
       for(char c : s.toCharArray()){
        if(c=='('){
            min++;
            max++;
        }else if(c==')'){
            min--;
            max--;
        }else{
            max++;
            min--;
        }
        if(max<0) return false;
       if(min<0) min=0;
       }
       return min==0;
    }
}