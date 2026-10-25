# Concatenation of Array

**Topic:** Array

## Problem Description

Return an array formed by appending the array to itself.

## Example

Input: [1,2,1] → Output: [1,2,1,1,2,1]

## Approach

Create an array of length 2n. For every i, copy nums[i] to both ans[i] and ans[i+n].

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](1929. Concatenation of Array.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

---
[Back to the DSA problem index](../README.md)
