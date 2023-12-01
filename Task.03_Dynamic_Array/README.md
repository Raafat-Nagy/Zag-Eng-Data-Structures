# DynamicArray Java Implementation

This repository contains a Java implementation of a dynamic array, providing a flexible and resizable array structure. The `DynamicArray` class allows you to efficiently manage a collection of elements, dynamically adjusting its size as elements are added or removed.

## Features

- **Dynamic Sizing:** The array automatically adjusts its capacity to accommodate a varying number of elements.
- **Efficient Operations:** Optimized methods for adding, removing, and accessing elements.
- **Array Manipulation:** Functions for reversing the array, finding the minimum and maximum elements, and more.
- **Comprehensive Testing:** The `Main` class includes a suite of tests demonstrating the functionality of the `DynamicArray` class.

## DynamicArray Class Functions

The `DynamicArray` class provides the following functions for managing dynamic arrays:

### General Information

#### Constructors

- [`DynamicArray()`](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.03_Dynamic_Array/DynamicArray/src/DynamicArray.java#L16): Default constructor initializes the array with the default capacity.
- [`DynamicArray(int initialCapacity)`](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.03_Dynamic_Array/DynamicArray/src/DynamicArray.java#L22): Parameterized constructor allows setting an initial capacity for the array.

#### Capacity and Status

- [`getCapacity()`](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.03_Dynamic_Array/DynamicArray/src/DynamicArray.java#L28): Returns the current capacity of the dynamic array.
- [`isEmpty()`](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.03_Dynamic_Array/DynamicArray/src/DynamicArray.java#L33): Checks if the dynamic array is empty.
- [`isFull()`](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.03_Dynamic_Array/DynamicArray/src/DynamicArray.java#L38): Checks if the dynamic array is full.
- [`resizeArray()`](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.03_Dynamic_Array/DynamicArray/src/DynamicArray.java#L43): Resizes the array when it is full, doubling its capacity.

#### Element Manipulation

- [`add(int element)`](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.03_Dynamic_Array/DynamicArray/src/DynamicArray.java#L55): Adds an element to the dynamic array.
- [`isValidIndex(int index)`](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.03_Dynamic_Array/DynamicArray/src/DynamicArray.java#L64): Checks if the given index is valid.
- [`get(int index)`](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.03_Dynamic_Array/DynamicArray/src/DynamicArray.java#L69): Gets an element at a specified index.
- [`indexOf(int element)`](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.03_Dynamic_Array/DynamicArray/src/DynamicArray.java#L77): Finds the index of a specific element.
- [`removeAt(int index)`](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.03_Dynamic_Array/DynamicArray/src/DynamicArray.java#L86): Removes an element at a specified index.
- [`remove(int element)`](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.03_Dynamic_Array/DynamicArray/src/DynamicArray.java#L98): Removes a specific element from the array.
- [`clear()`](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.03_Dynamic_Array/DynamicArray/src/DynamicArray.java#L107): Clears all elements from the dynamic array.

#### Array Analysis

- [`min()`](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.03_Dynamic_Array/DynamicArray/src/DynamicArray.java#L113): Finds the minimum element in the array.
- [`max()`](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.03_Dynamic_Array/DynamicArray/src/DynamicArray.java#L124): Finds the maximum element in the array.

#### Array Manipulation

- [`printArray()`](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.03_Dynamic_Array/DynamicArray/src/DynamicArray.java#L134): Prints the elements of the array.
- [`reverse()`](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.03_Dynamic_Array/DynamicArray/src/DynamicArray.java#L141): Reverses the order of elements in the array.


## How to Use

1. **Create an Instance:**

To use the `DynamicArray` class, you can create an instance using the default constructor or provide an initial capacity:

```java
// Create a DynamicArray instance with the default capacity (5)
DynamicArray dynamicArrayDefault = new DynamicArray();
```

```java
// Create a DynamicArray instance with a specified initial capacity (e.g., 10)
DynamicArray dynamicArrayCustom = new DynamicArray(10);
```

2. **Add Elements:**
   
   Adding elements to the `DynamicArray` is a straightforward process. The `add(int element)` method allows you to insert new elements into the array.
   
    ```java
    // Add elements to the array
    dynamicArray.add(8);
    dynamicArray.add(5);
    dynamicArray.add(2);
    ```

4. **Access and Manipulate**

Once elements are added to the `DynamicArray`, you can perform various operations to access and manipulate its contents.

```java
// Get an Element at a Specific Index
int elementAtIndex = dynamicArray.get(1);
```

```java
// Remove a Specific Element
dynamicArray.remove(5);
```

```java
// Remove an Element at a Specific Index
dynamicArray.removeAt(1);
```

4. **Testing:**
    Explore the `Main` class to see comprehensive testing of various functionalities.

## A small usage example

```java
public class Main {

    public static void main(String[] args) {
        // Create a DynamicArray instance with the default capacity
        DynamicArray dynamicArray = new DynamicArray();

        // Add elements to the array
        dynamicArray.add(10);
        dynamicArray.add(5);

        // Print the original array
        System.out.println("Original Array:");
        dynamicArray.printArray();

        // Explore and test various functions
        System.out.println("Capacity: " + dynamicArray.getCapacity());
        System.out.println("Is Empty? " + dynamicArray.isEmpty());
        System.out.println("Is Full? " + dynamicArray.isFull());

        // ... (Continue exploring other functions and testing)

        // Clear the array
        dynamicArray.clear();
        System.out.println("\nArray after clearing:");
        dynamicArray.printArray();
    }
}
```

## Additional Resources

- [DynamicArray Class Source Code](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.03_Dynamic_Array/DynamicArray/src/DynamicArray.java)
- [Main Class Source Code](https://github.com/Raafat-Nagy/Zag-Eng-Data-Structures/blob/main/Task.03_Dynamic_Array/DynamicArray/src/Main.java)

Feel free to explore and integrate this `DynamicArray` implementation into your Java projects. We welcome contributions, feedback, and bug reports.
