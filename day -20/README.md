# Remove Element

**Topic:** Array / Two Pointers

## Problem Description

Remove all occurrences of a specified value in-place and return the remaining length.

## Example

Input: nums = [3,2,2,3], val = 3 → unique prefix [2,2], return 2

## Approach

Use a write index. Scan each element and copy it forward only if it is not equal to val.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](27.Remove Element.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---
[Back to the DSA problem index](../README.md)
