# Max Consecutive Ones

**Topic:** Array

## Problem Description

Find the maximum number of consecutive 1s in a binary array.

## Example

Input: [1,1,0,1,1,1] → Output: 3

## Approach

Scan once, increasing a current streak when the value is 1 and resetting it to zero otherwise. Keep the maximum streak seen.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](485.Max_Consecutive_Ones.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---
[Back to the DSA problem index](../README.md)
