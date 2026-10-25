# Remove Duplicates from Sorted Array

**Topic:** Array / Two Pointers

## Problem Description

Remove duplicates in-place from a sorted array and return the number of unique elements.

## Example

Input: [1,1,2] → unique prefix [1,2], return 2

## Approach

Use a write pointer for the next unique position. Scan the array; when a value differs from the last written unique value, write it at the next position.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](26.Remove Duplicates from Sorted Array.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---
[Back to the DSA problem index](../README.md)
