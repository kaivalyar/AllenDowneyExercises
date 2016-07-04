------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:                  Chapter 17: Trees
VERSION or DATE:                1.0
AUTHOR:                         Kaivalya Rawal


17.12 Exercises
================================================================================
Exercise 17.1 Write a version of printPreorder called visitPreorder that tra-
verses the tree and invokes visit on each node in preorder.
DONE IN Tree.java

Exercise 17.2 Write a class named PreIterator that implements the Iterator
interface, and write a method named preorderIterator for the Tree class that returns
a PreIterator that selects the elements of the Tree in preorder.
DONE IN PreIterator.java AND Tree.java

Exercise 17.3
a. What is the value of the postfix expression 1 2 + 3 *?
b. What is the postfix expression that is equivalent to the infix expression 1 + 2
* 3?
c. What is the value of the postfix expression 17 1 - 5 /, assuming that / per-
forms integer division?
ANS: a. 9; b. "1 2 3 * +"; c. 3

Exercise 17.4 The height of a tree is the longest path from the root to any leaf.
Height can be defined recursively as follows:
• The height of a null tree is 0.
• The height of a non-null tree is 1 + max (leftHeight, rightHeight), where
leftHeight is the height of the left child and rightHeight is the height of the
right child.
Write a method named height that calculates the height of the Tree provided as a
parameter.
DONE IN Tree.java

Exercise 17.5 Imagine we define a Tree that contains Comparable objects as
cargo:
    public class ComparableTree {
        Comparable cargo;
        Tree left, right;
    }
Write a Tree class method named findMax that returns the largest cargo in the tree,
where “largest” is defined by compareTo.
DONE IN ComparableTree.java

Exercise 17.6 A binary search tree is a special kind of tree where, for every node N:
all the cargo in the left subtree of N < the cargo in node N and
the cargo in node N < all the cargo in the right subtree of N
Using the following class definition, write an object method called contains that takes
an Object as an argument and that returns true if the object appears in the tree or
false otherwise. You can assume that the target object and all the objects in the tree
are Comparable.
    public class SearchTree {
        Comparable cargo;
        SearchTree left, right;
    }
DONE IN SearchTree.java

Exercise 17.7 In mathematics, a set is a collection of elements that contains
no duplicates. The interface java.util.Set is intended to model a mathematical set.
The methods it requires are add, contains, containsAll, remove, size, and iterator.
Write a class called TreeSet that extends SearchTree and that implements Set. To
keep things simple, you can assume that null does not appear in the tree or as an
argument to any of the methods.
DONE IN TreeSet.java PRECONDITION: NO null CARGO ELEMENTS

Exercise 17.8 Write a method called union that takes two Sets as parameters and
returns a new TreeSet that contains all the elements that appear in either Set.
You can add this method to your implementation of TreeSet, or create a new class
that extends java.util.TreeSet and provides union.
DONE IN TreeSet.java

Exercise 17.9 Write a method called intersection that takes two Sets as param-
eters and returns a new TreeSet that contains all the elements that appear in both
Sets.
union and intersection are generic in the sense that the parameters can be any type
in the metaclass Set. The two parameters don’t even have to be the same type.
DONE IN TreeSet.java

Exercise 17.10 One of the reasons the Comparable interface is useful is that
it allows an object type to specify whatever ordering is appropriate. For types like
Integer and Double, the appropriate ordering is obvious, but there are lots of examples
where the ordering depends on what the objects are supposed to represent. In golf,
for example, a low score is better than a high score; if we compare two Golfer objects,
the one with the lower score wins.

a. Write a definition of a Golfer class that contains a name and an integer score
as instance variables. The class should implement Comparable and provide a
compareTo method that gives higher priority to the lower score.
DONE IN Golfer.java

b. Write a program that reads a file containing the names and scores of a set of
golfers. It should create Golfer objects, put them in a Priority Queue and then
take them out and print them. They should appear in descending order of
priority, which is increasing order by score.
Tiger Woods 61
Hal Sutton 69
Phil Mickelson 72
Allen Downey 158
DONE IN Golfer.java

Exercise 17.11 Write an implementation of a Stack using a Vector. Think about
whether it is better to push new elements onto the beginning or the end of the Vec-
tor.
DONE IN Stack.java PUSHES NEW OBJECT ONTO THE BEGINNING OF THE VECTOR
