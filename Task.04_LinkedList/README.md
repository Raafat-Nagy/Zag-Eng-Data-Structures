# LinkedList Java Implementation

This repository presents a comprehensive and adaptable implementation of a singly linked list in Java. The `LinkedList` class included in this project offers fundamental functionalities for handling linked lists, making it a versatile addition to your Java projects.

## Overview

The Java implementation in this repository encapsulates a linked list data structure. It provides a versatile and efficient approach to managing sequences of elements. The `LinkedList` class supports a variety of operations, enabling customization to suit the specific requirements of your application.

## Key Features

### Node Class

- Represents an element in the linked list.
- Contains an integer value (`value`) and a reference to the next node (`next`).

### LinkedList Class

#### Private Attributes

- `head`: Points to the first node in the list.
- `tail`: Points to the last node in the list.
- `size`: Number of elements in the list.

#### Public Methods

- `isEmpty()`: Checks if the linked list is empty.
- `addFirst(int value)`: Adds a new node with the given value to the beginning of the linked list.
- `addLast(int value)`: Adds a new node with the given value to the end of the linked list.
- `removeFirst()`: Removes the first node in the linked list.
- `removeLast()`: Removes the last node in the linked list.
- `indexOf(int value)`: Finds the index of the first occurrence of the specified value in the linked list.
- `contains(int value)`: Checks if the linked list contains the specified value.
- `size()`: Returns the size (number of elements) of the linked list.
- `printLinkedList()`: Prints the elements of the linked list in order.
- `clear()`: Clears all elements from the linked list.
- `set(int index, int value)`: Sets the value of the node at the specified index to the given value.
- `removeAt(int index)`: Removes the node at the specified index in the linked list.
- `remove(int value)`: Removes the first occurrence of the specified value in the linked list.
- `min()`: Finds and returns the minimum value in the linked list.
- `max()`: Finds and returns the maximum value in the linked list.
- `reverse()`: Reverses the linked list.

## Resources

- [LinkedList Class Source Code](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.04_LinkedList/LinkedList/src/LinkedList.java) 
- [Main Class Source Code](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.04_LinkedList/LinkedList/src/Main.java)

Feel free to explore and integrate this `LinkedList` implementation into your Java projects. We welcome contributions, feedback, and bug reports. Happy coding!
