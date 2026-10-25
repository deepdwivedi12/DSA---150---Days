# Running Sum of 1D Array

**Topic:** Array / Prefix Sum

## Problem Description

Return an array where each element is the sum of all input values up to that index.

## Example

Input: [1,2,3,4] → Output: [1,3,6,10]

## Approach

Keep a running total and add each current element to the total; store that total as the corresponding output.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](1480.Running_Sum_of_1D_Array.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n) for output`

---
[Back to the DSA problem index](../README.md)
