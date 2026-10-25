# Maximum 69 Number

**Topic:** Math / Greedy

## Problem Description

Given a number containing only 6 and 9, maximize it by changing at most one digit from 6 to 9.

## Example

Input: 9669 → Output: 9969

## Approach

Change the first (leftmost) 6 to 9, because the leftmost digit has the greatest place value. If there is no 6, keep the number unchanged.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](https://github.com/deepdwivedi12/DSA---150---Days/blob/main/1323.%20Maximum%2069%20Number.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(d)`
- **Space Complexity:** `O(1)`

---
[Back to the DSA problem index](../../README.md)
