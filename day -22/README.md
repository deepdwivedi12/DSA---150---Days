# Subtract the Product and Sum of Digits

**Topic:** Math

## Problem Description

Return the product of an integer's digits minus the sum of its digits.

## Example

Input: n = 234 → product 24, sum 9, result 15

## Approach

Extract each digit using n % 10. Update the digit product and digit sum, then subtract the sum from the product.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](1281.Subtract the Product and Sum of Digits of an Integer.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(d)`
- **Space Complexity:** `O(1)`

---
[Back to the DSA problem index](../README.md)
