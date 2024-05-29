import java.util.ArrayList;
import java.util.Scanner;

public class Findelementarray {

    static void findelement(int[] array, int num) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                count++;
            }
        }

        if (count >= array.length / 3) {
            System.out.println("This number " + num + " appears more than N/3 times");
        } else {
            System.out.println("This number " + num + " does not appear more than N/3 times");
        }
    }

    public static void main(String[] args) {
        int size , element ; 
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size of array");
        size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter a Array element");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter a trageted element");
        element = sc.nextInt();

        findelement(array, element);
    }   
}
