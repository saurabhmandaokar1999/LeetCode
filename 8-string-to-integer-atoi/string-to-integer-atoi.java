class Solution {
    public int myAtoi(String s) {

        return myAH(s.trim(),0,0,1);
    }
    public int myAH(String s , int index ,int result,int sign){
        //If out of leangth then return
        if(index>=s.length()){
            return result * sign;
        }
        char tempChar=s.charAt(index);

        if(index ==0 && (tempChar=='-' || tempChar=='+')){
            return myAH(s,++index,result, tempChar=='-'?-1:1);
        }
        if(!Character.isDigit(tempChar)){
            return result*sign;
        }

        int val = tempChar-'0';
        if(result>(Integer.MAX_VALUE-val)/10){
            return sign==1 ? Integer.MAX_VALUE:Integer.MIN_VALUE;
        }
        result=(result*10)+val;
        return myAH(s,++index,result,sign);
    }
}