# Isomorphic Strings

**Topic:** String / Hashing

## Problem Description

Check whether characters in one string can be consistently replaced to form the other string.

## Example

Input: s = "egg", t = "add" → true

## Approach

Track mappings in both directions. If a character in one string maps to different characters, or two characters map to the same character, the strings are not isomorphic.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](205.Isomorphic_String.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1) for a fixed character set`

---
[Back to the DSA problem index](../README.md)
