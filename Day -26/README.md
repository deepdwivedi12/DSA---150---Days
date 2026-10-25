# Maximum Product Subarray

**Topic:** Array / Dynamic Programming

## Problem Description

Find the contiguous subarray with the largest product.

## Example

Input: [2,3,-2,4] → Output: 6

## Approach

Track both the maximum and minimum product ending at each position because multiplying by a negative number can swap their roles. Update the global maximum at each step.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](152. Maximum Product Subarray.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---
[Back to the DSA problem index](../README.md)
