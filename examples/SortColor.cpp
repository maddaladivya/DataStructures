class Solution {
public:
    void sortColors(vector<int>& nums) {
        int zero = 0, two = nums.size()-1;
        for(int i=0;i<nums.size();i++){
            if(nums[i] == 2){
                if(two == i || two < i){
                    two--;
                    continue;
                }
                while( two >= 0 && nums[two] == 2){
                    two--;
                }
                if(two >= 0 && i<two){
                    int temp = nums[i];
                    nums[i] = nums[two];
                    nums[two] = temp;
                    two --;
                    i--;
                }
                
            }
            else if(nums[i] == 0){
                if(zero == i){
                    zero++;
                    continue;
                }
                while(zero >= 0 && nums[zero] == 0){
                    zero++;
                }
                if(zero >= 0){
                    int temp = nums[zero];
                    nums[zero] = nums[i];
                    nums[i] = temp;
                    zero++;
                }
                
            }
        }
    }
};
