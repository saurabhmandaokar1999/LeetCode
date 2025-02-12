class Solution {
public:
    int maximumSum(vector<int>& nums) {
        unordered_map<int, int> m;
        int res = 0, n = nums.size();
        for(int i = 0; i < n; i++){
            int sd = sumOfDigit(nums[i]);
            if(m.find(sd) != m.end()){
                res = max(res, nums[i] + nums[m[sd]]);
                if(nums[i] > nums[m[sd]])
                    m[sd] = i; 
            }else
                m[sd] = i;
        }
        return res ? res : -1;
    }
private:
    int sumOfDigit(int num){
        int s = 0;
        while(num){
            s += num % 10;
            num = num / 10;
        }
        return s;
    }

};