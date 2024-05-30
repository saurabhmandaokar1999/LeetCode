class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        vector<bool> boolArray;
        int maxCandies = *std::max_element(candies.begin(), candies.end());
        for(int i = 0 ; i<candies.size() ; i++){
        if (candies[i] + extraCandies >= maxCandies) {
             boolArray.push_back(true);
        } else {
             boolArray.push_back(false);
        }
        }
        return boolArray;
    }
};