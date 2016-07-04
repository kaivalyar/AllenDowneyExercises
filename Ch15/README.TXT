------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:                  Chapter 15: Stacks
VERSION or DATE:                1.0
AUTHOR:                         Kaivalya Rawal


15.15 Exercises
================================================================================
Exercise 15.1 Write a method named reverse that takes an array of integers,
traverses the array pushing each item onto a stack, and then pops the items off the
stack, putting them back into the array in the reverse of their original order.
DONE IN Reverse.java

Exercise 15.2 This exercise is based on the solution to Exercise 14.1. Start by
making a copy of your implementation of IntList called LinkedList.
a. Transform the linked list implementation into a generic list by making the cargo
an Object instead of an integer. Modify the test code accordingly and run the
program.
DONE IN LinkedList.java AND Node.java

b. Write a LinkedList method called split that takes a String, breaks it up into
words (using spaces as delimiters), and returns a list of Strings, with one word
per list node. Your implementation should be efficient, meaning that it takes
time proportional to the number of words in the string.
DONE IN LinkedList.java

c. Write a LinkedList method named join that returns a String that contains the
String representation of each of the objects in the list, in the order they appear,
with spaces in between.
DONE IN LinkedList.java

d. Write a toString method for LinkedList.
DONE IN LinkedList.java

Exercise 15.3 Write an implementation of the Stack ADT using your LinkedList
implementation as the underlying data structure. There are two general approaches
to this: the Stack might contain a LinkedList as an instance variable, or the Stack
class might extend the LinkedList class. Choose whichever sounds better to you, or,
if you are feeling ambitious, implement both and compare them.
DONE IN Stack.java(without inheritance) AND Stack2.java(with inheritance-increases brevity and complexity)

Exercise 15.4 Write a program called Balance.java that reads a file and checks
that the parentheses () and brackets [] and squiggly-braces {} are balanced and
nested correctly.
DONE IN Balance.java

Exercise 15.5 Write a method called evalPostfix that takes a String containing a
postfix expression and returns a double that contains the result. You can use a String-
Tokenizer to parse the String and a Stack of Doubles to evaluate the expression.
DONE IN Postfix.java

Exercise 15.6 Write a program that prompts the user for a mathematical expres-
sion in postfix and that evaluates the expression and prints the result. The following
steps are my suggestion for a program development plan.

a. Write a program that prompts the user for input and prints the input string,
over and over, until the user types “quit”. See Section C for information about
getting input from the keyboard. You can use the following code as a starter:
public static void inputLoop () throws IOException {
BufferedReader stdin =
new BufferedReader (new InputStreamReader (System.in));
while (true) {
System.out.print ("=>"); // print a prompt
String s = stdin.readLine(); // get input
if (s == null) break;
// check if s is "quit"
// print s
}
}
DONE IN Postfix.java

b. Identify helper methods you think will be useful, and write and debug
them in isolation. Suggestions: isOperator, isOperand, parseExpression,
performOperation.
NO METHODS IDENTIFIED - REFER 15.5

c. We know we want to push int values onto the stack and pop them off, which
means we will have to use a wrapper class. Make sure you know how to do that,
and test those operations in isolation. Maybe make them helper methods.
NOT REQUIRED - REFER 15.5

d. Write a version of evaluate that only handles one kind of operator (like addi-
tion). Test it in isolation.
NOT REQUIRED - REFER 15.5

e. Connect your evaluator to your input/output loop.
NOT REQUIRED - REFER 15.5

f. Add the other operations.
NOT REQUIRED - REFER 15.5

g. Once you have code that works, you might want to evaluate the structural
design. How should you divide the code into classes? What instance variables
should the classes have? What parameters should be passed around?
COULDN'T BE DONE - 15.6 (b) (c) (d) (e) (f) WERE SKIPPED!

h. In addition to making the design elegant, you should also make the code bullet-
proof, meaning that is should not cause an exception under any circumstances,
even if the user types something weird.






