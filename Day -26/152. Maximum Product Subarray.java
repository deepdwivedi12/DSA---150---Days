
class Solution {
    public int maxProduct(int[] nums) {
        int larg = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int product = 1;

            for (int j = i; j < nums.length; j++) {
                product = product * nums[j];

                if (product > larg) {
                    larg = product;
                }
            }
        }

        return larg;
    }
}
