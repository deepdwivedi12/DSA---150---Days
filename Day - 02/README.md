# Majority Element

**Topic:** Array / Voting

## Problem Description

Find the element that appears more than ⌊n/2⌋ times.

## Example

Input: [3,2,3] → Output: 3

## Approach

Boyer–Moore Voting: maintain a candidate and a counter. When the counter reaches zero, choose the current value as candidate; matching values increase the counter and different values decrease it.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](168.Majority_Element.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---
[Back to the DSA problem index](../README.md)
