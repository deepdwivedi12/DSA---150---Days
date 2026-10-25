# Check If Two String Arrays Are Equivalent

**Topic:** String / Arrays

## Problem Description

Determine whether concatenating all strings in two arrays produces the same string.

## Example

Input: word1 = ["ab","c"], word2 = ["a","bc"] → true

## Approach

Compare the concatenated strings, or iterate through characters across both arrays without creating large combined strings.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](1662. Check If Two String Arrays are Equivalent.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(total characters)`
- **Space Complexity:** `O(total characters) if concatenating`

---
[Back to the DSA problem index](../README.md)
