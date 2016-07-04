------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:                  Chapter 14: Linked Lists
VERSION or DATE:                1.0
AUTHOR:                         Kaivalya Rawal

14.13 Exercises
=========================================================================
Exercise 14.1

a. Write a method named removeFirst that removes the first node from a list and
returns its cargo.
DONE IN IntList.java

b. Write a method named set that takes an index, i, and an item of cargo, and
that replaces the cargo of the ith node with the given cargo.
DONE IN IntList.java AND Node.java

c. Write a method named add that takes an index, i, and an item of cargo, and
that adds a new node containing the given cargo in the ith position.
DONE IN IntList.java AND Node.java

d. Write a method named addLast that takes an item of cargo and adds it to the
end of the list.
DONE IN IntList.java

e. Write a method called reverse that modifies an IntList, reversing the order of
the nodes.
DONE IN IntList.java

f. Write a method named append that takes an IntList as a parameter and ap-
pends a copy of the nodes from the parameter list onto the current list. You
should be able to take advantage of code you have already written.
DONE IN IntList.java

g. Write a method named checkLength that returns true if the length field equals
the number of nodes in the list, and false otherwise. The method should not
cause an exception under any circumstances, and it should terminate even if the
list contains a loop.
DONE IN IntList.java
=============================================================================
Exercise 14.2
Write a method that compares two numbers represented as IntLists and returns 1 if
the first is larger, -1 if the second is larger, and 0 if they are equal.
DONE IN IntList.java