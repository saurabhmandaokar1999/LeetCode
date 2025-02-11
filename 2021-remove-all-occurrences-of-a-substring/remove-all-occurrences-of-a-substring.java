class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        int p = 0;
        int lenP =part.length();
        int q =0;
        while(q<sb.length()){
            if(sb.charAt(q)!=part.charAt(0)){
                q++;
            }else if(q+lenP<=sb.length()){
                String temp = sb.substring(q,q+lenP).toString();
                if(temp.equals(part)){
                    sb.delete(q,q+lenP);
                    q=p;
                }else{
                    q++;
                }
            }else{q++;}
        }
        return sb.toString();
    }
}