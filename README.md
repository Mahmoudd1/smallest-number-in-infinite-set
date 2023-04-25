# smallest-number-in-infinite-set
The SmallestInfiniteSet class is designed to handle a set of all positive integers [1, 2, 3, 4, 5, ...]. 
This class has three methods: SmallestInfiniteSet(), popSmallest(), and addBack(int num).

## Class methods

### SmallestInfiniteSet()
This method initializes the SmallestInfiniteSet object to contain all positive integers.

### popSmallest()
This method removes and returns the smallest integer contained in the infinite set.

### addBack(int num)
This method adds a positive integer num back into the infinite set, if it is not already in the infinite set.

## Usage
You can use the SmallestInfiniteSet class to perform operations on the infinite set of all positive integers.


## Approach 
To implement the SmallestInfiniteSet class, we need to maintain a data structure that allows us to efficiently pop the smallest element from the set, and add new elements to the set. One possible data structure that can be used to achieve this is a min-heap.

A min-heap is a binary tree where the value of each node is less than or equal to the values of its children. In a min-heap, the root node always contains the smallest value in the tree. By using a min-heap to store our infinite set of integers, we can always pop the smallest element by removing the root node of the heap, and we can add new elements to the set by inserting them into the heap.
