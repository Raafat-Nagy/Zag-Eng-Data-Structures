# Generic Stack Java Implementation

This Java implementation introduces a generic stack data structure implemented with a linked list, adhering to the Last In, First Out (LIFO) principle where elements are added and removed from the top.

## Node Class

The `Node` class acts as the foundational building block for the linked list, forming the core structure of the stack.

- **Attributes:**
  - `E value`: Holds the data stored in the node (generic type).
  - `Node next`: Indicates the next node in the linked list.
- **Constructor:**
  - `Node(E value)`: Initializes a node with the provided value.
- **Purpose:**
  - Establishes the essential structure of the linked list implemented in the stack.
  - Contains the data element and a reference to the next node.

## Stack Class

The `Stack` class represents the actual stack and includes methods for stack operations.

- **Attributes:**
  - **`size`**: Represents the count of elements in the stack. It dynamically adjusts as elements are added or removed.
  - **`top`**: Points to the top of the stack, indicating the most recently added element. When the stack is empty, `top` is set to `null`.

- **Overview of Functions:**
  - **`isEmpty()`**
     - **Function:** Verifies if the stack is empty.
     - **Implementation:** Checks whether the `top` reference is `null`.
     - **Purpose:** Enables users to determine if the stack contains any elements.

  - **`push(E value)`**
     - **Function:** Adds a new element to the top of the stack.
     - **Implementation:** Creates a new node with the provided value and inserts it at the top of the stack.
     - **Purpose:** Facilitates the seamless addition of elements to the stack.

  - **`checkEmptyStack()`**
     - **Function:** Helper method to confirm if the stack is empty.
     - **Implementation:** Throws an `EmptyStackException` if the stack is empty.
     - **Purpose:** Internally ensures that operations like `pop` or `peek` are exclusively performed on non-empty stacks.

  - **`peek()`**
     - **Function:** Retrieves the value at the top of the stack without removing it.
     - **Implementation:** Returns the value of the top node.
     - **Purpose:** Allows users to inspect the top element of the stack without modifying the stack itself.

  - **`pop()`**
     - **Function:** Removes and returns the value at the top of the stack.
     - **Implementation:** Removes the top node from the stack and returns its value.
     - **Purpose:** Empowers users to retrieve and remove the top element from the stack.

  - **`size()`**
     - **Function:** Provides the count of elements in the stack.
     - **Implementation:** Returns the `size` variable, tracking the number of elements.
     - **Purpose:** Offers a straightforward way to determine the quantity of elements in the stack.

## Usage

To seamlessly integrate this generic stack implementation into your Java projects, refer to the relevant code in the following links:

- [**Stack Class**](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.06_Stack/StackBasedOnLinkedList/src/Stack.java)
  
- [**Main Class**](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.06_Stack/StackBasedOnLinkedList/src/Main.java)

Feel free to incorporate this stack implementation when in need of a Last In, First Out data structure in your Java applications.
