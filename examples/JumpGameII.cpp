class Solution {
public:
    int jump(vector<int>& nums) {
        int i = nums.size()-1;
        int steps = 0;
        while(i){
            int x;
            for(int j=i-1; j>=0;j--){
                if(i - j <= nums[j]){
                    x = j;
                }
                // cout << x << endl;
            }
            // cout << x << endl;
            steps++;
            i = x;
        }
        return steps;
    }
};
