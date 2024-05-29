import java.util.Scanner;

public class Searchinginarray {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Size of aray");
        int size = sc.nextInt();

        int[] array = new int[size];
        System.out.println("Enter a element of aray");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter Elment to find");
        int find = sc.nextInt();
        
        boolean flag = false ;
        for(int num : array){
            if (num == find) {
                flag = true;
                System.out.println("Fayri loop");
                break;
            }
        }
        if (flag==true) {
            System.out.println("Number is Present in array");
        }
        else{
            System.out.println("Number is not  Present in array");
        }
    }
}
