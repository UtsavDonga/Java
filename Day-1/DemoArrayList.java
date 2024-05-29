import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class DemoArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = sc.nextInt();

        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        System.out.println("Enter a Array Element");
        for (int i = 0; i < num; i++) {
            int element = sc.nextInt();
            arraylist.add(element);
        }
        // add element at any place
        arraylist.add(2, 5);

        // after add elemnet
        System.out.println(arraylist);

        // after remove elemnet
        arraylist.remove(2);

        //print arrayist
        System.out.println(arraylist);
    }
}