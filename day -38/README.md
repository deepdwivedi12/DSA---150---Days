# Maximum Subarray

**Topic:** Array / Dynamic Programming / Kadane's Algorithm

## Problem Description

Given an integer array `nums`, find the contiguous subarray with the largest sum and return its sum.

## Example

Input: `[-2,1,-3,4,-1,2,1,-5,4]` → Output: `6`

## Approach

Traverse the array using a single loop and maintain a running sum. Update the maximum sum whenever the current sum is greater than the previous maximum. If the running sum becomes negative, reset it to zero.

## Dry Run

For the array `[-2,1,-3,4,-1,2,1,-5,4]`:

| Element | Running Sum | Maximum Sum |
|---:|---:|---:|
| -2 | -2 → 0 | -2 |
| 1 | 1 | 1 |
| -3 | -2 → 0 | 1 |
| 4 | 4 | 4 |
| -1 | 3 | 4 |
| 2 | 5 | 5 |
| 1 | 6 | 6 |
| -5 | 1 | 6 |
| 4 | 5 | 6 |

The maximum subarray is `[4,-1,2,1]`, and its sum is `6`.

## Java Solution

[Open Java solution](53.%20Maximum%20Subarray.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`

---

[Back to the DSA problem index](../README.md)
