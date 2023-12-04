# LinkedList Java Implementation

A simple and versatile implementation of a singly linked list in Java. This LinkedList class provides essential functionalities for manipulating linked lists, making it easy to integrate into your Java projects.

## Overview

This repository contains a Java implementation of a linked list data structure. It offers a flexible and efficient way to manage sequences of elements. The LinkedList class supports various operations, allowing you to customize it based on your application's needs.

### LinkedList Class Source Code

You can find the source code for the `LinkedList` class [here](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.04_LinkedList/LinkedList/src/LinkedList.java). Dive into the implementation to understand how the linked list is structured and how each operation is performed.

### Main Class Source Code

The source code for the `Main` class, which includes example usage of the `LinkedList` class, can be found [here](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.04_LinkedList/LinkedList/src/Main.java). This class serves as a practical guide on how to leverage the `LinkedList` implementation in your projects.

## Features

- **Dynamic Size:** The linked list can dynamically grow or shrink as elements are added or removed.
- **Efficient Operations:** Add, remove, and access elements with time complexity suitable for various applications.
- **Versatile API:** A rich set of methods to manipulate elements, including adding, removing, finding, and modifying.
- **Clear and Concise:** The code is well-organized, making it easy to understand and integrate into your projects.

## Usage

To use this linked list in your Java project, clone the repository, and include the `LinkedList.java` file. Adjust the package name and import it into your code.

```java
// Example import statement
import your.package.name.LinkedList;

// Your code here
```

## Methods

Here are some of the key methods provided by the `LinkedList` class:

- `isEmpty()`: Check if the linked list is empty.
- `addFirst(int value)`: Add an element to the front of the linked list.
- `addLast(int value)`: Add an element to the end of the linked list.
- `removeFirst()`: Remove the first element in the linked list.
- `removeLast()`: Remove the last element in the linked list.
- `getBeforeLast()`: Get the node before the last node in the linked list.
- `indexOf(int value)`: Find the index of the first occurrence of a value.
- `contains(int value)`: Check if the linked list contains a specified value.
- `size()`: Get the size (number of elements) of the linked list.
- `printLinkedList()`: Print the elements of the linked list.

## Example

```java
// Example usage of the LinkedList class

public class Main {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        
        linkedList.addFirst(2);
        linkedList.addFirst(1);
        linkedList.addLast(3);
        linkedList.addLast(4);

        linkedList.printLinkedList();
    }
}
```

## Additional Resources
- [LinkedList Class Source Code](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.04_LinkedList/LinkedList/src/LinkedList.java) 
- [Main Class Source Code](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.04_LinkedList/LinkedList/src/Main.java)

Feel free to explore and integrate this `LinkedList` implementation into your Java projects. We welcome contributions, feedback, and bug reports.
