# Move Zeroes

**Topic:** Array / Two Pointers

## Problem Description

Move all zeroes to the end of the array while keeping the relative order of non-zero elements.

## Example

Input: [0,1,0,3,12] → Output: [1,3,12,0,0]

## Approach

Use a pointer to track the next position for a non-zero value. Scan the array and place each non-zero value at that position; fill the remaining positions with zeroes.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](Move_zero.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---
[Back to the DSA problem index](../README.md)
