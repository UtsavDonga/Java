import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicate {
    static void remove(int array[]){
        int[] newArray =new int[array.length];
        for (int i = 0,j=i+1; i < newArray.length; i++) {
            if (array[i]==array[j]) {
                continue;
            }
            array[j++] = array[i];
        }
        System.out.println("New array after removing a Duplicate element");
        for(int x : array){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        int size ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size of array");
        size = sc.nextInt();
        
        System.out.println("Enter a array elemnet");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        remove(array);

    }
}
