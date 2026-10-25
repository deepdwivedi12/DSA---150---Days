# Valid Parentheses

**Topic:** Stack

## Problem Description

Determine whether every opening bracket is closed by the same type of bracket in the correct order.

## Example

Input: "()[]{}" → true

## Approach

Push opening brackets onto a stack. For each closing bracket, the stack must be non-empty and its top must be the matching opening bracket. The stack must be empty at the end.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](20.Valid_Parentheses.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`

---
[Back to the DSA problem index](../README.md)
