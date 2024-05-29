import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Meargetwoarray {
    static void Searchinginarray(int array1[] ,int array2[]){
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int num : array1){
            arrayList.add(num);
        }
        for(int num : array2){
            arrayList.add(num);
        }

        System.out.println(arrayList);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Size of aray");
        int size = sc.nextInt();

        int[] array1 = new int[size];
        System.out.println("Enter a 1st element of aray");
        for (int i = 0; i < size; i++) {
            array1[i] = sc.nextInt();
        }
        int[] array2 = new int[size];
        System.out.println("Enter a 2nd element of aray");
        for (int i = 0; i < size; i++) {
            array2[i] = sc.nextInt();
        }
        sc.close();

        Searchinginarray(array1, array2);


    }
}
