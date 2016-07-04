------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:                  Chapter 18: Heaps
VERSION or DATE:                1.0
AUTHOR:                         Kaivalya Rawal


18.12 Exercises
================================================================================
Exercise 18.1 Write a method that takes a Tree as a parameter and checks whether
it is complete.
DONE IN Heap.java

Exercise 18.2 Write a method that takes a Tree as a parameter and checks whether
it has the heap property.
DONE IN Heap.java

Exercise 18.3
a. Draw the Heap represented by the following array.
79 60 65 56 57 18 20 14 28 20
b. Show what the array would look like after the value 68 is added to the Heap.
DONE IN THE NOTEBOOK

Exercise 18.4 Assume that there are n elements in a Heap. To find the median
value of the elements, we could remove n/2 − 1 elements and then return the value of
the n/2-eth element. Then we would have to put n/2 elements back into the Heap.
What would be the order of growth of this algorithm?
DONE IN THE NOTEBOOK

Exercise 18.5 How many times will the following loop execute? Express your
answer as a function of n:
    while (n > 1) {
            n = n / 2;
    }
DONE IN THE NOTEBOOK

Exercise 18.6 How many recursive calls will zippo make? Express your answer
as a function of x or n or both.
    public static double zippo (double x, int n) {
        if (n == 0) return 1.0;
        return x * zippo (x, n-1);
    }
DONE IN THE NOTEBOOK

Exercise 18.7 Write an implementation of a Heap based on the array implementa-
tion of a tree. The run time of the add and remove operations should be proportional
to log n, where n is the number of elements in the Heap.
DONE IN Heap.java
