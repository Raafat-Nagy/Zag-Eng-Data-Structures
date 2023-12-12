# Generic Stack Java Implementation

This Java code provides an implementation of a stack data structure using a **dynamic array**. The stack follows the Last In, First Out (LIFO) principle, allowing elements to be added and removed from the top.

## Stack Class

The `Stack` class is responsible for managing the stack operations. Here's an overview:

- **Attributes:**
  - `DEFAULT_CAPACITY`: The default initial capacity of the stack.
  - `RESIZE_FACTOR`: The factor by which the array capacity is increased when the stack is full.
  - `elements`: An array to store the elements of the stack.
  - `capacity`: The current capacity of the stack.
  - `lastElement`: Index representing the position of the last element in the stack.

- **Constructors:**
  - `Stack()`: Initializes the stack with the default capacity.
  - `Stack(int capacity)`: Initializes the stack with a specified capacity.

- **Methods:**
  - **`isEmpty()`**
     - **Function:** Checks if the stack is empty.
     - **Implementation:** Returns `true` if the `lastElement` is 0; otherwise, returns `false`.

  - **`isFull()`**
     - **Function:** Checks if the stack is full.
     - **Implementation:** Returns `true` if `lastElement` is equal to the capacity; otherwise, returns `false`.

  - **`resizeArray()`**
     - **Function:** Increases the capacity of the array when the stack is full.
     - **Implementation:** Creates a new array with increased capacity and copies existing elements to the new array.

  - **`push(int element)`**
     - **Function:** Adds an element to the top of the stack.
     - **Implementation:** Checks if the stack is full; if so, it resizes the array. Then, it adds the element to the `lastElement` position.

  - **`checkEmptyStack()`**
     - **Function:** Helper method to validate if the stack is empty before pop or peek operations.
     - **Implementation:** Throws an `EmptyStackException` if the stack is empty.

  - **`pop()`**
     - **Function:** Removes and returns the element at the top of the stack.
     - **Implementation:** Checks if the stack is empty, then retrieves and returns the element at the `lastElement - 1` index.

  - **`peek()`**
     - **Function:** Retrieves the element at the top of the stack without removing it.
     - **Implementation:** Checks if the stack is empty, then retrieves and returns the element at the `lastElement - 1` index.

  - **`size()`**
     - **Function:** Returns the number of elements in the stack.
     - **Implementation:** Returns the value of `lastElement`.

## Usage

To seamlessly integrate this generic stack implementation into your Java projects, refer to the relevant code in the following links:

- [**Stack Class**](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.06_Stack/StackBasedOnArray/src/Stack.java)
  
- [**Main Class**](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.06_Stack/StackBasedOnArray/src/Main.java)

Feel free to incorporate this stack implementation when in need of a Last In, First Out data structure in your Java applications.
