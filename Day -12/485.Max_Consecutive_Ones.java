class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& arr) {
        int count = 0;
        int maxcount = 0;
        
        for(int i = 0; i < arr.size();i++ ){
            if(arr[i] == 1){
                count++;
                maxcount = max(count,maxcount);
            }
            else{
                count = 0;
            }
        } 

        return maxcount;
    }
        
    
};
