# Count Odd Numbers in an Interval Range

**Topic:** Math

## Problem Description

Count odd integers in the inclusive range [low, high].

## Example

Input: low = 3, high = 7 → Output: 3

## Approach

The number of odd integers from 0 through x is (x+1)/2 using integer division. Subtract the count before low from the count through high.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](1523. Count Odd Numbers in an Interval Range.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(1)`
- **Space Complexity:** `O(1)`

---
[Back to the DSA problem index](../README.md)
