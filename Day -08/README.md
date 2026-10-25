# Roman to Integer

**Topic:** String

## Problem Description

Convert a Roman numeral to an integer.

## Example

Input: "MCMXCIV" → Output: 1994

## Approach

Scan from left to right. If a symbol is smaller than the next symbol, subtract it; otherwise add its value. Sum the values to get the result.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](13.Roman_to_Integer.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---
[Back to the DSA problem index](../README.md)
