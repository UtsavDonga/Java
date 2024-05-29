import java.util.Scanner;

public class ArraySorting {
    static void sortalgo(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int min_idx = i ;
            for (int j = i+1; j < array.length; j++) {
                //incresing order if ">" or decresing order if "<"
                if (array[j] < array[min_idx]) {
                    min_idx = j ;
                }
            }
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }   
        for(int num : array){
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Size of aray");
        int size = sc.nextInt();

        int[] array = new int[size];
        System.out.println("Enter a element of aray");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        //
        System.out.println("Sorted Algo");
        sortalgo(array);
    }
}
