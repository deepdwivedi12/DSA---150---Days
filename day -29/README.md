# Nim Game

**Topic:** Math / Game Theory

## Problem Description

Determine whether the first player can win when players remove 1–3 stones and the player taking the last stone wins.

## Example

Input: n = 4 → false; n = 5 → true

## Approach

The first player loses exactly when the starting number is divisible by 4, assuming optimal play. Return n % 4 != 0.

## Dry Run

Use the example above and trace the variables one step at a time. At each iteration, note the current element, the values of the relevant pointers/counters/maps, and how the answer changes. This makes it easier to verify the algorithm before submitting it.

## Java Solution

[Open Java solution](292. Nim Game.java)

Open the linked Java file to see the implementation saved in this repository. The exact code is kept in its existing location.

## Complexity Analysis

- **Time Complexity:** `O(1)`
- **Space Complexity:** `O(1)`

---
[Back to the DSA problem index](../README.md)
