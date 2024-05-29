import java.util.ArrayList;
import java.util.Scanner;

public class insertarray {
    static void insertarray(int array[], int idx, int num){
        for (int i = 0; i < array.length-1; i++) {
            if (i == idx) {
                array[i] = num ;
            }
        }
        for(int x : array){
            System.out.print(x);
    }}
    static void usingclases(int array[] , int idx , int num){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int akda : array){
            arrayList.add(akda);
        }
        arrayList.add(idx, num);
        System.out.println(arrayList);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Size of aray");
        int size = sc.nextInt();

        int[] array = new int[size];
        System.out.println("Enter a 1st element of aray");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        
        System.out.println("Enter a Index where you want to add element");
        int idx = sc.nextInt();

        System.out.println("Enter a element where you want to add element");
        int val = sc.nextInt();
        
        sc.close();

        System.out.println("Fisrt Approach Manualy");
        insertarray(array, idx, val);

        
        System.out.println("Second Approach using classes");
        usingclases(array, idx, val);
    }
}
