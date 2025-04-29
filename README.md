Assignment Objectives

By the end of this assignment, you should be able to:

    Understand what arrays are.
    Declare, initialize, and access array elements.
    Perform basic operations on arrays such as traversing, updating, and manipulating array elements.

Part 1: Understanding Arrays

What is an Array?

An array is a collection of variables of the same type, stored in a contiguous memory location. It can hold multiple values in a single variable, which makes it easier to manage large amounts of data.

Key Points:

    Fixed Size: The size of an array is defined when it is created and cannot be changed.
    Indexed Access: Array elements are accessed using their index, which starts from 0.

Example:

// Declare an array of integers

int[] numbers;

// Initialize the array with 5 elements

numbers = new int[5];

// Access and assign values to array elements

numbers[0] = 10;

numbers[1] = 20;

numbers[2] = 30;

numbers[3] = 40;

numbers[4] = 50;

// Print the first element of the array

System.out.println(numbers[0]); // Output: 10

Part 2: Declaring and Initializing Arrays

Declaration:

To declare an array in Java, you specify the data type of its elements followed by square brackets `[]` and the array name.

int[] arrayName;

Initialization:

You can initialize an array at the time of declaration or later in your code.

// At the time of declaration

int[] arrayName = new int[5];

// Later in the code

arrayName = new int[5];

Combining Declaration and Initialization:

int[] arrayName = {1, 2, 3, 4, 5};

Exercise:

Declare and initialize an array of 5 double values. Assign values to each element and print them.

Part 3: Traversing and Updating Arrays

You can traverse an array using a `for` loop, `for-each` loop, or while loop.

Using a `for` Loop:

for (int i = 0; i < arrayName.length; i++) {

    System.out.println(arrayName[i]);

}

Updating Array Elements:

You can update elements of an array using their index.

arrayName[2] = 100;

Exercise:

    Create an array of 5 integers.
    Initialize the array with values.
    Update the third element to a new value.
    Print all elements of the array.

Part 4: Common Array Operations

Finding the Length of an Array:

Use the `.length` property to get the number of elements in an array.

int length = arrayName.length;

Exercise:

Write a program to:

    Create an array of 10 integers.
    Fill the array with multiples of 3.
    Print the length of the array and all its elements.

Summary

    Arrays are a collection of elements of the same type.
    Elements are accessed using indices, starting from 0.
    Arrays have a fixed size defined at the time of creation.
    You can declare, initialize, traverse, and update arrays using various methods in Java.
