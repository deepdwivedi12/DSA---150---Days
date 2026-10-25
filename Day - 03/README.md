# Rotate Array

**Topic:** Array

## Problem Description

Rotate the array to the right by k positions.

## Example

Input: nums = [1,2,3,4,5,6,7], k = 3 → [5,6,7,1,2,3,4]

## Approach

Reduce k using k % n. Reverse the whole array, then reverse the first k elements and the remaining n-k elements.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](189.Rotate_Array.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---
[Back to the DSA problem index](../README.md)
