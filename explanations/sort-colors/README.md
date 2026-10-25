# Sort Colors

**Topic:** Array / Three Pointers

## Problem Description

Sort an array containing only 0s, 1s, and 2s in-place.

## Example

Input: [2,0,2,1,1,0] → [0,0,1,1,2,2]

## Approach

Use low, mid, and high pointers to group 0s at the start, 2s at the end, and leave 1s in the middle.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](https://github.com/deepdwivedi12/DSA---150---Days/blob/main/75.Sort%20Colors.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---
[Back to the DSA problem index](../../README.md)
