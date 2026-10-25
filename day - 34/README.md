# Add Digits

**Topic:** Math / Digital Root

## Problem Description

Repeatedly add the digits of a non-negative integer until one digit remains.

## Example

Input: 38 → 3+8=11 → 1+1=2 → Output: 2

## Approach

The digital-root formula gives 0 for n=0; otherwise use 1 + (n-1) % 9. A loop that repeatedly sums digits is another option.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](258. Add Digits.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(1) with formula`
- **Space Complexity:** `O(1)`

---
[Back to the DSA problem index](../README.md)
