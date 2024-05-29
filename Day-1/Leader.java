import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class Leader {
    public static void main(String[] args) {
        int size ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array");
        size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter a array element");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        ArrayList<Integer> Leader = new ArrayList<Integer>();

        int maxnum = array[size-1];
        Leader.add(maxnum);

        for (int i = size-2; i >= 0; i--) {
            if (array[i]>maxnum) {
                maxnum = array[i];
                Leader.add(maxnum);
            }
        }
        System.out.println(Leader.toString() +" this a Leader amond array");
    }
}
