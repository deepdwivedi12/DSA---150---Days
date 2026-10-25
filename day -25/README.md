# Search in Rotated Sorted Array

**Topic:** Array / Binary Search

## Problem Description

Search for a target in a rotated sorted array with distinct values in logarithmic time.

## Example

Input: nums = [4,5,6,7,0,1,2], target = 0 → Output: 4

## Approach

At each binary-search step, determine which half is sorted. Check whether the target lies in that half and discard the other half.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](33.Search in Rotated Sorted Array.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(log n)`
- **Space Complexity:** `O(1)`

---
[Back to the DSA problem index](../README.md)
