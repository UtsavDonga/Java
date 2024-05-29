import java.util.Scanner;

public class NeonNo {
    public static void main(String[] args) {
        int num, square,digit ,  sum = 0;
        int originalNum; 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find wheter the number is Neon Or not");
        num = sc.nextInt();

        // Squer of number 
        square = num * num;

        //find dights of that squere
        while (square > 0) {
            
            digit = square%10;
            sum = sum + digit ;
            square /= 10 ; 
        }

        originalNum = num;
         //comapr the orignal and derived value
         if (sum == originalNum) {
            System.out.println("the number " +originalNum+ " is Neon");
         }
         else{
            System.out.println("the number " +originalNum+ " is not Neon");
         }
    }    
}

// Neon number is where the [ sum of ---> digit of -----> square of ----> numbere is equal to the number it self ]
//example of 9 its Neon     [ 9      ---> 8 + 1    -----> 9*9 = 81  ---->               9                        ] 