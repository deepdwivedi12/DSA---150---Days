# First Missing Positive

**Topic:** Array / Index Placement

## Problem Description

Return the smallest missing positive integer from an unsorted array.

## Example

Input: [3,4,-1,1] → Output: 2

## Approach

Place each value x in the range 1..n at index x-1, swapping until each value is in its correct position or cannot be placed. Scan for the first index i where nums[i] != i+1.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](First_Missing_Positive.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---
[Back to the DSA problem index](../README.md)
