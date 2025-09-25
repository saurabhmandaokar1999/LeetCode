class Solution {
    public int[] gridIllumination(int n, int[][] lamps, int[][] queries) {
        //row map
        Map<Integer,Integer> r= new HashMap<>();
        //col map
        Map<Integer,Integer> c= new HashMap<>();
        //l-r diagonal Map
        Map<Integer,Integer> ltr= new HashMap<>();
        //r-l diagonal
        Map<Integer,Integer> rtl= new HashMap<>();
        //Set of unique value
        Set<String> set = new HashSet<>();
        for(int[] on : lamps){
           int x = on[0];
           int y = on[1];
           String s = String.valueOf(x)+','+String.valueOf(y);
           if(!set.contains(s)){
                set.add(s);
            //put in row
                r.put(x,r.getOrDefault(x,0)+1);
                //put in col
                c.put(y,c.getOrDefault(y,0)+1);
                //put in l-r
                int d1 = x-y;
                ltr.put(d1,ltr.getOrDefault(d1,0)+1);
                //rtl
                int d2 = x+y;
                rtl.put(d2,rtl.getOrDefault(d2,0)+1);
           }
        }
        //Switching off lights
        int[] ans = new int[queries.length];
        int counter=0;
        for(int[] off: queries){
            int x = off[0];
            int y = off[1];
            if(r.getOrDefault(x,0) > 0 || c.getOrDefault(y,0) > 0 || ltr.getOrDefault(x-y,0) > 0 || rtl.getOrDefault(x+y,0) > 0){
                ans[counter++]=1;
            }else{
                ans[counter++]=0;
            }
        int[] colMove = new int[]{-1,0,1};
        int[] rowMove = new int[]{-1,0,1};
        for(int row:rowMove){
            for(int col:colMove){
                    int currX=x+row;
                    int currY=y+col;
                    String currStr = String.valueOf(currX)+','+String.valueOf(currY);
                    if(set.contains(currStr)){
                        set.remove(currStr);
                        r.put(currX,r.getOrDefault(currX,0)-1);
                        c.put(currY,c.getOrDefault(currY,0)-1);

                        int dia1 = currX-currY;
                        ltr.put(dia1,ltr.getOrDefault(dia1,0)-1);

                        int dia2 = currX+currY;
                        rtl.put(dia2,rtl.getOrDefault(dia2,0)-1);
                    }
            }
        }
        }
        return ans;
    }

}