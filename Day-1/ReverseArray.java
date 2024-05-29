import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Size of aray");
        int size = sc.nextInt();

        int[] array = new int[size];
        System.out.println("Enter a element of aray");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(array));

        int[] ReverseArray = new int[size];
        int start = 0 ;
        int end = size-1 ;

        for (int i = 0; i < size ; i++) {
            ReverseArray[start] = array[end];
            start++;
            end--;
        }

        System.out.println(Arrays.toString(ReverseArray));
        
        // Reverse the array in-place
        for (int i = 0; i < size / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }        
        System.out.println(Arrays.toString(array));
    }
}
