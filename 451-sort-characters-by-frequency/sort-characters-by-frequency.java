class Solution {
    public String frequencySort(String s) {
        Map<Character , Integer> map = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        int max = 0;
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
            max = Math.max(max , map.get(c));
        }
        List<StringBuilder> list = new ArrayList<>();
        for(int i=0;i<=max;i++){
            list.add(new StringBuilder());
        }
        for(Character c : map.keySet()){
            Integer pos = map.get(c);
            StringBuilder sb = list.get(pos);
            for(int i=0;i<pos;i++){
                sb.append(c);
            }
        }
        for(int i = list.size()-1;i>=0;i--){
            if(list.get(i).length()>0)ans.append(list.get(i));
        }
        return ans.toString();
    }
}