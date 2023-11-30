public class Main {

    public static void main(String[] args) {
        // Create a DynamicArray with the default capacity
        DynamicArray dynamicArray = new DynamicArray();

        // Add elements to the array
        dynamicArray.add(10);
        dynamicArray.add(5);
        dynamicArray.add(8);

        // Print the current array
        System.out.println("Original Array:");
        dynamicArray.printArray();

        // Test various functions
        System.out.println("Capacity: " + dynamicArray.getCapacity());
        System.out.println("Is Empty? " + dynamicArray.isEmpty());
        System.out.println("Is Full? " + dynamicArray.isFull());

        // Add more elements to trigger resizing
        dynamicArray.add(40);
        dynamicArray.add(12);
        dynamicArray.add(50);
        dynamicArray.add(15);
        dynamicArray.add(30);
        dynamicArray.add(25);
        dynamicArray.add(20);

        // Print the updated array
        System.out.println("\nUpdated Array after resizing:");
        dynamicArray.printArray();

        // Test other functions
        System.out.println("Capacity: " + dynamicArray.getCapacity());
        System.out.println("Is Full? " + dynamicArray.isFull());
        System.out.println();
        System.out.println("Min Element: " + dynamicArray.min());
        System.out.println("Max Element: " + dynamicArray.max());

        // Reverse the array
        dynamicArray.reverse();
        System.out.println("\nReversed Array:");
        dynamicArray.printArray();

        // Test get, indexOf, removeAt, and remove methods
        System.out.println("\nTesting get, indexOf, removeAt, and remove:");

        // Test get method
        int elementAtIndex2 = dynamicArray.get(2);
        System.out.println("Element at index 2: " + elementAtIndex2);

        // Test indexOf method
        int indexOfElement25 = dynamicArray.indexOf(25);
        System.out.println("Index of element 25: " + indexOfElement25);

        // Test removeAt method
        dynamicArray.removeAt(1);
        System.out.println("\nArray after removing element at index 1:");
        dynamicArray.printArray();

        // Test remove method
        dynamicArray.remove(20);
        System.out.println("\nArray after removing element 20:");
        dynamicArray.printArray();

        // Clear the array
        dynamicArray.clear();
        System.out.println("\nArray after clearing:");
        dynamicArray.printArray();
    }
}
