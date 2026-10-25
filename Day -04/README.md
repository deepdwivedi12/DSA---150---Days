# Next Permutation

**Topic:** Array / Two Pointers

## Problem Description

Rearrange numbers into the next lexicographically greater permutation; if none exists, return the smallest permutation.

## Example

Input: [1,2,3] → [1,3,2]

## Approach

Find the rightmost index i where nums[i] < nums[i+1]. Find the rightmost value greater than nums[i], swap them, then reverse the suffix after i. If no such i exists, reverse the whole array.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](31. Next_Permutation.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---
[Back to the DSA problem index](../README.md)
