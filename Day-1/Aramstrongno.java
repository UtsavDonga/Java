import java.util.Scanner;

public class Aramstrongno {
    public static void main(String[] args) {
        int num , temp , digit , sum = 0 ;
        int count = 0;
        
        // taking input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to chacke whether the number is Armstrong or not");
        num = sc.nextInt();

        temp = num;

        // count the no of digits
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        temp = num;


        // Computing the sum of cubes of digits
        while (temp != 0) {
            digit = temp % 10;
            int digitCube = 1 ;
            for (int i = 0; i < count; i++) {
                digitCube *= digit;
            }
            sum = sum + digitCube;
            temp = temp/10;
        }

        if (num == sum) {
            System.out.println("number " + num + " is Aramstong Number");
        } else {
            System.out.println("number " + num + " is not Aramstong Number");
        }
    }
}
