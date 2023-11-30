public class DynamicArray {

    // Array to store elements
    int[] elements;

    // Maximum capacity of the dynamic array
    int capacity;

    // Index to keep track of the last element in the array
    int lastElement;

    // Constant for the default capacity
    private static final int DEFAULT_CAPACITY = 5;

    // Default constructor initializes the array with the default capacity
    DynamicArray() {
        elements = new int[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }

    // Parameterized constructor allows setting an initial capacity for the array
    DynamicArray(int initialCapacity) {
        elements = new int[initialCapacity];
        capacity = initialCapacity;
    }

    // Method to get the current capacity of the dynamic array
    public int getCapacity() {
        return capacity;
    }

    // Method to check if the dynamic array is empty
    public boolean isEmpty() {
        return lastElement == 0;
    }

    // Method to check if the dynamic array is full
    public boolean isFull() {
        return lastElement == capacity;
    }

    // Method to resize the array when it is full
    private void resizeArray() {
        capacity *= 2;
        int[] newArray = new int[capacity];

        // Copy elements to the new array
        for (int i = 0; i < lastElement; i++)
            newArray[i] = elements[i];

        elements = newArray;
    }

    // Method to add an element to the dynamic array
    public void add(int element) {
        if (isFull())
            resizeArray();

        elements[lastElement] = element;
        lastElement++;
    }

    // Method to check if the given index is valid
    private boolean isValidIndex(int index) {
        return (index >= 0 && index < lastElement);
    }

    // Method to get an element at a specified index
    public int get(int index) {
        if (isValidIndex(index))
            return elements[index];
        else
            throw new IllegalStateException("Index out of range");
    }

    // Method to find the index of a specific element
    public int indexOf(int element) {
        for (int i = 0; i < lastElement; i++)
            if (elements[i] == element)
                return i;

        return -1;
    }

    // Method to remove an element at a specified index
    public void removeAt(int index) {
        if (isValidIndex(index))
            // Shift elements to the left
            for (int i = index; i < lastElement - 1; i++)
                elements[i] = elements[i + 1];
        else
            throw new IllegalStateException("Index out of range");

        lastElement--;
    }

    // Method to remove a specific element
    public void remove(int element) {
        int index = indexOf(element);
        if (index != -1)
            removeAt(index);
        else
            throw new IllegalStateException("Element not found");
    }

    // Method to clear all elements from the dynamic array
    public void clear() {
        // Reset the last index to indicate an empty array
        lastElement = 0;
    }

    // Method to find the minimum element in the array
    public int min() {
        int min = elements[0];

        for (int i = 1; i < lastElement; i++)
            if (elements[i] < min)
                min = elements[i];

        return min;
    }

    // Method to find the maximum element in the array
    public int max() {
        int max = elements[0];
        for (int i = 1; i < lastElement; i++)
            if (elements[i] > max)
                max = elements[i];

        return max;
    }

    // Method to print the elements of the array
    public void printArray() {
        for (int i = 0; i < lastElement; i++)
            System.out.print(elements[i] + " ");
        System.out.println();
    }

    // Method to reverse the order of elements in the array
    public void reverse() {
        int end = (lastElement - 1) / 2;

        // Swap elements from the start to end
        for (int i = 0; i <= end; i++) {
            int temp = elements[i];
            elements[i] = elements[lastElement - 1 - i];
            elements[lastElement - 1 - i] = temp;
        }
    }
}
