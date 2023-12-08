# Generic LinkedList Java Implementation

This repository provides a versatile and adaptable implementation of a singly linked list in Java. The `LinkedList` class included in this project offers fundamental functionalities for handling linked lists, making it a valuable addition to your Java projects.

## Overview

The Java implementation in this repository encapsulates a linked list data structure. It provides a versatile and efficient approach to managing sequences of elements. The `LinkedList` class supports a variety of operations, allowing customization to suit the specific requirements of your application.

## Key Features

### Node Class

- Represents an element in the linked list.
- Contains a generic value (`value`) and a reference to the next node (`next`).

### LinkedList Class

#### Private Attributes

- `head`: Points to the first node in the list.
- `tail`: Points to the last node in the list.
- `size`: Number of elements in the list.

#### Public Methods

- `isEmpty()`: Checks if the linked list is empty.
- `addFirst(T value)`: Adds a new node with the given value to the beginning of the linked list.
- `addLast(T value)`: Adds a new node with the given value to the end of the linked list.
- `removeFirst()`: Removes the first node in the linked list.
- `removeLast()`: Removes the last node in the linked list.
- `indexOf(T value)`: Finds the index of the first occurrence of the specified value in the linked list.
- `contains(T value)`: Checks if the linked list contains the specified value.
- `size()`: Returns the size (number of elements) of the linked list.
- `printLinkedList()`: Prints the elements of the linked list in order.
- `clear()`: Clears all elements from the linked list.
- `set(int index, T value)`: Sets the value of the node at the specified index to the given value.
- `removeAt(int index)`: Removes the node at the specified index in the linked list.
- `remove(T value)`: Removes the first occurrence of the specified value in the linked list.
- `min()`: Finds and returns the minimum value in the linked list.
- `max()`: Finds and returns the maximum value in the linked list.
- `reverse()`: Reverses the linked list.


## Simple Example

```java
// Example usage of the LinkedList class

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        linkedList.addFirst(2);
        linkedList.addFirst(1);
        linkedList.addLast(3);
        linkedList.addLast(4);

        linkedList.printLinkedList();
    }
}
```

## Additional Resources

- [LinkedList Class Source Code](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.05_Generic_LinkedList/Generic_LinkedList/src/LinkedList.java) 
- [Main Class Source Code](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.05_Generic_LinkedList/Generic_LinkedList/src/Main.java)

Feel free to explore and integrate this generic `LinkedList` implementation into your Java projects. We welcome contributions, feedback, and bug reports. Happy coding!
