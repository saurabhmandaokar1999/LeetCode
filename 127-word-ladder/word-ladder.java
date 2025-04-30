class Pair {
    String first;
    int second;
    Pair(String _first, int _second) {
        this.first = _first;
        this.second = _second;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q = new LinkedList<>();
        Set<String> set = new HashSet<>();
        wordList.forEach(str->set.add(str));
        q.offer(new Pair(beginWord,1));
        set.remove(beginWord);

        while(!q.isEmpty()){
            Pair p = q.poll();
            String curr = p.first;
            Integer l= p.second;
            if (curr.equals(endWord)) return l;
            for(int i =0;i<curr.length();i++){
                for(char chr = 'a';chr<='z';chr++){
                    char[] charArr = curr.toCharArray();
                    charArr[i]=chr;
                    String s = new String(charArr);
                    if(set.contains(s)){
                        set.remove(s);
                        q.offer(new Pair(s,l+1));
                    }
                }
            }
        }
        return 0;
    }
}