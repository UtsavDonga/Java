import java.util.ArrayList;
import java.util.Scanner;

public class DeleteArrayElement {
    static int[] deleteElement(int idx, int[] array) {
        if (idx < 0 || idx >= array.length) {
            System.out.println("Index is not present");
            return array; // Return the original array if index is out of bounds
        }
        
        // Create a new array with one less element
        int[] newArray = new int[array.length - 1];
        
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == idx) continue; // Skip the element at the index to be deleted
            newArray[j++] = array[i]; // Copy the elements to the new array
        }
        return newArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] array = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the index of the element to remove:");
        int idx = sc.nextInt();

        sc.close();

        System.out.println("New array after deletion:");
        int[] newArray = deleteElement(idx, array);
        for (int element : newArray) {
            System.out.print(element + " ");
        }
    }
}
