# Missing Number

**Topic:** Array / Math / XOR

## Problem Description

Find the missing number from values in the range 0 through n.

## Example

Input: [3,0,1] → Output: 2

## Approach

Compare the expected sum n(n+1)/2 with the actual sum, or XOR all indices and values so matching values cancel out.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](268. Missing Number.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---
[Back to the DSA problem index](../README.md)
