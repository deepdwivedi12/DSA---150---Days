# Build Array from Permutation

**Topic:** Array

## Problem Description

Build an array where ans[i] = nums[nums[i]].

## Example

Input: nums = [0,2,1,5,3,4] → Output: [0,1,2,4,5,3]

## Approach

Create a result array and for each index i assign nums[nums[i]].

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](1920.Build Array from Permutation.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

---
[Back to the DSA problem index](../README.md)
