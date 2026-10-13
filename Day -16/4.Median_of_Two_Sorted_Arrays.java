import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] arr = new int[nums1.length + nums2.length];

        int k = 0;

        // Copy nums1
        for (int i = 0; i < nums1.length; i++) {
            arr[k++] = nums1[i];
        }

        // Copy nums2
        for (int i = 0; i < nums2.length; i++) {
            arr[k++] = nums2[i];
        }

        // Sort the array
        Arrays.sort(arr);

        int n = arr.length;

        // Odd
        if (n % 2 == 1) {
            return arr[n / 2];
        }

        // Even
        return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
    }
}
