class Solution {
    public int repeatedStringMatch(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        int count = 1;
        StringBuilder sb = new StringBuilder(a);
        while(lenA < lenB){
            sb.append(a);
            lenA += a.length();
            count++;
        }
        int ans = -1;
        for(int i=0; i+lenB <= sb.length();i++){
            if(sb.substring(i,i+lenB).equals(b)){
                return count;
            }
        }
        //check for overlap cases
        sb.append(a);
        count++;
        for(int i=0; i+lenB <= sb.length();i++){
            if(sb.substring(i,i+lenB).equals(b)){
                return count;
            }
        }
        return -1;
    }
}