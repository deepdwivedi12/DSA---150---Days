# Search Insert Position

**Topic:** Array / Binary Search

## Problem Description

Return the target's index in a sorted array, or the index where it should be inserted.

## Example

Input: nums = [1,3,5,6], target = 2 → Output: 1

## Approach

Use binary search. If the target is found, return its index; otherwise, the lower-bound insertion position is the left pointer after the loop.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](35. Search Insert Position.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(log n)`
- **Space Complexity:** `O(1)`

---
[Back to the DSA problem index](../README.md)
