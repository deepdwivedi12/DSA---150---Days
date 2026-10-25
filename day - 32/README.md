# Squares of a Sorted Array

**Topic:** Array / Two Pointers

## Problem Description

Return the squares of a sorted array in non-decreasing order.

## Example

Input: [-4,-1,0,3,10] → [0,1,9,16,100]

## Approach

Compare the absolute values at both ends. Place the larger square at the end of the result, then move the corresponding pointer inward.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](977. Squares of a Sorted Array.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

---
[Back to the DSA problem index](../README.md)
