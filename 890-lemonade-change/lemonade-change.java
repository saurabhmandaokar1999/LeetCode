class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f = 0; 
        int t = 0; 

        for (int i : bills) {
            switch (i) {
                case 5:
                    f++;
                    break;

                case 10:
                    if (f <= 0) return false;
                    f--;
                    t++;
                    break;

                case 20:
                    if (t > 0 && f > 0) {
                        t--;
                        f--;
                    } else if (f >= 3) {
                        f -= 3;
                    } else {
                        return false;
                    }
                    break;
            }
        }
        return true;
    }
}
