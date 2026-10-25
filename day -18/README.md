# Palindrome Number

**Topic:** Math

## Problem Description

Check whether an integer reads the same forward and backward.

## Example

Input: 121 → true; Input: -121 → false

## Approach

A common approach reverses the digits and compares the reversed number with the original. Negative numbers are not palindromes under the usual definition.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](9. Palindrome Number.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(log n)`
- **Space Complexity:** `O(1)`

---
[Back to the DSA problem index](../README.md)
