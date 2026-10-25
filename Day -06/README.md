# Two Sum

**Topic:** Array / Hashing

## Problem Description

Find two indices whose values add up to the target.

## Example

Input: nums = [2,7,11,15], target = 9 → Output: [0,1]

## Approach

Store each previously seen number and its index in a hash map. For each number x, check whether target-x is already stored; if so, return those two indices.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](1. Two Sum.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(n) average`
- **Space Complexity:** `O(n)`

---
[Back to the DSA problem index](../README.md)
