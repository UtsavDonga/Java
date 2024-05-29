import java.util.Scanner;

public class MyAutomporphicNo {
    public static void main(String[] args) {
        int num ;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Number");
        num = sc.nextInt();

        // Square
        int square = num * num ;

        //count the digit of the square
        int temp = num ;
        int count = 0 ;
        while(temp != 0){
            temp %= 10;
            count++;
            temp /= 10;
        }

        //extract last digits fo square
        int divisor = 1 ;
        for (int i = 0; i < count; i++) {
            divisor *= 10 ;
        }

        int lastNDigits = square % divisor;

        //comapre last digits
        if (lastNDigits == num) {
            System.out.println("number is Automorphic number");
        }
        else{
            System.out.println("number is not a Automorphic number");
        }



    }
}
