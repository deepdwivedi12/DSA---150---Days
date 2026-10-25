# Two Sum — Additional Practice

**Topic:** Array / Hashing

## Problem Description

Find the indices of two values that add up to the target.

## Example

Input: [3,2,4], target = 6 → [1,2]

## Approach

Use a hash map of previously seen values. Before storing the current value, look for its complement target-current.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](1.Two Sum — Additional Practice.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(n) average`
- **Space Complexity:** `O(n)`

---
[Back to the DSA problem index](../README.md)
