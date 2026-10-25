# Richest Customer Wealth

**Topic:** Array

## Problem Description

Find the maximum total wealth among all customers.

## Example

Input: [[1,2,3],[3,2,1]] → Output: 6

## Approach

Sum each customer's bank balances, then keep the largest row sum.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](1672. Richest Customer Wealth.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(m·n)`
- **Space Complexity:** `O(1) extra`

---
[Back to the DSA problem index](../README.md)
