# Find Numbers with Even Number of Digits

**Topic:** Array / Math

## Problem Description

Count numbers containing an even number of digits.

## Example

Input: [12,345,2,6,7896] → Output: 2

## Approach

For each number, count digits by repeatedly dividing by 10, or convert the number to a string and check its length. Count those with an even digit count.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](1295.Find_Numbers_with_Even_Number_of_Digits.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(n·d)`
- **Space Complexity:** `O(1) with arithmetic`

---
[Back to the DSA problem index](../README.md)
