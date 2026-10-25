# Subarray Sum Equals K

**Topic:** Array / Prefix Sum / HashMap

## Problem Description

Count contiguous subarrays whose sum equals k.

## Example

Input: nums = [1,1,1], k = 2 → Output: 2

## Approach

Maintain a running prefix sum. For each prefix sum s, add the number of earlier prefix sums equal to s-k. Store the frequency of each prefix sum as you scan.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](560.Subarray_Sum_Equals_K.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(n) average`
- **Space Complexity:** `O(n)`

---
[Back to the DSA problem index](../README.md)
