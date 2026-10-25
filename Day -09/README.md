# Longest Consecutive Sequence

**Topic:** Array / HashSet

## Problem Description

Find the length of the longest sequence of consecutive integers in an unsorted array.

## Example

Input: [100,4,200,1,3,2] → Output: 4

## Approach

Put all values in a set. Start counting only from values whose predecessor is absent, then keep checking consecutive values in the set.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](128.Longest_Consecutive.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(n) average`
- **Space Complexity:** `O(n)`

---
[Back to the DSA problem index](../README.md)
