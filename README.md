[![Codacy Badge](https://api.codacy.com/project/badge/Grade/2415304421124c9dbf0e2aa4b07cacdd)](https://app.codacy.com/app/nikalomiris/algorithms?utm_source=github.com&utm_medium=referral&utm_content=nikalomiris/algorithms&utm_campaign=Badge_Grade_Dashboard)
# Algorithms [![Build Status](https://travis-ci.org/nikalomiris/algorithms.svg?branch=master)](https://travis-ci.org/nikalomiris/algorithms)

This repository contains the implementation of various algorithms.

Clone the project and run ```mvn clean install```

### Sorting algorithms
The implementation of various sorting algorithms:

##### Insertion sort
Implements the following pseudocode:
```
for j = 1 to A.length
    key = A[j]
    // Insert A[j] into the sorted sequence A[0..j-1]
    i = j - 1
    while i >= 0 and A[i] > key
        A[i + 1] = A[i]
        i = i - 1
    A[i + 1] = key
```
There are tests that measure the execution time of best, average and worst case inputs.

Run ```mvn -Dtest=InsertionSortTest#sort test``` in order to run 
the insertion sort test and print the execution times in the console