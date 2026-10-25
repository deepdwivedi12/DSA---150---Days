# Median of Two Sorted Arrays

**Topic:** Array / Binary Search

## Problem Description

Find the median of two sorted arrays with logarithmic time complexity.

## Example

Input: nums1 = [1,3], nums2 = [2] → Output: 2.0

## Approach

Use binary search on the smaller array to find a partition where all left-side values are no greater than right-side values. Derive the median from the partition boundary values.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](4.Median_of_Two_Sorted_Arrays.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(log(min(m,n)))`
- **Space Complexity:** `O(1)`

---
[Back to the DSA problem index](../README.md)
